# GraalJS (js) Bugs

### GraalJS (js)

- **Engine Crash**
```
var x = ++ undefined ;
```

- only no error
```
for ( [  ] in { [ '' ] : '' } ) for ( 1 ?. x . x in 'str' ) ;
for ( [  ] in { set x ( x  ) {  } } ) for ( { x ( ... [ , ... x ] ) {  } } ?. x . x in { async * x (  ) {  } } ) ;
for ( x ?. x [ '' ] in '' ) ;
var x = { x : 1 } ; ( { x , ... { } } = x ) ;

```

- descriptor value should be "42" but ""
```
var x = { 42 : class   { x (  ) {  } } } ;
```

- descriptor value should be 0 but 1
```
function * x ( ... { x  } ) {  } ; x `${ '' }${ '' }` ;
async function x ( ... { x  ,  } ) {  } ; x `` ;
async function x ( ... { x  ,  } ) {  } ; x ?? x ?? x ;
async function x ( ... { x  ,  } ) {  } ; typeof x ;
function await ( ... { ... x } ) { }
var x = { async * x ( ... { [ '' ] : { } = x } ) { } } ;
var x = { async x ( ... { ... x } ) { } } ;
async function x ( ... { ... x } ) { }
function x ( ... [ , ... x ] ) { }
var x = Object . seal ( { x ( ... { x : { } } ) { } } ) ;
```

- UnhandledPromiseRejectionWarning: TypeError: Cannot destructure property 'x' of 'undefined' as it is undefined.
```
async function x ( ... { x : { }  } ) {  } ; x `` ;
async function x ( ... { x = class x extends new . target { ; } } ) {  } switch ( '' ) { case '' , '' : ; ; } x `` ;
```

- Expected a ReferenceError but got a TypeError
```
for ( [  x ?. x [ '' , '' ] ,  ... [  x , , ... x ] ] of [  [  ] ] ) for ( var x  ; '' , '' ; '' , '' ) ;
for ( let x of x ++ ) switch ( [  ... '' ] ) { case NaN :  default : for ( var { } = x ; '' ;  ) ; case `${ '' , '' }${ x }${ '' }` :  }
```

- Expected ["0", "2", "length"] but got ["0", "length"].
- Expected true but gotfalse
- Expected no exception but a TypeError is thrown.
```
var x = new Set ( [ , , ] ) ; var x = [ x , , ... x ] ;
```

- Expected ["length", "name", "prototype"] but got ["length", "prototype", "name"].
```
async function * x ( ) { for await ( var x of '' ) ; } ; x ( ) ;
function * x ( ... x ) { }
```

- Expected no exception but a RangeError is thrown.
```
var x = String . prototype . padStart . call ( 42n , Infinity , [ ] ) ;
```

- Expected a TypeError to be thrown but no exception was thrown at all
```
delete 'str' [ 0 ] ;
```

## EarlyErrors

### BindingIdentifier2
- __Section:__ [12.1.1 Early Errors](https://www.ecma-international.org/ecma-262/11.0/index.html#sec-identifiers-static-semantics-early-errors)
- strict mode 시, *await* 는 BindingIdentifier 로 사용될 수 없으나, GraalJS 에서는 SyntaxError 를 띄우지 않음
- __Simple JavaScript code:__
```js
try {  } catch (await) {  }
var await, await;
```

### CoverParenthesizedExpressionAndArrowParameterList
- 현재 GraalJS에서 CoverParenthesizedExpressionAndArrowParameterList 에서 `...BindingPattern`에 대해 SyntaxError 를 띄우고 있으나 원래는 SyntaxError가 아님.
- __Simple JavaScript code:__
```js
(...{x}) => {};
(x0, ...{x1}) => {};
```