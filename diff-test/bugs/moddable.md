# Moddable XS (xst) Bugs

- report 하는 곳 : https://github.com/Moddable-OpenSource/moddable/issues

|ID|Origin|V8|XS|qjs|js|Assertion|Bug Algo.|Conf.|Example|
|:-:|:-:|:-:|:-:|:-:|:-:|:-:|:-:|:-:|:-|
|MD1  |Moddable| |X| | |Exc|OptionalExpression0Evaluation0|Y|`var x = TypeError ( x ?. ( ) ) ;`|
|MD2  |Moddable| |X| | |Exc|GLOBALDOTNumberDOTprototypeDOTtoString|Y|`var x = Number . prototype . toString . call ( new Number ( 0 ) , 0 ) ;`|
|MD3  |Moddable| |X| |X|Desc|ElementList1ArrayAccumulation1|Y|`var x = { 42 : class   { x (  ) {  } } } ;`|
|MD4  |Moddable| |X| | |Desc|PropertyDefinition2PropertyDefinitionEvaluation0|Y|`var x = [ , ... '' ] ;`|
|MD5  |Moddable| |X| | |Exc|GLOBALDOTArrayDOTprototypeDOTtoString|Y|`Array . prototype . toString . call ( function x (  ) {  } ) ;`|
|MD6-1|Moddable| |X| | |Key|CreateMapIterator|Y|`var x = Map . prototype . keys . call ( new Map ( ) ) ;`|
|MD6-2|Moddable| |X| | |Key|CreateSetIterator|Y|`var x = Set . prototype . values . call ( new Set ( ) ) ;`|
|MD7  |Moddable| |X| | |Exc|ToString|Y|`String . prototype . split . call ( 1 , Symbol . species , 0 , 0 ) ;`|
|MD8  |Moddable| |X| | |Exc|EnumerateObjectProperties|N|`for ( x in 'str' ) ;`|
|MD9-1|Moddable| |X| | |Exc|-|Y|`var x = { p : 0 } ; ( { p : ( Symbol . match ) } = x ) ;`|
|MD9-2|Moddable| |X| | |Exc|-|Y|`var x = [ 1 , 2 , 3 ] ; ( [ , ( Symbol . isConcatSpreadable ) ] = x ) ;`|
|MD10 |Moddable| |X| | |Exc|-|Y|`var x = [ 1 , 2 , 3 ] ; ( [ , undefined ] = x ) ;`|
|MD11 |Moddable| |X| | |Key|GLOBALDOTArrayDOTprototypeDOTslice|Y|`var x = Array . prototype . slice . call ( 'str' , { } , ~ x ) ;`|
|MD12 |Moddable| |X| | |Exc|-|Y|`switch ( '' ) { default : ; class x extends { x } { } }`|
|MD13 |Moddable| |X| | |Exc|-|N|`async function * x ( ) { class x extends new . target { ; } } ; x ( ) ;`|
|MD14 |Moddable| |X| | |Exc|-|N|`do do ; while ( '' ) ; while ( BigInt ( 0 ) ) ;`|
|MD15 |Moddable| |X|X| |Key|BoundFunctionCreate|Y|`var x = Function . prototype . bind . call ( ( ) => { } , ( Symbol . replace ) ) ;`|
|MD16 |Moddable| |X| | |Exc|Await|N|`var x = Promise . race ( { [ Symbol . asyncIterator ] : function ( ) { ; } , [ Symbol . iterator ] : async function ( ) { ; await x ( ) ; } } ) ; async function * x ( ... { ... x } ) { } throw 42 ; async function x ( x ) { ; x ( 42 ) ; }`|
|MD17 |Moddable| |X| | |Key|GeneratorBody0EvaluateBody0|Y|`var x = x `` ; function * x ( ... [ ] ) { }`|
|MD18 |Moddable| |X| | |Desc|ToPropertyDescriptor|Y|`var x = Object . defineProperty ( class { static x ( ) { } } , { [ "set" ] : ( ) => { throw { [ Symbol . toPrimitive ] : function ( x ) { } } ; } , [ { [ Symbol . toPrimitive ] : function ( x ) { } } ] : { [ Symbol . toPrimitive ] : function ( x ) { } } , [ { [ Symbol . toPrimitive ] : function ( x ) { } } ] : async function ( ) { } , [ "get" ] : { [ Symbol . toPrimitive ] : function ( x ) { } } , [ { [ Symbol . toPrimitive ] : function ( x ) { } } ] : { [ Symbol . toPrimitive ] : function ( x ) { } } , [ { [ Symbol . toPrimitive ] : function ( x ) { } } ] : { [ Symbol . toPrimitive ] : function ( x ) { } } } , { [ "set" ] : ( ) => { throw '' ; } , [ { [ Symbol . toPrimitive ] : function ( x ) { } } ] : { [ Symbol . toPrimitive ] : function ( x ) { } } , [ { [ Symbol . toPrimitive ] : function ( x ) { } } ] : async function ( ) { } , [ "get" ] : function ( ) { } , [ { [ Symbol . toPrimitive ] : function ( x ) { } } ] : async function ( x ) { } , [ { [ Symbol . toPrimitive ] : function ( x ) { } } ] : { [ Symbol . toPrimitive ] : function ( x ) { } } } ) ;`|



## Optional Chains - [Reported](https://github.com/Moddable-OpenSource/moddable/issues/403), [Confirmed](https://github.com/Moddable-OpenSource/moddable/issues/403#issuecomment-672295846)
- __Section:__ [12.3.9 Optional Chains](http://ecma-international.org/ecma-262/11.0/#sec-optional-chains)
- Expected no exception but a TypeError is thrown.
- __Simple JavaScript code:__
```js
var x = TypeError ( x ?. ( ) ) ;
var x = Array . prototype . flat . call ( 'str' , x ?. ( ) ) ;
var x = String . prototype . slice . call ( `${ '' }${ x }${ '' }` , 0 , x ?. ( ) ) ;
```

## Number.prototype.toString radix - [Reported](https://github.com/Moddable-OpenSource/moddable/issues/407), [Confirmed](https://github.com/Moddable-OpenSource/moddable/issues/407#issuecomment-672301181)
- __Section:__ [20.1.3.6 Number.prototype.toString](http://ecma-international.org/ecma-262/11.0/#sec-number.prototype.tostring)
- Expected a RangeError to be thrown but no exception was thrown at all
- __Simple JavaScript code:__
```js
var x = Number . prototype . toString . call ( new Number ( 0 ) , 0 ) ;
```

## PropertyDefinitionEvaluation - [Reported](https://github.com/Moddable-OpenSource/moddable/issues/400), [Confirmed](https://github.com/Moddable-OpenSource/moddable/issues/400#issuecomment-674142835)
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
```js
var x = [ , ... '' ] ;
// var x = { * x ( ... [ , x ] ) { } } ; // only GraalJS failed
```

## Array.prototype.toString.call with non-array object - [Reported](https://github.com/Moddable-OpenSource/moddable/issues/404)
- __Section:__ [22.1.3.30 Array.prototype.toString](http://ecma-international.org/ecma-262/11.0/#sec-array.prototype.tostring)
- Expected no exception but a TypeError is thrown.
- __Simple JavaScript code:__
```js
Array . prototype . toString . call ( function *  (  ) {  } ) ;
Array . prototype . toString . call ( ( '' , '' ) ) ;
Array . prototype . toString . call ( function x (  ) {  } ) ;
var x = Array . prototype . toString . call ( Symbol . species ) ;
var x = Array . prototype . toString . call ( Symbol . split ) ;
```
## Map Iterator, Set Iterator - [Reported](https://github.com/Moddable-OpenSource/moddable/issues/405)
- __Section:__
  - [23.1.5.1 CreateMapIterator](http://ecma-international.org/ecma-262/11.0/#sec-createmapiterator)
  - [23.2.5.1 CreateSetIterator](http://ecma-international.org/ecma-262/11.0/#sec-createsetiterator)
- Expected [] but got ["result", "iterable", "index"].
- __Simple JavaScript code:__
```js
var x = Map . prototype . keys . call ( new Map ( ) ) ;
var x = Map . prototype . entries . call ( new Map ( ) ) ;
var x = Set . prototype . entries . call ( new Set ( ) ) ;
var x = Set . prototype . values . call ( new Set ( ) ) ;
```

## String.prototype.split - [Reported](https://github.com/Moddable-OpenSource/moddable/issues/406)
- __Section:__ [21.1.3.20 String.prototype.split](http://ecma-international.org/ecma-262/11.0/#sec-string.prototype.split)
- Expected a TypeError to be thrown but no exception was thrown at all
- __Simple JavaScript code:__
```js
String . prototype . split . call ( 1 , Symbol . species , 0 , 0 ) ;
var x = String . prototype . split . call ( '' , ( Symbol . match ) , { x ( ) { } } ) ;
var x = String . prototype . split . call ( new String ( 0 ) , { [ Symbol . toPrimitive ] : false } , 0 ) ;
```

## ForIn/OfHeadEvaluation - [Reported](https://github.com/Moddable-OpenSource/moddable/issues/409)
- __Section:__
  - [13.7.5.11 Runtime Semantics: LabelledEvaluation](http://ecma-international.org/ecma-262/11.0/#sec-for-in-and-for-of-statements-runtime-semantics-labelledevaluation)
  - [13.7.5.12 Runtime Semantics: ForIn/OfHeadEvaluation](http://ecma-international.org/ecma-262/11.0/#sec-runtime-semantics-forinofheadevaluation)
  - [13.7.5.15 EnumerateObjectProperties](http://ecma-international.org/ecma-262/11.0/#sec-enumerate-object-properties)
- Expected a TypeError to be thrown but no exception was thrown at all
- __Simple JavaScript code:__
```js
for ( { x } in x += '' ) var [ , x  ] = x ;
```
- Expected undefined but got "undefined[object Object]".
- __Simple JavaScript code:__
```js
for ( { x } in x += { x ( ... [ , ... x ] ) {  } } ) var [ , x  ] = `${ '' }` ;
```
- Expected ReferenceError but no exception
- __Simple JavaScript code:__
```js
for ( { x = ++ x } in 'str' ) ;
for ( { x = ( ) => { } } in 'str' ) ;
for ( let x in '0' ) throw { [ "done" ] : async * function ( ) { } } ;
for ( { x = class extends x { static x ( ) { } } } in 'str' ) for ( ; '' , '' ; '' , '' ) ;
for ( { } in 'str' ) for ( let x = x ; '' ; '' ) ;
for ( x in 'str' ) ;
for ( { x , } in 'str' ) ;
```
- Expected exception to throw but no exception
- __Simple JavaScript code:__
```js
for ( let x in '0' ) throw '' ;
```

## Destructuring Assignment - ObjectAssignmentPattern - [Reported](https://github.com/Moddable-OpenSource/moddable/issues/410)
- __Section:__ [12.15.5 Destructuring Assignment](http://ecma-international.org/ecma-262/11.0/#sec-destructuring-assignment)
- SyntaxError: no reference
- __Simple JavaScript code:__
```
for ( ; '' , '' ; '' , '' ) ; ( { x , ... ( Symbol . iterator ) } = false ) ;
var x = [ 1 , 2 , 3 ] ; ( [ , ( Symbol . isConcatSpreadable ) ] = x ) ;
var x = [ 1 , 2 , 3 ] ; ( [ , ... ( Symbol . species ) ] = x ) ;
var x = { p : 0 } ; ( { p : ( Symbol . match ) } = x ) ;
```
- Expected ReferenceError but SyntaxError is thrown
```js
var x = [ 1 , 2 , 3 ] ; ( [ , ... ( Symbol . toStringTag ) ] = x ) ;
```
- Expected TypeError but SyntaxError is thrown
```js
var x = { x : 1 } ; ( { ... ( Symbol . species ) } = x ) ;
var x = [ 1 , 2 , 3 ] ; ( [ , x , ... ( Symbol . hasInstance ) ] = x ) ;
var x = { x : 1 } ; ( { ... ( 42n . species ) } = x ) ;
```

## Destructuring Assignment - ArrayAssignmentPattern - [Reported](https://github.com/Moddable-OpenSource/moddable/issues/416)
- __Section:__ [12.15.5 Destructuring Assignment](http://ecma-international.org/ecma-262/11.0/#sec-destructuring-assignment)
- Expected ReferenceError but SyntaxError is thrown
- __Simple JavaScript code:__
```js
var x = [ 1 , 2 , 3 ] ; ( [ , ( class x extends x `${ '' , '' }${ x }${ '' }` { ; } . isConcatSpreadable ) , ... [ ] ] = x ) ;
```

## Destructuring assignment with undefined - [Reported](https://github.com/Moddable-OpenSource/moddable/issues/418)
- __Section:__ [12.15.5 Destructuring Assignment](http://ecma-international.org/ecma-262/11.0/#sec-destructuring-assignment)
- Expected TypeError but SyntaxError is thrown
- __Simple JavaScript code:__
```js
var x = null ; ( { x , ... undefined } = x ) ;
function x ( ) { for ( var x ; x ?. x [ [ x , , ... x ] , [ x , , '' ] ] , x `${ '' }${ x }${ '' , '' }` ; null , class x extends x ( ) ( ) { } ) for ( [ x , , ... undefined ] in ( - Infinity ) ) continue ; if ( x & x , { } ) ; else ; return [ x [ '' ] , class x extends x { ; ; } , true ] ?. x ( ) ; } var x = new x ;
var x = [ 1 , 2 , 3 ] ; ( [ , ... [ undefined , ] ] = x ) ;
var x = [ 1 , 2 , 3 ] ; ( [ , undefined ] = x ) ;
```

## Array.prototype.slice - [Reported](https://github.com/Moddable-OpenSource/moddable/issues/411)
- __Section:__ [22.1.3.25 Array.prototype.slice ](http://ecma-international.org/ecma-262/11.0/#sec-array.prototype.slice)
- Expected ["length"] but got ["0", "length"]
- __Simple JavaScript code:__
```js
var x = Array . prototype . slice . call ( x => { } , [ , ... '' ] , true ) ;
```
- Expected ["length"] but got ["0", "length"].
```js
var x = Array . prototype . splice . call ( [ , '' ] , ( x => { } ) , x === x ) ;
```
- Expected ["0", "1", "length"] but got ["0", "0", "length"].
```js
var x = Array . prototype . slice . call ( 'str' , { } , ~ x ) ;
```
- Expected ["length"] but got ["0", "length"].
```js
var x = Array . prototype . splice . call ( [ , '' ] , x != x , true , - 0 ) ;
```

## Switch statement - StatementList - [Reported](https://github.com/Moddable-OpenSource/moddable/issues/412)
- __Section:__ [13.12 The switch Statement](http://ecma-international.org/ecma-262/11.0/#sec-switch-statement)
- SyntaxError: missing \}
- __Simple JavaScript code:__
```js
class x { ; ; } switch ( '' ) { default : case x : ; class x extends [ , '' ] { } }
switch ( '' ) { default : ; class x extends x [ '' , '' ] { ; } case x : }
```
- Expected ReferenceError but SyntaxError is thrown
- __Simple JavaScript code:__
```js
switch ( '' ) { default : ; class x extends { x } { } }
switch ( '' ) { case x : ; break ; case x : ; class x extends x ( ) ( ) { } }
```

## NewTarget - [Reported](https://github.com/Moddable-OpenSource/moddable/issues/413)
- __Section:__ [14.4.1 Static Semantics: Early Errors](http://ecma-international.org/ecma-262/11.0/#sec-generator-function-definitions-static-semantics-early-errors)
- SyntaxError: invalid new.target
- __Simple JavaScript code:__
```js
async function * x ( ) { class x extends new . target { ; } } ; x ( ) ;
```

## do-while statement parsing error - [Reported](https://github.com/Moddable-OpenSource/moddable/issues/415)
- __Section:__ [13 ECMAScript Language: Statements and Declarations](http://ecma-international.org/ecma-262/11.0/#sec-ecmascript-language-statements-and-declarations)
- SyntaxError: missing while
- __Simple JavaScript code:__
```js
do do ; while ( '' ) ; while ( BigInt ( 0 ) ) ;
```

## Function.prototype.bind - [Reported](https://github.com/Moddable-OpenSource/moddable/issues/417)
- __Section:__ [19.2.3.2 Function.prototype.bind](http://ecma-international.org/ecma-262/11.0/#sec-function.prototype.bind)
- Expected ["length", "name"] but got ["length", "name", "boundFunction", "boundThis"].
- __Simple JavaScript code:__
```js
var x = Function . prototype . bind . call ( async x => x , 0 ) ; x ( ) ;
var x = Function . prototype . bind . call ( ( ) => { } , ( Symbol . replace ) ) ;
```

## Await - [Reported](https://github.com/Moddable-OpenSource/moddable/issues/419)
- __Section:__ [6.2.3.1 Await](http://ecma-international.org/ecma-262/11.0/#await)
- Expected exception to throw but no exception
- __Simple JavaScript code:__
```js
var x = Promise . race ( { [ Symbol . asyncIterator ] : function ( ) { ; } , [ Symbol . iterator ] : async function ( ) { ; await x ( ) ; } } ) ; async function * x ( ... { ... x } ) { } throw 42 ; async function x ( x ) { ; x ( 42 ) ; }
```

<!-- ## Class, Async toString - ~[Reported1](https://github.com/Moddable-OpenSource/moddable/issues/402), [Reported2](https://github.com/Moddable-OpenSource/moddable/issues/408)~ [Rejected](https://github.com/Moddable-OpenSource/moddable/issues/402#issuecomment-671564992)
- **Implmentation dependent**
- __Section:__
  - [19.2.3.5 Function.prototype.toString](http://ecma-international.org/ecma-262/11.0/#sec-function.prototype.tostring)
  - [14.7.14 Runtime Semantics: Evaluation](http://ecma-international.org/ecma-262/11.0/#sec-async-function-definitions-runtime-semantics-evaluation)
- Expected "undefinedclass x  { static x (  ) {  } }" but got "undefinedfunction x (){[native code]}".
- __Simple JavaScript code:__
```
var x = x += class x  { static x (  ) {  } } ;
```
- __Simple JavaScript code:__
- Expected "class x { ; }" but got "function x (){[native code]}".
```js
var x = String . prototype . substring . call ( class x { ; } , { ... '' } , x ?. x ?. x ) ;
```
- Expected "x => { }" but got "function  (){[native code]}".
- __Simple JavaScript code:__
```js
var x = `${ x => { } }` ;$assert.sameValue(x, "x => { }");
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
- __Simple JavaScript code:__
```js
var x = String . prototype . split . call ( async function * ( ) { } , `${ '' }` , x && x ) ;
``` -->

## Generator Object has unwanted Symbol Property - [Reported](https://github.com/Moddable-OpenSource/moddable/issues/420)
- Expected [] but got [Symbol()]
- __Generated JavaScript code:__
```js
var x = x `` ; function * x ( ... [ ] ) { }
var x = x ( ) ; function * x ( ... [ x , , ] ) { }
```
- __Simple JavaScript code:__
```js
var x = ( function * ( ) { } ) ( )
```

# setter / getter descriptor value - [Reported](https://github.com/Moddable-OpenSource/moddable/issues/421)
- descriptor value should be "get" but "get [object Object]"
- descriptor value should be "set" but "set [object Object]"

- __Generated JavaScript code:__
```js
var x = Object . defineProperty ( class { static x ( ) { } } , { [ "set" ] : ( ) => { throw { [ Symbol . toPrimitive ] : function ( x ) { } } ; } , [ { [ Symbol . toPrimitive ] : function ( x ) { } } ] : { [ Symbol . toPrimitive ] : function ( x ) { } } , [ { [ Symbol . toPrimitive ] : function ( x ) { } } ] : async function ( ) { } , [ "get" ] : { [ Symbol . toPrimitive ] : function ( x ) { } } , [ { [ Symbol . toPrimitive ] : function ( x ) { } } ] : { [ Symbol . toPrimitive ] : function ( x ) { } } , [ { [ Symbol . toPrimitive ] : function ( x ) { } } ] : { [ Symbol . toPrimitive ] : function ( x ) { } } } , { [ "set" ] : ( ) => { throw '' ; } , [ { [ Symbol . toPrimitive ] : function ( x ) { } } ] : { [ Symbol . toPrimitive ] : function ( x ) { } } , [ { [ Symbol . toPrimitive ] : function ( x ) { } } ] : async function ( ) { } , [ "get" ] : function ( ) { } , [ { [ Symbol . toPrimitive ] : function ( x ) { } } ] : async function ( x ) { } , [ { [ Symbol . toPrimitive ] : function ( x ) { } } ] : { [ Symbol . toPrimitive ] : function ( x ) { } } } ) ;
```
- __Simple JavaScript code:__
```js
var x = Object . defineProperty ( { } , "p" , { [ "get" ] : ( ) => { } , [ "set" ] : ( x ) => { } } ) ;
```

# Only occurs when ValidityChecker uses GraalJS

## DestructuringAssignmentTarget early error - [Reported](https://github.com/Moddable-OpenSource/moddable/issues/414)
- __Section:__ [12.15.5.1 Static Semantics: Early Errors](http://ecma-international.org/ecma-262/11.0/#sec-destructuring-assignment-static-semantics-early-errors)
- Expected SyntaxError but no exception
- __Simple JavaScript code:__
```js
var x = '0' ; ( { x , ... { x , } } = x ) ;
```

# Maybe other engines or specification is wrong
- SyntaxError: duplicate variable x
```js
try { } catch ( x ) { ; var x = { '' : '' } ; }
try { ; function * x ( ... [ x , , ] ) { } } catch ( x ) { for ( var x ; ; '' , '' ) ; }
```

# Not covered
- Expected no exception but a SyntaxError is thrown.
```js
var x = eval ( `${ ( ( ) => { ; var x = { async x ( ... [ , x ] ) { } } ; } ) }` ) ;
var x = eval ( `${ async x => '' }` ) ;
var x = eval ( `${ ( ( ) => { ; var x = class extends x { ; } ; } ) }` ) ;
var x = eval ( `${ async function * x ( ) { } }` ) ;
```
