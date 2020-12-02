"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
var Box = /** @class */ (function () {
    function Box() {
    }
    Box.prototype.setValue = function (obj) {
        this.obj = obj;
    };
    Box.prototype.getValue = function () {
        return this.obj;
    };
    return Box;
}());
var a = new Box();
a.setValue('홍길동');
var str = a.getValue();
console.log(str);
var b = new Box();
b.setValue(new Date());
var str2 = b.getValue();
console.log(str2);
