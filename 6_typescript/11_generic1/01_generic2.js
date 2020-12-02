"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
var Box = /** @class */ (function () {
    function Box() {
        this.obj = {};
    }
    Box.prototype.setValue = function (obj) {
        this.obj = obj;
    };
    Box.prototype.getValue = function () {
        return this.obj;
    };
    return Box;
}());
var x = new Box();
x.setValue('홍길동');
var xx = x.getValue();
console.log(xx);
var y = new Box();
y.setValue(new Date());
var yy = y.getValue();
console.log(yy);
