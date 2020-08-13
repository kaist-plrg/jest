# GraalJS (js) Bugs

- report 하는 곳 : https://github.com/graalvm/graaljs/issues

## Engine Crash - [Reported / Confirmed / Fixed](https://github.com/graalvm/graaljs/issues/322)
_ __Simple JavaScript code:__
```
var x = ++ undefined ;
```

## Async Generator Function Property Orders - [Reported / Confirmed](https://github.com/graalvm/graaljs/issues/323)
- __Section:__ [14.5.11 Runtime Semantics: InstantiateFunctionObject](https://tc39.es/ecma262/#sec-asyncgenerator-definitions-instantiatefunctionobject)
- Expected ["length", "name", "prototype"] but got ["length", "prototype", "name"].
_ __Simple JavaScript code:__
```
async function * x ( ) { for await ( var x of '' ) ; } ; x ( ) ;
```

## Generator Function Property Orders - [Reported / Confirmed](https://github.com/graalvm/graaljs/issues/323)
- __Section:__ [14.4.11 Runtime Semantics: InstantiateFunctionObject](https://tc39.es/ecma262/#sec-generator-function-definitions-runtime-semantics-instantiatefunctionobject)
- Expected ["length", "name", "prototype"] but got ["length", "prototype", "name"].
_ __Simple JavaScript code:__
```
function * x ( ... x ) { }
```

## Delete - [Reported / Confirmed](https://github.com/graalvm/graaljs/issues/324)
- __Section:__ [12.5.3.2 Runtime Semantics: Evaluation](https://tc39.es/ecma262/#sec-delete-operator-runtime-semantics-evaluation)
- Expected a TypeError to be thrown but no exception was thrown at all
- __Generated JavaScript code:__
```js
delete `${ ( Symbol . search ) , [ , ... '' ] }${ null }` [ 1 ] ;
```
_ __Simple JavaScript code:__
```js
delete 'str' [ 0 ] ;
```

## PadStart - [Reported / Confirmed / Fixed](https://github.com/graalvm/graaljs/issues/325)
- __Section:__ [21.1.3.15.1 Runtime Semantics: StringPad](https://tc39.es/ecma262/#sec-stringpad)
- Expected no exception but a RangeError is thrown.
_ __Simple JavaScript code:__
```
var x = "42".padStart(Infinity , "") ;
```

## PropertyDefinitionEvaluation - [Reported / Was fixed in latest version](https://github.com/graalvm/graaljs/issues/326)
- __Section:__ [12.2.6.8 Runtime Semantics: PropertyDefinitionEvaluation](https://tc39.es/ecma262/#sec-object-initializer-runtime-semantics-propertydefinitionevaluation)
- descriptor value should be "42" but ""
_ __Simple JavaScript code:__
```
var x = { 42 : class   { } } ;
```

## Spread Operator Of Array Initializer - [Reported / Confirmed / Fixed](https://github.com/graalvm/graaljs/issues/327)
- __Section:__ [12.2.6.8 Runtime Semantics: PropertyDefinitionEvaluation](https://tc39.es/ecma262/#sec-runtime-semantics-arrayaccumulation)
- Expected ["0", "2", "length"] but got ["0", "length"].
_ __Simple JavaScript code:__
```
var x = [ undefined , , ... [undefined] ] ;
```

## ExpectedArgumentCount - [Reported / Confirmed / Fixed](https://github.com/graalvm/graaljs/issues/328)
- descriptor value should be 0 but 1
- __Generated code:__
```js
var x = x ; async function x ( ... [ ... x ] ) { }
```
_ __Simple JavaScript code:__
```
function x (...[x]) {}
```

## ForInOfHeadEvaluation - [Reported / Confirmed / Fixed](https://github.com/graalvm/graaljs/issues/332)
- __Section:__ [13.7.5.12 Runtime Semantics: ForIn/OfHeadEvaluation](https://tc39.es/ecma262/#sec-runtime-semantics-forinofheadevaluation)
- Expected a ReferenceError but got a TypeError
- `ForIn/OfHeadEvaluation`의 3번째 step 에서 `exprRef`는 step 2.b 에서 생성된 새로운 lexical environment 의 reference 임
- 이후 4번째 step 에서 lexical environment 가 old lexical environment로 바뀜
- 5번째 step 에서 GetValue 를 하고, GetValue 의 step 6.b 에서 GetBindingValue 가 실행됨
- GetBindingValue 의 3번째 step 에서 uninitialized binding 이므로 ReferenceError 가 발생해야함.
_ __Generated code:__
```
for ( let x of x ++ ) switch ( [  ... '' ] ) { case NaN :  default : for ( var { } = x ; '' ;  ) ; case `${ '' , '' }${ x }${ '' }` :  }
for ( let x in + x ) ;
```
_ __Simple JavaScript code:__
```
for(let x of x) ;
```

## IteratorClose - [Reported](https://github.com/graalvm/graaljs/issues/335)
- __Section:__ [7.4.6 IteratorClose](http://ecma-international.org/ecma-262/11.0/#sec-iteratorclose)
- 4 번째 step에서 [GetMethod](http://ecma-international.org/ecma-262/11.0/#sec-getmethod)를 통해서
  `return`에 관한 것을 가져오는데, 이 과정에서 abrupt completion 검사를 하는 것이 8 번째 step에서
  `completion.[[Type]]`에 대한 검사보다 먼저 일어난다. 따라서, `return` 함수를 가져오면서도
  error가 나고, iterator 계산 도중에도 error가 나는 경우라면, `return` 함수에 대한 오류가 나가게 된다.
- __Simple JavaScript code:__
```js
var x = {};
x[Symbol.iterator] = function() {
  return {
    next: function() {
      return { done: false, value: null };
    },
    return: 'str'
  };
};
for (var y of x) throw 42;
```

## EarlyErrors - [Reported](https://github.com/graalvm/graaljs/issues/329)

### CoverParenthesizedExpressionAndArrowParameterList
- 현재 GraalJS에서 CoverParenthesizedExpressionAndArrowParameterList 에서 `...BindingPattern`에 대해 SyntaxError 를 띄우고 있으나 원래는 SyntaxError가 아님.
- __Simple JavaScript code:__
```js
(...{x}) => {};
(x0, ...{x1}) => {};
```

## Need Inspection
- only no error
```
for ( [  ] in { [ '' ] : '' } ) for ( 1 ?. x . x in 'str' ) ;
for ( [  ] in { set x ( x  ) {  } } ) for ( { x ( ... [ , ... x ] ) {  } } ?. x . x in { async * x (  ) {  } } ) ;
for ( x ?. x [ '' ] in '' ) ;
var x = { x : 1 } ; ( { x , ... { } } = x ) ;
```

- Spec, Graal -> TypeError, other engines -> SyntaxError
```js
function x ( ) { for ( { [ "prototype" ] : async function ( x ) { } } ?. x . x in { [ "prototype" ] : async function ( x ) { } } ) ; return { [ "prototype" ] : async function ( x ) { } } ?. x ( ) ; } var x = new x ;
```

- Expected no exception but ReferenceError
```js
for ( x in 'str' ) switch ( '' ) { case x : default : case x : ; async function * x ( ... { x } ) { } } var x = 42 ;
```

- Expected ReferenceError but no exception
```js
var x = '0' ; ( { x , ... { x , } } = x ) ;
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
