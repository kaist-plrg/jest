# Moddable XS (xst) Bugs

- report 하는 곳 : https://github.com/Moddable-OpenSource/moddable/issues

## PropertyDefinitionEvaluation - [Reported](https://github.com/Moddable-OpenSource/moddable/issues/400)
- __Section:__ [12.2.6.8 Runtime Semantics: PropertyDefinitionEvaluation](http://ecma-international.org/ecma-262/11.0/#sec-object-initializer-runtime-semantics-propertydefinitionevaluation)
- descriptor value should be "42" but ""
- __Simple JavaScript code:__
```
var x = { 42 : class   { x (  ) {  } } } ;
```

## ArrayAccumulation - [Reported](https://github.com/Moddable-OpenSource/moddable/issues/401)
- __Section:__ [12.2.5.1 Runtime Semantics: ArrayAccumulation](http://ecma-international.org/ecma-262/11.0/#sec-runtime-semantics-arrayaccumulation)
- descriptor value should be 1 but 0
- __Simple JavaScript code:__
```
var x = [ , ... '' ] ;
var x = { * x ( ... [ , x ] ) { } } ;
```

## Class Object toString - [Reported](https://github.com/Moddable-OpenSource/moddable/issues/402)
- __Section:__ [19.2.3.5 Function.prototype.toString](http://ecma-international.org/ecma-262/11.0/#sec-function.prototype.tostring)
- Expected "undefinedclass x  { static x (  ) {  } }" but got "undefinedfunction x (){[native code]}".
- __Simple JavaScript code:__
```
var x = x += class x  { static x (  ) {  } } ;
```

- Expected no exception but a TypeError is thrown.
```
Array . prototype . toString . call ( function *  (  ) {  } ) ;
Array . prototype . toString . call ( ( '' , '' ) ) ;
Array . prototype . toString . call ( function x (  ) {  } ) ;
var x = String . prototype . slice . call ( `${ '' }${ x }${ '' }` , 0 , x ?. ( ) ) ;
var x = Array . prototype . flat . call ( 'str' , x ?. ( ) ) ;
var x = TypeError ( x ?. ( ) ) ;
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

- Expected [] but got ["result", "iterable", "index"].
```
var x = Map . prototype . keys . call ( new Map ( ) ) ;
var x = Map . prototype . entries . call ( new Map ( ) ) ;
var x = Set . prototype . entries . call ( new Set ( ) ) ;
var x = Set . prototype . values . call ( new Set ( ) ) ;
```

- Expected no exception but a SyntaxError is thrown.
```
var x = eval ( `${ ( ( ) => { ; var x = { async x ( ... [ , x ] ) { } } ; } ) }` ) ;
var x = eval ( `${ async x => '' }` ) ;
var x = eval ( `${ ( ( ) => { ; var x = class extends x { ; } ; } ) }` ) ;
var x = eval ( `${ async function * x ( ) { } }` ) ;
class x { ; ; } switch ( '' ) { default : case x : ; class x extends [ , '' ] { } }
try { ; function * x ( ... [ x , , ] ) { } } catch ( x ) { for ( var x ; ; '' , '' ) ; }
var x = Array . prototype . slice . call ( x => { } , [ , ... '' ] , true ) ;
```

- SyntaxError: duplicate variable x
```
try { } catch ( x ) { ; var x = { '' : '' } ; }
```

- Expected a RangeError to be thrown but no exception was thrown at all
```
var x = Number . prototype . toString . call ( new Number ( 0 ) , 0 ) ;
```

- Expected ["0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21    ", "22", "23", "length"] but got ["0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17",     "18", "19", "20", "21", "22", "23", "24", "25", "26", "length"].
- 223 descriptor value should be "}" but "d"
- 224 descriptor value should be "y" but "n"
- 225 descriptor value should be "t" but "("
- 226 descriptor value should be "(" but "i"
- 227 descriptor value should be " " but "v"
- 228 descriptor value should be "a" but "f"
- 229 descriptor value should be "*" but "a"
- 230 descriptor value should be "c" but "t"
- 231 descriptor value should be "c" but " "
- 232 descriptor value should be " " but "o"
- 233 descriptor value should be "u" but "n"
- 234 descriptor value should be " " but "n"
- 235 descriptor value should be "i" but ")"
- 236 descriptor value should be 24 but 27
- 237 descriptor value should be "{" but "c"
- 238 descriptor value should be " " but "t"
- 239 descriptor value should be "n" but "["
- 240 descriptor value should be "f" but "o"
- 241 descriptor value should be "s" but "u"
- 242 descriptor value should be "o" but "{"
- 243 descriptor value should be "n" but " "
- 244 descriptor value should be ")" but "e"
- 245 descriptor value should be "n" but "c"
- 246 descriptor value should be " " but "i"
```
var x = String . prototype . split . call ( async function * ( ) { } , `${ '' }` , x && x ) ;
```

- SyntaxError: missing \}
```
switch ( '' ) { default : ; class x extends x [ '' , '' ] { ; } case x : }
```

- Expected a TypeError to be thrown but no exception was thrown at all
```
var x = String . prototype . split . call ( '' , ( Symbol . match ) , { x ( ) { } } ) ;

```

- SyntaxError: no reference
```
for ( ; '' , '' ; '' , '' ) ; ( { x , ... ( Symbol . iterator ) } = false ) ;
var x = [ 1 , 2 , 3 ] ; ( [ , ( Symbol . isConcatSpreadable ) ] = x ) ;
var x = [ 1 , 2 , 3 ] ; ( [ , ... ( Symbol . species ) ] = x ) ;
var x = { p : 0 } ; ( { p : ( Symbol . match ) } = x ) ;
```

- SyntaxError: invalid new.target
```
async function * x ( ) { class x extends new . target { ; } } ; x ( ) ;
```

- Expected no exception but a TypeError is thrown
```
var x = Array . prototype . toString . call ( Symbol . species ) ;
```
