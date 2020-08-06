# ECMAScript 2020 Bugs

## Abstract Equality Comparison - [Resolved](https://github.com/tc39/ecma262/pull/1976)
- __Section:__ [7.2.15 Abstract Equality Comparison](http://ecma-international.org/ecma-262/11.0/#sec-abstract-equality-comparison)
- 10 번째 11 번째 step에서 [`ToPrimitive`](http://ecma-international.org/ecma-262/11.0/#sec-toprimitive)를
호출하고 나서 [ReturnIfAbrupt (?)](http://ecma-international.org/ecma-262/11.0/#sec-returnifabrupt-shorthands)를
안해서 오류가 밖으로 빠져나가지 못함
- __Simple JavaScript code:__
```js
1 != { valueOf: () => { throw 42; } };
```
| JS Engine | Result |
|:-:|:-|
| GraalJS     | Expected no exception but 42 is thrown. |
| QuickJS     | Expected no exception but 42 is thrown. |
| Moddable XS | Expected no exception but 42 is thrown. |
| Google V8   | Expected no exception but 42 is thrown. |
- __Failed Test262 tests:__
  - [language/expressions/does-not-equals/S11.9.2_A7.8.js](https://github.com/tc39/test262/tree/master/test/language/expressions/does-not-equals/S11.9.2_A7.8.js)
  - [language/expressions/does-not-equals/S11.9.2_A7.9.js](https://github.com/tc39/test262/tree/master/test/language/expressions/does-not-equals/S11.9.2_A7.9.js)
  - [language/expressions/equals/S11.9.1_A7.8.js](https://github.com/tc39/test262/tree/master/test/language/expressions/equals/S11.9.1_A7.8.js)
  - [language/expressions/equals/S11.9.1_A7.9.js](https://github.com/tc39/test262/tree/master/test/language/expressions/equals/S11.9.1_A7.9.js)

## Class Property Orders - [Resolved](https://github.com/tc39/ecma262/pull/1490)
- __Section:__ [14.6.13 Runtime Semantics: ClassDefinitionEvaluation](http://ecma-international.org/ecma-262/11.0/#sec-runtime-semantics-classdefinitionevaluation)
- ES2020에 따르면, class를 생성할 때 own property가 `length` -> `prototype` -> `name`의 순서로 추가가 된다.
  1. 12 번째 step에서 `constructor`의 [DefineMethod](http://ecma-international.org/ecma-262/11.0/#sec-runtime-semantics-definemethod)를 호출하고, 6 번째 step에서 [OrdinaryFunctionCreate](http://ecma-international.org/ecma-262/11.0/#sec-ordinaryfunctioncreate)를 호출, 18 번째 step에서 [SetFunctionLength](http://ecma-international.org/ecma-262/11.0/#sec-setfunctionlength)를 호출해서 4 번째 step에서 `length` property를 생성함.
  2. 14 번째 step에서 [MakeConstructor](http://ecma-international.org/ecma-262/11.0/#sec-makeconstructor)를 호출하고, 8 번째 step에서 `prototype` property를 생성함.
  3. 17.a step에서 [SetFunctionName](http://ecma-international.org/ecma-262/11.0/#sec-setfunctionname)을 호출하고, 6 번째 step에서 `name` property를 생성함.
- 실제 engine 들에서는 `length` -> `name` -> `property`의 순서가 나오고, Test262도 이 결과를 원함.
- __Simple JavaScript code:__
```js
class A {}
```
| JS Engine | Result |
|:-:|:-|
| GraalJS     | Expected ["length", "prototype", "name"] but got ["length", "name", "prototype"] |
| QuickJS     | Expected ["length", "prototype", "name"] but got ["length", "name", "prototype"] |
| Moddable XS | Expected ["length", "prototype", "name"] but got ["length", "name", "prototype"] |
| Google V8   | Pass|
- __Failed Test262 tests:__
  - [language/computed-property-names/class/static/method-number.js](https://github.com/tc39/test262/tree/master/test/language/computed-property-names/class/static/method-number.js)
  - [language/computed-property-names/class/static/method-string.js](https://github.com/tc39/test262/tree/master/test/language/computed-property-names/class/static/method-string.js)
  - [language/computed-property-names/class/static/method-symbol.js](https://github.com/tc39/test262/tree/master/test/language/computed-property-names/class/static/method-symbol.js)


## Default Function Names - [Resolved](https://github.com/tc39/ecma262/pull/1490)
- __Section:__ [14.2.17 Runtime Semantics: Evaluation](http://ecma-international.org/ecma-262/11.0/#sec-arrow-function-definitions-runtime-semantics-evaluation)
- ArrowFunction, FunctionExpression, AsyncFunctionExpression 등에서 이름을 가지지 않는 경우에는
  Evaluation을 하더라도 [SetFunctionName](http://ecma-international.org/ecma-262/11.0/#sec-setfunctionname)을
  부르지 않기 때문에, `name` property가 own property로 생성되지 않는다.
- __Simple JavaScript code:__
```js
var x;
((y) => { x = y; })(() => {});
```
| JS Engine | Result |
|:-:|:-|
| GraalJS     | Expected ["length"] but got ["length", "name"] |
| QuickJS     | Expected ["length"] but got ["length", "name"] |
| Moddable XS | Expected ["length"] but got ["length", "name"] |
| Google V8   | Expected ["length"] but got ["length", "name"] |
- __Failed Test262 tests:__
  - [built-ins/Promise/all/resolve-element-function-name.js](https://github.com/tc39/test262/tree/master/test/built-ins/Promise/all/resolve-element-function-name.js)
  - [built-ins/Promise/allSettled/reject-element-function-name.js](https://github.com/tc39/test262/tree/master/test/built-ins/Promise/allSettled/reject-element-function-name.js)
  - [built-ins/Promise/allSettled/resolve-element-function-name.js](https://github.com/tc39/test262/tree/master/test/built-ins/Promise/allSettled/resolve-element-function-name.js)
  - [built-ins/Promise/executor-function-name.js](https://github.com/tc39/test262/tree/master/test/built-ins/Promise/executor-function-name.js)
  - [built-ins/Promise/reject-function-name.js](https://github.com/tc39/test262/tree/master/test/built-ins/Promise/reject-function-name.js)
  - [built-ins/Promise/resolve-function-name.js](https://github.com/tc39/test262/tree/master/test/built-ins/Promise/resolve-function-name.js)
  - [built-ins/ThrowTypeError/name.js](https://github.com/tc39/test262/tree/master/test/built-ins/ThrowTypeError/name.js)
  - [built-ins/ThrowTypeError/name.js](https://github.com/tc39/test262/tree/master/test/built-ins/ThrowTypeError/name.js)
  - [language/expressions/arrow-function/name.js](https://github.com/tc39/test262/tree/master/test/language/expressions/arrow-function/name.js)
  - [language/expressions/assignment/fn-name-lhs-cover.js](https://github.com/tc39/test262/tree/master/test/language/expressions/assignment/fn-name-lhs-cover.js)
  - [language/expressions/assignment/fn-name-lhs-member.js](https://github.com/tc39/test262/tree/master/test/language/expressions/assignment/fn-name-lhs-member.js)
  - [language/expressions/async-arrow-function/name.js](https://github.com/tc39/test262/tree/master/test/language/expressions/async-arrow-function/name.js)
  - [language/expressions/async-function/name.js](https://github.com/tc39/test262/tree/master/test/language/expressions/async-function/name.js)
  - [language/expressions/async-generator/name.js](https://github.com/tc39/test262/tree/master/test/language/expressions/async-generator/name.js)
  - [language/expressions/class/name.js](https://github.com/tc39/test262/tree/master/test/language/expressions/class/name.js)
  - [language/expressions/function/name.js](https://github.com/tc39/test262/tree/master/test/language/expressions/function/name.js)
  - [language/expressions/generators/name.js](https://github.com/tc39/test262/tree/master/test/language/expressions/generators/name.js)


## IteratorClose - [Resolved](https://github.com/tc39/ecma262/pull/1408)
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
| JS Engine | Result |
|:-:|:-|
| GraalJS     | Pass |
| QuickJS     | Expected a TypeError but got 42. |
| Moddable XS | Expected a TypeError but got 42. |
| Google V8   | Expected a TypeError but got 42. |
- __Failed Test262 tests:__
  - [language/statements/for-of/iterator-close-throw-get-method-abrupt.js](https://github.com/tc39/test262/tree/master/test/language/statements/for-of/iterator-close-throw-get-method-abrupt.js)
  - [language/statements/for-of/iterator-close-throw-get-method-non-callable.js](language/statements/for-of/iterator-close-throw-get-method-abrupt.jslanguage/statements/for-of/iterator-close-throw-get-method-non-callable.js)


<!--
## ArraySetLength
- __Section:__ [9.4.2.4 ArraySetLength](http://ecma-international.org/ecma-262/11.0/#sec-arraysetlength)
- 14 번째 step에서 `succeeded`가 [`OrdinaryDefineOwnProperty`](http://ecma-international.org/ecma-262/11.0/#sec-ordinarydefineownproperty)를
통해 `false`가 되는 경우, `ArraySetLength`는 `false`를 반환해야 한다. 그런데, GraalJS와 Node에서는
그렇지 않은 것 같은데 확인이 필요해 보임.
- __Simple JavaScript code:__
```js
var x = [42];
Object.defineProperty(x, 'length', { value: 0, enumerable: true });
```
| JS Engine | Result |
|:-:|:-|
| GraalJS     | Expected a TypeError to be thrown but no exception was thrown at all. |
| QuickJS     | Pass |
| Moddable XS | Pass |
| Google V8   | Expected a TypeError to be thrown but no exception was thrown at all. |
- __Failed Test262 tests:__ 위의 경우에 대해서 cover하지 못함

## Template Raw Value (TRV)
- __Section:__ [11.8.6.1 Static Semantics: TV and TRV](http://ecma-international.org/ecma-262/11.0/#sec-static-semantics-tv-and-trv)
- TRV of NotEscapeSequence에서 "_DecimalDigit_ but not __0__" 에 대한 경우에 대해서 아예 설명이 없음
- __Simple JavaScript code:__
```js
var x;
(y => { x = y; })`\1`;
```
| JS Engine | Result |
|:-:|:-|
| GraalJS     | descriptor value should be "" but "\1". |
| QuickJS     | descriptor value should be "" but "\1". |
| Moddable XS | descriptor value should be "" but "\1". |
| Google V8   | descriptor value should be "" but "\1". |
- __Failed Test262 tests:__
  - [language/expressions/tagged-template/invalid-escape-sequences.js](https://github.com/tc39/test262/tree/master/test/language/expressions/tagged-template/invalid-escape-sequences.js)

## Number::unsignedRightShift
- __Section:__ [6.1.6.1.11 Number::unsignedRightShift](http://ecma-international.org/ecma-262/11.0/#sec-numeric-types-number-unsignedRightShift)
- 첫 번째 step에서 `lnum`을 구할 때, [ToUint32](http://ecma-international.org/ecma-262/11.0/#sec-touint32) 대신 [ToInt32](http://ecma-international.org/ecma-262/11.0/#sec-toint32)을
  사용하고 있다.
- __Simple JavaScript code:__
```js
var x = -1 >>> 1;
```
| JS Engine | Result |
|:-:|:-|
| GraalJS     | Expected 4294967295 but got 2147483647. |
| QuickJS     | Expected 4294967295 but got 2147483647. |
| Moddable XS | Expected 4294967295 but got 2147483647. |
| Google V8   | Expected 4294967295 but got 2147483647. |
- __Failed Test262 tests:__
  - [language/expressions/unsigned-right-shift/S11.7.3_A1.js](https://github.com/tc39/test262/tree/master/test/language/expressions/unsigned-right-shift/S11.7.3_A1.js)
  - [language/expressions/unsigned-right-shift/S11.7.3_A2.1_T1.js](https://github.com/tc39/test262/tree/master/test/language/expressions/unsigned-right-shift/S11.7.3_A2.1_T1.js)
  - [language/expressions/unsigned-right-shift/S11.7.3_A2.2_T1.js](https://github.com/tc39/test262/tree/master/test/language/expressions/unsigned-right-shift/S11.7.3_A2.2_T1.js)
  - [language/expressions/unsigned-right-shift/S11.7.3_A2.4_T1.js](https://github.com/tc39/test262/tree/master/test/language/expressions/unsigned-right-shift/S11.7.3_A2.4_T1.js)
  - [language/expressions/unsigned-right-shift/S11.7.3_A4_T1.js](https://github.com/tc39/test262/tree/master/test/language/expressions/unsigned-right-shift/S11.7.3_A4_T1.js)
  - [language/expressions/unsigned-right-shift/S11.7.3_A4_T2.js](https://github.com/tc39/test262/tree/master/test/language/expressions/unsigned-right-shift/S11.7.3_A4_T2.js)
  - [language/expressions/unsigned-right-shift/S11.7.3_A4_T3.js](https://github.com/tc39/test262/tree/master/test/language/expressions/unsigned-right-shift/S11.7.3_A4_T3.js)
  - [language/expressions/unsigned-right-shift/S11.7.3_A4_T4.js](https://github.com/tc39/test262/tree/master/test/language/expressions/unsigned-right-shift/S11.7.3_A4_T4.js)
  - [language/expressions/unsigned-right-shift/S11.7.3_A5.2_T1.js](https://github.com/tc39/test262/tree/master/test/language/expressions/unsigned-right-shift/S11.7.3_A5.2_T1.js)


## NumberBitwiseOp
- __Section:__ [6.1.6.1.16 NumberBitwiseOp](http://ecma-international.org/ecma-262/11.0/#sec-numberbitwiseop)
- 첫 번째 step에서 `lnum`을 구할 때, [ToInt32](http://ecma-international.org/ecma-262/11.0/#sec-toint32) 대신 [ToUint32](http://ecma-international.org/ecma-262/11.0/#sec-touint32)을
  사용하고 있다.
- __Simple JavaScript code:__
```js
var x = 1 | -1;
```
| JS Engine | Result |
|:-:|:-|
| GraalJS     | Expected 4294967295 but got -1. |
| QuickJS     | Expected 4294967295 but got -1. |
| Moddable XS | Expected 4294967295 but got -1. |
| Google V8   | Expected 4294967295 but got -1. |
- __Failed Test262 tests:__ 위의 경우에 대해서 cover하지 못함
-->
