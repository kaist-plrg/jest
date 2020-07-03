- ArraySetLength에서 succeeded가 false인 경우를 test262가 cover하지 못해서,
  cover하도록 아래와 같이 코드를 만들게 됨
- 아래의 코드 실행 시, ES2020에서는 Object.defineProperty이 DefinePropertyOrThrow을
  호출하는데, [[DefineOwnProperty]]가 false를 return하고 TypeError를 띄워야 한다고 설명.
- Chrome / Node.js 에서는 오류 없이 성공적으로 []를 return한다.
```
(() => { 'use strict'; var arr = [42]; Object.defineProperty(arr, 'length', { value: 0, enumerable: true }); return arr; })()
```
