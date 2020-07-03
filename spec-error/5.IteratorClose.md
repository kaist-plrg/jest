- IteratorClose에서 completion.[[Type]]을 return에 대해서 가져오기도 전에 해야
  되는데, return을 하기도 가져오고 실행까지 하고 나서 검사함
- language/statements/for-of/iterator-close-throw-get-method-abrupt.js
- language/statements/for-of/iterator-close-throw-get-method-non-callable.js
