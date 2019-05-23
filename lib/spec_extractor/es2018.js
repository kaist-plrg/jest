loadSpec(() => {
  // JSZip setting
  zip = new JSZip();

  // Spec components
  let globalMethods = [];
  let grammar;
  let tys = [];

  // JSZip setting
  zip = new JSZip();

  // Global Methods
  ////////////////////////////////////////////////////////////////////////////
  let globalElementIds = [
    'sec-updateempty', // 6.2.3.4
    'sec-reference-specification-type', // 6.2.4
    'sec-property-descriptor-specification-type', // 6.2.5
    'sec-data-blocks', // 6.2.7
    'sec-abstract-operations', // 7
    'sec-lexical-environment-operations', // 8.1.2
    'sec-code-realms', // 8.2
    'sec-execution-contexts', // 8.3
    'sec-jobs-and-job-queues', // 8.4
    'sec-initializehostdefinedrealm', // 8.5
    'sec-runjobs', // 8.6
    'sec-agents' // 8.7
  ];
  for (let id of globalElementIds) {
    for (let elem of getElem(id).getElementsByTagName('emu-alg')) {
      let algo = getAlgo(elem);
      if (algo) {
        globalMethods.push(algo.name);
        algo.body.filename = `es2018/algorithm/${algo.name}.json`;
        save(algo.body, algo.body.filename);
      } else {
        console.error(elem);
      }
    }
  }

  // Grammar
  ////////////////////////////////////////////////////////////////////////////
  // get elements
  function getElem(id) { return document.getElementById(id) }

  // get productions from sections
  function getSection(name) {
    return Array.from(getElem(name).children)
      .filter(child => child.tagName == Prod.tag)
      .map(Prod.from)
  }

  // get production from an element
  function getProd(name) {
    return Prod.from(getElem(name));
  }

  // remove default white spcae and line terminators
  let spaceNames = new Set(['WhiteSpace', 'LineTerminator', 'LineTerminatorSequence', 'Comment'])
  let removedElems = [];
  for (let elem of document.getElementsByTagName('emu-production')) {
    if (spaceNames.has(elem.getAttribute('name'))) removedElems.push(elem);
  }
  removedElems.forEach(elem => elem.remove());

  // extract productions
  let lexProds = getSection('sec-lexical-grammar');
  lexProds = lexProds.concat([
    'prod-NotEscapeSequence',
    'prod-NotCodePoint',
    'prod-CodePoint'
  ].map(getProd));
  let prods = [];
  prods = prods.concat(getSection('sec-expressions'));
  prods = prods.concat(getSection('sec-statements'));
  prods = prods.concat(getSection('sec-functions-and-classes'));
  prods = prods.concat(getSection('sec-scripts-and-modules'));
  prods = prods.concat([
    'prod-AsyncGeneratorMethod',
    'prod-AsyncGeneratorDeclaration',
    'prod-AsyncGeneratorExpression',
    'prod-AsyncGeneratorBody',
    'prod-AssignmentRestProperty',
    'prod-SubstitutionTemplate',
    'prod-BindingRestProperty'
  ].map(getProd));

  // grammar
  grammar = new Grammar(lexProds, prods)

  // Grammar Methods
  ////////////////////////////////////////////////////////////////////////////
  let semMap = {};
  for (let prod of grammar.prods) {
    let lhs = prod.lhs;
    let i = 0;
    for (let rhs of prod.rhsList) {
      let names = [lhs.name + ':'];
      for (let token of rhs.tokens) {
        let newNames = [];
        if (token instanceof Terminal) names.forEach((name) => {
          newNames.push(name + token.term);
        });
        else if (token instanceof Nonterminal) names.forEach((name) => {
          if (token.optional) newNames.push(name);
          newNames.push(name + token.name);
        });
        else newNames = names;
        names = newNames;
      }
      let j = 0;
      for (name of names) {
        semMap[norm(name)] = { idx: i, subIdx: j, sem: rhs.semantics };
        j++;
      }
      i++;
    }
  }
  let grammarSections = [
    'sec-ecmascript-language-expressions', // 12
    'sec-ecmascript-language-statements-and-declarations', // 13
    'sec-ecmascript-language-functions-and-classes', // 14
    'sec-scripts' // 15.1
  ];
  let succ = 0;
  let fail = 0;
  for (let id of grammarSections) {
    let section = document.getElementById(id);
    for (let elem of section.getElementsByTagName('emu-alg')) {
      let algo = getAlgo(elem);
      if (algo) {
        let grammar = elem.previousElementSibling;
        if (grammar.tagName == 'EMU-GRAMMAR') {
          let rules = [];
          for (let prod of grammar.getElementsByTagName('emu-production')) {
            for (let rhs of prod.getElementsByTagName('emu-rhs')) {
              let lhsName = prod.getAttribute('name');
              let name = norm(lhsName + ':' + rhs.innerText)
                .replace(/\[noLineTerminatorhere\]/g, '')
                .replace(/\[lookahead[^\]]+\]/g, '')
                .replace(/\[empty\]/g, '');
              if (name in semMap) {
                let obj = semMap[name];
                let type = `${lhsName}${obj.idx}`;
                let algoName = `${algo.name}${obj.subIdx}`;
                obj.sem.push(algoName);
                algo.body.params = [];
                for (let nt of rhs.getElementsByTagName('emu-nt')) {
                  algo.body.params.push(nt.innerText)
                }
                algo.body.filename = `es2018/algorithm/${type}.${algoName}.json`;
                save(algo.body, algo.body.filename);
              } else {
                console.error(name);
                console.error(elem);
              }
            }
          }
        } else {
          globalMethods.push(algo.name);
          algo.body.filename = `es2018/algorithm/${algo.name}.json`;
          save(algo.body, algo.body.filename);
        }
      }
    }
  }

  // Types
  ////////////////////////////////////////////////////////////////////////////
  let tyMap = {
    DeclarativeEnvironmentRecord: [
      'sec-declarative-environment-records' // 8.1.1.1
    ],
    ObjectEnvironmentRecord: [
      'sec-object-environment-records' // 8.1.1.2
    ],
    FunctionEnvironmentRecord: [
      'sec-function-environment-records' // 8.1.1.3
    ],
    GlobalEnvironmentRecord: [
      'sec-global-environment-records' // 8.1.1.4
    ],
    ModuleEnvironmentRecord: [
      'sec-module-environment-records' // 8.1.1.5
    ]
  }
  for (let tname in tyMap) {
    let methods = [];
    for (let id of tyMap[tname]) {
      for (let elem of document.getElementById(id).getElementsByTagName('emu-alg')) {
        let algo = getAlgo(elem);
        if (algo) {
          let name = `${tname}.${algo.name}`
          methods.push(algo.name);
          algo.body.params = [ 'this' ].concat(algo.body.params);
          algo.body.filename = `es2018/algorithm/${name}.json`;
          save(algo.body, algo.body.filename);
        } else {
          console.error(elem);
        }
      }
    }
    tys.push({
      name: tname,
      methods: methods
    });
  }

  // save ES2018 spec
  let spec = new Spec(globalMethods, grammar, tys)
  save(spec, 'es2018/spec.json');

  // download files
  download('es2018');
});