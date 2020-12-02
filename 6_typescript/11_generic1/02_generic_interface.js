"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
var Car = /** @class */ (function () {
    function Car() {
    }
    Car.prototype.mesg = function (x) {
        return x;
    };
    return Car;
}());
var c = new Car();
var m = c.mesg('홍길동');
console.log(m);
var c2 = new Car();
var m2 = c2.mesg(new Date());
console.log(m2);
