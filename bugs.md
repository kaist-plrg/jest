# JavaScript Engins/Specification Bugs

## ECMAScript
|ID    |VE|GR|MD|QJ|Assertion|Answer                                                 |Confirmed|Example|
|:-:|:-:|:-:|:-:|:-:|:-:|:-:|:-:|:-|
|ES1-1 |  |X |X |X |Key      |ClassTail0ClassDefinitionEvaluation3                   |Y        |`class A{}`|
|ES1-2 |X |X |X |X |Key      |FunctionDeclaration0InstantiateFunctionObject0         |Y        |`function f(){}`|
|ES1-3 |X |  |X |X |Key      |GeneratorDeclaration0InstantiateFunctionObject0        |Y        |`function*f(){}`|
|ES1-4 |X |  |X |X |Key      |AsyncGeneratorDeclaration0InstantiateFunctionObject0   |Y        |`async function*f(){}`|
|ES1-5 |X |X |X |X |Key      |FunctionExpression0Evaluation0                         |Y        |`var x=function (){}`|
|ES1-6 |X |X |X |X |Key      |FunctionExpression0Evaluation1                         |Y        |`var x=function f(){}`|
|ES1-7 |X |  |X |X |Key      |GeneratorExpression0Evaluation0                        |Y        |`var x=function*(){}`|
|ES1-8 |X |  |X |X |Key      |GeneratorExpression0Evaluation1                        |Y        |`var x=function*f(){}`|
|ES1-9 |X |  |X |X |Key      |AsyncGeneratorExpression0Evaluation0                   |Y        |`var x=async function*(){}`|
|ES1-10|X |  |X |X |Key      |AsyncGeneratorExpression0Evaluation1                   |Y        |`var x=async function*f(){}`|
|ES1-11|X |  |X |X |Key      |GeneratorMethod0PropertyDefinitionEvaluation0          |Y        |`var x={*f(){}}`|
|ES1-12|X |  |X |X |Key      |AsyncGeneratorMethod0PropertyDefinitionEvaluation0     |Y        |`var x={async*f(){}}`|
|ES2-1 |X |X |X |X |Key      |ArrowFunction0Evaluation0                              |Y        |`var x=(x=>x)(()=>{});`|
|ES2-2 |X |X |X |X |Key      |AsyncArrowFunction0Evaluation0                         |Y        |`var x=(x=>x)(async x=>{});`|
|ES2-3 |X |X |X |X |Key      |AsyncArrowFunction1Evaluation0                         |Y        |`var x=(x=>x)(async()=>{});`|
|ES2-4 |  |X |X |X |Key      |ClassTail0ClassDefinitionEvaluation3                   |Y        |`var x=(x=>x)(class{});`|
|ES2-5 |X |X |X |X |Key      |FunctionExpression0Evaluation0                         |Y        |`var x=(x=>x)(function(){});`|
|ES2-6 |X |X |X |X |Key      |GeneratorExpression0Evaluation0                        |Y        |`var x=(x=>x)(function*(){});`|
|ES2-7 |X |X |X |X |Key      |AsyncFunctionExpression0Evaluation0                    |Y        |`var x=(x=>x)(async function(){});`|
|ES2-8 |X |X |X |X |Key      |AsyncGeneratorExpression0Evaluation0                   |Y        |`var x=(x=>x)(async function*(){});`|
|ES3-1 |X |X |X |X |Exc      |ForInOfHeadEvaluation                                  |Y        |`for(x in{});`|
|ES4-1 |X |X |X |X |Abort    |UpdateExpression1Evaluation0                           |Y        |`x++;`|
|ES4-2 |X |X |X |X |Abort    |UpdateExpression2Evaluation0                           |Y        |`x--;`|
|ES4-3 |X |X |X |X |Abort    |UpdateExpression3Evaluation0                           |Y        |`++x;`|
|ES4-4 |X |X |X |X |Abort    |UpdateExpression4Evaluation0                           |Y        |`--x;`|
|ES5-1 |X |X |X |X |Exc      |AbstractEqualityComparison                             |Y        |`0=={valueOf:()=>{throw 42;}};`|
|ES6-1 |X |X |X |X |Exc      |PropertyDefinition2PropertyDefinitionEvaluation0       |N        |`var x={p:class extends 42{}};`|

## V8
|ID |VE|GR|MD|QJ|Assertion|Answer                               |Confirmed|Example|
|:-:|:-:|:-:|:-:|:-:|:-:|:-:|:-:|:-|
|VE1|X |  |  |  |Key      |ClassTail0ClassDefinitionEvaluation3 |Y        |`class A{}`|
|VE2|X |  |  |  |Key      |ClassTail0ClassDefinitionEvaluation3 |Y        |`var x=(x=>x)(class{});`|

## GraalJS
|ID  |V8|GR|MD|QJ|Assertion|Answer                                              |Confirmed|Example|
|:-:|:-:|:-:|:-:|:-:|:-:|:-:|:-:|:-|
|GR1 |  |X |  |  |Exc      |UpdateExpression3Evaluation0                        |Y        |`++undefined;`|
|GR2 |  |X |  |  |Key      |GeneratorDeclaration0InstantiateFunctionObject0     |Y        |`function*f(){}`|
|GR3 |  |X |  |  |Key      |AsyncGeneratorDeclaration0InstantiateFunctionObject0|Y        |`async function*f(){}`|
|GR4 |  |X |  |  |Key      |GeneratorExpression0Evaluation0                     |Y        |`var x=function*(){}`|
|GR5 |  |X |  |  |Key      |GeneratorExpression0Evaluation1                     |Y        |`var x=function*f(){}`|
|GR6 |  |X |  |  |Key      |AsyncGeneratorExpression0Evaluation0                |Y        |`var x=async function*(){}`|
|GR7 |  |X |  |  |Key      |AsyncGeneratorExpression0Evaluation1                |Y        |`var x=async function*f(){}`|
|GR8 |  |X |  |  |Key      |GeneratorMethod0PropertyDefinitionEvaluation0       |Y        |`var x={*f(){}}`|
|GR9 |  |X |  |  |Key      |AsyncGeneratorMethod0PropertyDefinitionEvaluation0  |Y        |`var x={async*f(){}}`|
|GR10|  |X |  |  |Exc      |UnaryExpression1Evaluation0                         |Y        |`delete"str"[0];`|
|GR11|  |X |  |X |Exc      |StringPad                                           |Y        |`var x="42".padStart(Infinity,"");`|
|GR12|  |X |X |  |Desc     |PropertyDefinition2PropertyDefinitionEvaluation0    |Y        |`var x={42:class{}};`|
|GR13|  |X |  |  |Exc      |ElementList3ArrayAccumulation1                      |Y        |`var x=[undefined,,...[undefined]];`|
|GR14|  |X |  |  |Desc     |FormalParameters1ExpectedArgumentCount0             |Y        |`function x (...[x]){}`|
|GR15|  |X |  |  |Exc      |ForInOfHeadEvaluation                               |Y        |`for(let x of x);`|
|GR16|  |X |  |  |Exc      |-                                                   |Y        |`(...{x})=>{};`|

## Moddable XS
|ID   |V8|GR|MD|QJ|Assertion|Answer                                           |Confirmed|Example|
|:-:|:-:|:-:|:-:|:-:|:-:|:-:|:-:|:-|
|MD1  |  |X |  |  |Exc      |OptionalExpression0Evaluation0                   |Y        |`var x = TypeError ( x ?. ( ) ) ;`|
|MD2  |  |X |  |  |Exc      |GLOBALDOTNumberDOTprototypeDOTtoString           |Y        |`var x = Number . prototype . toString . call ( new Number ( 0 ) , 0 ) ;`|
|MD3  |  |X |  |X |Desc     |PropertyDefinition2PropertyDefinitionEvaluation0 |Y        |`var x = { 42 : class   { x (  ) {  } } } ;`|
|MD4  |  |X |  |  |Desc     |ElementList1ArrayAccumulation1                   |Y        |`var x = [ , ... '' ] ;`|
|MD5  |  |X |  |  |Exc      |GLOBALDOTArrayDOTprototypeDOTtoString            |Y        |`Array . prototype . toString . call ( function x (  ) {  } ) ;`|
|MD6-1|  |X |  |  |Key      |CreateMapIterator                                |Y        |`var x = Map . prototype . keys . call ( new Map ( ) ) ;`|
|MD6-2|  |X |  |  |Key      |CreateSetIterator                                |Y        |`var x = Set . prototype . values . call ( new Set ( ) ) ;`|
|MD7  |  |X |  |  |Exc      |GLOBALDOTStringDOTprototypeDOTsplit              |Y        |`String . prototype . split . call ( 1 , Symbol . species , 0 , 0 ) ;`|
|MD8  |  |X |  |  |Exc      |EnumerateObjectProperties                        |Y        |`for ( x in 'str' ) ;`|
|MD9-1|  |X |  |  |Exc      |-                                                |Y        |`var x = { p : 0 } ; ( { p : ( Symbol . match ) } = x ) ;`|
|MD9-2|  |X |  |  |Exc      |-                                                |Y        |`var x = [ 1 , 2 , 3 ] ; ( [ , ( Symbol . isConcatSpreadable ) ] = x ) ;`|
|MD10 |  |X |  |  |Exc      |-                                                |Y        |`var x = [ 1 , 2 , 3 ] ; ( [ , undefined ] = x ) ;`|
|MD11 |  |X |  |  |Key      |GLOBALDOTArrayDOTprototypeDOTslice               |Y        |`var x = Array . prototype . slice . call ( 'str' , { } , ~ x ) ;`|
|MD12 |  |X |  |  |Exc      |-                                                |Y        |`switch ( '' ) { default : ; class x extends { x } { } }`|
|MD13 |  |X |  |  |Exc      |-                                                |Y        |`async function * x ( ) { class x extends new . target { ; } } ; x ( ) ;`|
|MD14 |  |X |  |  |Exc      |-                                                |Y        |`do do ; while ( '' ) ; while ( BigInt ( 0 ) ) ;`|
|MD15 |  |X |X |  |Key      |BoundFunctionCreate                              |Y        |`var x = Function . prototype . bind . call ( ( ) => { } , ( Symbol . replace ) ) ;`|
|MD16 |  |X |  |  |Exc      |Await                                            |Y        |`var x = Promise . race ( { [ Symbol . asyncIterator ] : function ( ) { ; } , [ Symbol . iterator ] : async function ( ) { ; await x ( ) ; } } ) ; async function * x ( ... { ... x } ) { } throw 42 ; async function x ( x ) { ; x ( 42 ) ; }`|
|MD17 |  |X |  |  |Key      |GeneratorBody0EvaluateBody0                      |Y        |`var x = x `` ; function * x ( ... [ ] ) { }`|
|MD18 |  |X |  |  |Desc     |ToPropertyDescriptor                             |Y        |`var x = Object . defineProperty ( class { static x ( ) { } } , { [ "set" ] : ( ) => { throw { [ Symbol . toPrimitive ] : function ( x ) { } } ; } , [ { [ Symbol . toPrimitive ] : function ( x ) { } } ] : { [ Symbol . toPrimitive ] : function ( x ) { } } , [ { [ Symbol . toPrimitive ] : function ( x ) { } } ] : async function ( ) { } , [ "get" ] : { [ Symbol . toPrimitive ] : function ( x ) { } } , [ { [ Symbol . toPrimitive ] : function ( x ) { } } ] : { [ Symbol . toPrimitive ] : function ( x ) { } } , [ { [ Symbol . toPrimitive ] : function ( x ) { } } ] : { [ Symbol . toPrimitive ] : function ( x ) { } } } , { [ "set" ] : ( ) => { throw '' ; } , [ { [ Symbol . toPrimitive ] : function ( x ) { } } ] : { [ Symbol . toPrimitive ] : function ( x ) { } } , [ { [ Symbol . toPrimitive ] : function ( x ) { } } ] : async function ( ) { } , [ "get" ] : function ( ) { } , [ { [ Symbol . toPrimitive ] : function ( x ) { } } ] : async function ( x ) { } , [ { [ Symbol . toPrimitive ] : function ( x ) { } } ] : { [ Symbol . toPrimitive ] : function ( x ) { } } } ) ;`|

## QuickJS
|ID |V8|GR|MD|QJ|Assertion|Answer                                               |Confirmed|Example|
|:-:|:-:|:-:|:-:|:-:|:-:|:-:|:-:|:-|
|QJ1|  |  |X |X |Exc      |StringPad                                            |Y        |var x = String . prototype . padStart . call ( 42n , Infinity , [ ] ) ;|
|QJ2|  |  |X |  |Exc      |FunctionDeclarationInstantiation                     |Y        |var x = x `` ; function * x ( ... { [ '' ] : { } = x } ) { ; var [ x , , ... x ] = x ; }|
|QJ3|  |  |X |  |Var      |ArrayBindingPattern1IteratorBindingInitialization0   |Y        |var [ x ] = { [ Symbol . asyncIterator ] : false , [ Symbol . iterator ] : function * ( ) { ; return 0 ; yield 0 ; } } ;|
|QJ4|  |X |X |  |Key      |GLOBALDOTFunctionDOTprototypeDOTbind                 |Y        |var x = Function . prototype . bind . call ( async x => x , 0 ) ;|
|QJ5|  |  |X |  |Exc      |FunctionRestParameter0IteratorBindingInitialization0 |Y        |var x = { x ( ... { x = x } ) { } } ; var [ , , ] = class extends x ?. x ( ) { ; } ;|
|QJ6|  |  |X |  |Key      |SpreadElement0ArrayAccumulation0                     |Y        |var x = [ ... [ , ] ] ;|
