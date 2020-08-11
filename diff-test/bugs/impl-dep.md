# Implementation Dependent

## top-level this
- https://www.ecma-international.org/ecma-262/11.0/index.html#sec-global-environment-records
- GlobalEnvironment 의 this 는 Host 가 제공하는 어떤 값이든 될 수 있음
- __Related JavaScript code:__
```js
var x = this . isFinite ( - Infinity ) ;
```