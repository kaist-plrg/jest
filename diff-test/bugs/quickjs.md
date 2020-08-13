# QuickJS (qjs) Bugs

- report 하는 곳 : https://github.com/ldarren/QuickJS/issues

## PadStart - [Reported](https://github.com/ldarren/QuickJS/issues/18)
- __Section:__ [21.1.3.15.1 Runtime Semantics: StringPad](https://tc39.es/ecma262/#sec-stringpad)
- Expected no exception but a InternalError is thrown.
- __Generated code:__
```
var x = String . prototype . padStart . call ( 42n , Infinity , [ ] ) ;
```
_ __Simple JavaScript code:__
```
var x = "42".padStart(Infinity , "") ;
```

## FunctionDeclarationInstantiation - [Reported](https://github.com/ldarren/QuickJS/issues/19)
- Expected no exception but a TypeError is thrown.
- __Generated code:__
```js
var x = x `` ; function * x ( ... { [ '' ] : { } = x } ) { ; var [ x , , ... x ] = x ; }
```
_ __Simple JavaScript code:__
```js
(function x( {a} = x ) { var x; })();
```

## IteratorBindingInitialization - [Reported](https://github.com/ldarren/QuickJS/issues/20)
- Expected undefined but got 0.
- __Generated code:__
```js
var [ x ] = { [ Symbol . asyncIterator ] : false , [ Symbol . iterator ] : function * ( ) { ; return 0 ; yield 0 ; } } ;
```
_ __Simple JavaScript code:__
```js
"use strict";
function * g () { return 0; };
var [x] = g();
```

## Function.prototype.bind - [Reported](https://github.com/ldarren/QuickJS/issues/21)
- Expected ["length", "name"] but got ["name", "length"].
- __Generated code:__
```js
var x = Function . prototype . bind . call ( async x => x , 0 ) ;
```
- __Simple JavaScript code:__
```js
var x = (async x => x).bind(0);
```

## ObjectBindingPattern BindingInitialization 
- Expected ReferenceError but got no error
- { x = x }를 interp하는 과정에서 [13.3.3.9 Runtime Semantics: KeyedBindingInitialization](https://www.ecma-international.org/ecma-262/#sec-runtime-semantics-keyedbindinginitialization)의 4.b.i 스텝의 defaultValue를 ?getValue로 호출하면 Reference Error가 나야하지만, qjs에서는 에러가 나지 않음
- __Generated code:__
```js
var x = { x ( ... { x = x } ) { } } ; var [ , , ] = class extends x ?. x ( ) { ; } ;
```
- __Simple JavaScript code:__
```js
function f (... { x = x } ) { }  ;
f()
```
