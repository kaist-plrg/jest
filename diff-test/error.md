# Engine Bugs

### GraalJS (js)

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

### QuickJS (qjs)

- Expected a ReferenceError to be thrown but no exception was thrown at all
```
let x = { x , x } = { async x ( x  ) {  } } ;
```

- Expected a ReferenceError but got a TypeError
```
const x = x = '' ;
const x = x = class x extends x { ; } ;
```

- SyntaxError: expected '}' after template expression
```
`${ '' }${ '' , '' }` . from ( '' ) ;
```

- SyntaxError: invalid destructuring target
```
for ( [  x ?. x [ '' , '' ] ,  ... [  x , , ... x ] ] of [  [  ] ] ) for ( var x  ; '' , '' ; '' , '' ) ;
```

### Moddable XS (xst)

- descriptor value should be "42" but ""
```
var x = { 42 : class   { x (  ) {  } } } ;
```

- Expected "undefinedclass x  { static x (  ) {  } }" but got "undefinedfunction x (){[native code]}".
```
var x = x += class x  { static x (  ) {  } } ;
```

- Expected no exception but a TypeError is thrown.
```
Array . prototype . toString . call ( function *  (  ) {  } ) ;
Array . prototype . toString . call ( ( '' , '' ) ) ;
Array . prototype . toString . call ( function x (  ) {  } ) ;
```

### V8 (node)
