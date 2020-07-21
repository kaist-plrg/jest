# GraalJS Bugs (early error)

## BindingIdentifier2

- __Section:__ [12.1.1 Early Errors](https://www.ecma-international.org/ecma-262/11.0/index.html#sec-identifiers-static-semantics-early-errors)
- strict mode 시, *await* 는 BindingIdentifier 로 사용될 수 없으나, GraalJS 에서는 SyntaxError 를 띄우지 않음

- __Simple JavaScript code:__

```js
"use strict"; try {  } catch (await) {  }
```

```js
"use strict"; var await, await;
```

## CoverParenthesizedExpressionAndArrowParameterList

- 현재 GraalJS에서 CoverParenthesizedExpressionAndArrowParameterList 에서 `...BindingPattern`에 대해 SyntaxError 를 띄우고 있으나 원래는 SyntaxError가 아님.

- __Simple JavaScript code:__

```js
"use strict"; (...{x}) => {};
```

```js
"use strict"; (x0, ...{x1}) => {};
```