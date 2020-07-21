# GraalJS Bugs (early error)

## 

- __Section:__

- __Simple JavaScript code:__

```js
"use strict"; try {  } catch (await) {  }
```

```js
"use strict"; var await, await;
```

## 

- __Section:__

- __Simple JavaScript code:__

```js
"use strict"; (...{x}) => {};
```

```js
"use strict"; (x0, ...{x1}) => {};
```