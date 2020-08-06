# QuickJS (qjs) Bugs

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

- Expected a ReferenceError but got a TypeError
```
const x = x = '' ;
```

- Expected no exception but a InternalError is thrown.
```
var x = String . prototype . padStart . call ( 42n , Infinity , [ ] ) ;
```

- Expected no exception but a TypeError is thrown.
```
var x = x `` ; function * x ( ... { [ '' ] : { } = x } ) { ; var [ x , , ... x ] = x ; }
```

- Expected undefined but got 0.
```
var [ x ] = { [ Symbol . asyncIterator ] : false , [ Symbol . iterator ] : function * ( ) { ; return 0 ; yield 0 ; } } ;
```
