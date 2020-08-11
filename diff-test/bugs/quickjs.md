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