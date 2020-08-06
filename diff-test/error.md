# Engine Bugs

### GraalJS (js)

- only no error
```
for ( [  ] in { [ '' ] : '' } ) for ( 1 ?. x . x in 'str' ) ;
for ( [  ] in { set x ( x  ) {  } } ) for ( { x ( ... [ , ... x ] ) {  } } ?. x . x in { async * x (  ) {  } } ) ;
```

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

- Expected ["0", "2", "length"] but got ["0", "length"].
Expected true but gotfalse
Expected no exception but a TypeError is thrown.
```
var x = new Set ( [ , , ] ) ; var x = [ x , , ... x ] ;
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
var x = `${ '' , '' }${ '' }` ;
```

- SyntaxError: invalid destructuring target
```
for ( [  x ?. x [ '' , '' ] ,  ... [  x , , ... x ] ] of [  [  ] ] ) for ( var x  ; '' , '' ; '' , '' ) ;
```

- SyntaxError: variable name expected
```
function x ( ... [ , ... x ] ) {  } var { '' : { } = new class  extends x `${ '' }${ x }${ '' }` { ; } ( { set x ( x  ) {  } } ) } = async x => {  } ;
function x ( ... [ , ,  ] ) {  } var { '' : { } = x `${ '' }${ '' }` } = async x => {  } ;
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

- Expected undefined but got "undefined[object Object]".
```
for ( { x } in x += { x ( ... [ , ... x ] ) {  } } ) var [ , x  ] = `${ '' }` ;
```

- Expected a TypeError to be thrown but no exception was thrown at all
```
for ( { x } in x += '' ) var [ , x  ] = x ;
String . prototype . split . call ( 1 , Symbol . species , 0 , 0 ) ;
```


### V8 (node)

- UnhandledPromiseRejectionWarning: TypeError: number 0 is not iterable (cannot read property Symbol(Symbol.iterator))
```
Promise . all ( 0 ) ;
Promise . allSettled ( 0 , 0 ) ;
```

- UnhandledPromiseRejectionWarning: TypeError: x is not a function
```
( async x => x `${ '' }${ x }${ '' }` ) ( ) ;
```
