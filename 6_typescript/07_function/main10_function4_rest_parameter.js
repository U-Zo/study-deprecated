"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
function testParam() {
    var n = [];
    for (var _i = 0; _i < arguments.length; _i++) {
        n[_i] = arguments[_i];
    }
    console.log(n);
}
testParam(1, 2, 3);
testParam(10, 20, 30, 40, 50);
function testParam2(x, y) {
    var n = [];
    for (var _i = 2; _i < arguments.length; _i++) {
        n[_i - 2] = arguments[_i];
    }
    console.log(x, y, n);
}
testParam2(1, 2, 'aaa', 'bbb', 'ccc');
testParam2('a', 'b', 'c', 'd', 'e');
