"use strict";
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
function wrap(param) {
    console.log(param.getValue());
}
var p = new Box();
p.setValue('홍길동');
var p2 = new Box();
p2.setValue(10);
wrap(p);
wrap(p2);
