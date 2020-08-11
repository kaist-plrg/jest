"use strict";
// var x = Function . prototype . bind . call ( async x => x , 0 ) ;
// var id = x => x;
// var x = id(async x => x);
var x = (async x => x).bind(0);
console.log( JSON.stringify(Object.getOwnPropertyNames(x)) )
