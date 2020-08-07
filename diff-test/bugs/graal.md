# GraalJS (js) Bugs

- report 하는 곳 : https://github.com/graalvm/graaljs/issues

## Engine Crash - [Reported](https://github.com/graalvm/graaljs/issues/322)
_ __Simple JavaScript code:__
```
var x = ++ undefined ;
```

## Async Generator Function Property Orders - [Reported](https://github.com/graalvm/graaljs/issues/323)
- __Section:__ [14.5.11 Runtime Semantics: InstantiateFunctionObject](https://tc39.es/ecma262/#sec-asyncgenerator-definitions-instantiatefunctionobject)
- Expected ["length", "name", "prototype"] but got ["length", "prototype", "name"].
_ __Simple JavaScript code:__
```
async function * x ( ) { for await ( var x of '' ) ; } ; x ( ) ;
```

## Generator Function Property Orders - [Reported](https://github.com/graalvm/graaljs/issues/323)
- __Section:__ [14.4.11 Runtime Semantics: InstantiateFunctionObject](https://tc39.es/ecma262/#sec-generator-function-definitions-runtime-semantics-instantiatefunctionobject)
- Expected ["length", "name", "prototype"] but got ["length", "prototype", "name"].
_ __Simple JavaScript code:__
```
function * x ( ... x ) { }
```

## Delete - [Reported](https://github.com/graalvm/graaljs/issues/324)
- __Section:__ [12.5.3.2 Runtime Semantics: Evaluation](https://tc39.es/ecma262/#sec-delete-operator-runtime-semantics-evaluation)
- Expected a TypeError to be thrown but no exception was thrown at all
_ __Simple JavaScript code:__
```
delete 'str' [ 0 ] ;
```

## PadStart - [Reported](https://github.com/graalvm/graaljs/issues/325)
- __Section:__ [21.1.3.15.1 Runtime Semantics: StringPad](https://tc39.es/ecma262/#sec-stringpad)
- Expected no exception but a RangeError is thrown.
_ __Simple JavaScript code:__
```
var x = "42".padStart(Infinity , "") ;
```

## PropertyDefinitionEvaluation - [Reported](https://github.com/graalvm/graaljs/issues/326)
- __Section:__ [12.2.6.8 Runtime Semantics: PropertyDefinitionEvaluation](https://tc39.es/ecma262/#sec-object-initializer-runtime-semantics-propertydefinitionevaluation)
- descriptor value should be "42" but ""
_ __Simple JavaScript code:__
```
var x = { 42 : class   { } } ;
```

## Spread Operator Of Array Initializer - [Reported](https://github.com/graalvm/graaljs/issues/327)
- __Section:__ [12.2.6.8 Runtime Semantics: PropertyDefinitionEvaluation](https://tc39.es/ecma262/#sec-runtime-semantics-arrayaccumulation)
- Expected ["0", "2", "length"] but got ["0", "length"].
_ __Simple JavaScript code:__
```
var x = [ undefined , , ... [undefined] ] ;
```

## ExpectedArgumentCount - [Reported](https://github.com/graalvm/graaljs/issues/328)
- descriptor value should be 0 but 1
_ __Simple JavaScript code:__
```
function x (...[x]) {}
```

## EarlyErrors - [Reported](https://github.com/graalvm/graaljs/issues/329)

### CoverParenthesizedExpressionAndArrowParameterList
- 현재 GraalJS에서 CoverParenthesizedExpressionAndArrowParameterList 에서 `...BindingPattern`에 대해 SyntaxError 를 띄우고 있으나 원래는 SyntaxError가 아님.
- __Simple JavaScript code:__
```js
(...{x}) => {};
(x0, ...{x1}) => {};
```

## Maybe spec error - [Not yet]
- __Section:__ [13.7.5.12 Runtime Semantics: ForIn/OfHeadEvaluation](https://tc39.es/ecma262/#sec-runtime-semantics-forinofheadevaluation)
- Expected a ReferenceError but got a TypeError

- 스펙 에러인 것으로 보임.
- `ForIn/OfHeadEvaluation`의 3번째 step 에서 `exprRef`는 step 2.b 에서 생성된 새로운 lexical environment 의 reference 임
- 이후 4번째 step 에서 lexical environment 가 old lexical environment로 바뀜
- 5번째 step 에서 GetValue 를 하고, GetValue 의 step 6.b 에서 GetBindingValue 가 실행됨
- 그런데, old lexical environment 에 해당 reference 가 없으므로 8.1.1.1.6 GetBindingValue 의 step 2 assertion 에 걸리게 됨
_ __Generated code:__
```
for ( let x of x ++ ) switch ( [  ... '' ] ) { case NaN :  default : for ( var { } = x ; '' ;  ) ; case `${ '' , '' }${ x }${ '' }` :  }
```
_ __Simple JavaScript code:__
```
for(let x of x) ;
```

## Need Inspection
- only no error
```
for ( [  ] in { [ '' ] : '' } ) for ( 1 ?. x . x in 'str' ) ;
for ( [  ] in { set x ( x  ) {  } } ) for ( { x ( ... [ , ... x ] ) {  } } ?. x . x in { async * x (  ) {  } } ) ;
for ( x ?. x [ '' ] in '' ) ;
var x = { x : 1 } ; ( { x , ... { } } = x ) ;
```

<!--
### BindingIdentifier2
- __Section:__ [12.1.1 Early Errors](https://www.ecma-international.org/ecma-262/11.0/index.html#sec-identifiers-static-semantics-early-errors)
- strict mode 시, *await* 는 BindingIdentifier 로 사용될 수 없으나, GraalJS 에서는 SyntaxError 를 띄우지 않음
- __Simple JavaScript code:__
```js
try {  } catch (await) {  }
var await, await;
```
-->