- Function expression들(ArrowFunction, FunctionExpression, AsyncFunctionExpression,
  ...)에서 이름이 주어지지 않은 Evaluation의 경우에 아예 설정을 안하거나 "default"를
  할당하는데, test에서는 항상 ""를 할당하라고 하고 실제 구현들에서도 ""를 할당하고
  있음

- failed:
  - built-ins/Promise/all/resolve-element-function-name.js
  - built-ins/Promise/allSettled/reject-element-function-name.js
  - built-ins/Promise/allSettled/resolve-element-function-name.js
  - built-ins/Promise/executor-function-name.js
  - built-ins/Promise/reject-function-name.js
  - built-ins/Promise/resolve-function-name.js
  - built-ins/ThrowTypeError/name.js
  - built-ins/ThrowTypeError/name.js
  - language/expressions/arrow-function/name.js
  - language/expressions/assignment/fn-name-lhs-cover.js
  - language/expressions/assignment/fn-name-lhs-member.js
  - language/expressions/async-arrow-function/name.js
  - language/expressions/async-function/name.js
  - language/expressions/async-generator/name.js
  - language/expressions/class/name.js
  - language/expressions/function/name.js
  - language/expressions/generators/name.js
