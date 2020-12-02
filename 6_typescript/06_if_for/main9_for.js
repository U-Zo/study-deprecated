"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
var num = 5;
var factorial = 1;
for (var i = num; i >= 1; i--) {
    factorial *= i;
}
console.log(factorial);
num = 5;
factorial = 1;
while (num >= 1) {
    factorial = factorial * num;
    num--;
}
console.log(factorial);
// do ~ while
var n = 10;
do {
    console.log(n);
    n--;
} while (n >= 0);
// for ~ in
var x = [1, 2, 3];
for (var x2 in x) {
    console.log(x2, x[x2]);
}
var xx = 'abc';
for (var x2 in xx) {
    console.log('>>', xx[x2]);
}
var xxx = { k: 100, k2: 200, k3: 300 };
for (var x2 in xxx) {
    console.log('>>', x2, xxx[x2]);
}
// for ~ of
var y = 'abc';
for (var _i = 0, y_1 = y; _i < y_1.length; _i++) {
    var y2 = y_1[_i];
    console.log(y2);
}
var yy = ['a2', 'b2', 'c2'];
for (var _a = 0, yy_1 = yy; _a < yy_1.length; _a++) {
    var y2 = yy_1[_a];
    console.log(y2);
}
