# ECMAScript 2020 Bugs (early error)

## 

- __Section:__

- __Simple JavaScript code:__

```js
"use strict"; try {  } catch (await) {  }
```

```js
"use strict"; var await, await;
```