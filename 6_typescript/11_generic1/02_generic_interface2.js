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
var m = c.mesg('이순신');
console.log(m);
var d = new Car();
var m2 = d.mesg(new Date());
console.log(m2);
