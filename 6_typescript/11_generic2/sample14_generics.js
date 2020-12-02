"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
function wrap(param) {
    return param;
}
var a = wrap(100);
var b = wrap('aaa');
var c = wrap(true);
console.log(a + " " + b + " " + c);
function wrap2(param) {
    return param.length;
}
console.log(wrap2([1, 2]));
console.log(wrap2(['a', 'b']));
console.log(wrap2([true, false]));
function wrap3(param) {
    return "" + param.length;
}
console.log(wrap3([1, 2]));
console.log(wrap3(['a', 'b']));
console.log(wrap3([true, false]));
