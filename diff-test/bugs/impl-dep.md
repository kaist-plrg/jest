# Implementation Dependent

## top-level this
- https://www.ecma-international.org/ecma-262/11.0/index.html#sec-global-environment-records
- GlobalEnvironment 의 this 는 Host 가 제공하는 어떤 값이든 될 수 있음
- __Related JavaScript code:__
```js
var x = this . isFinite ( - Infinity ) ;
```

## Function.prototype.toString
- [19.2.5 HostHasSourceTextAvailable](http://ecma-international.org/ecma-262/11.0/#sec-hosthassourcetextavailable)
- If _HostHasSourceTextAvailable_ returns false, then _Function.prototype.toString_ returns a string which has a syntax of a _NativeFunciton_
- __Related JavaScript code:__
```js
var x = ( function (  ) {  } ) . toString (  ) ;
```
