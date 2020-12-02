"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
var BBB = /** @class */ (function () {
    function BBB(num2) {
        this.num2 = num2;
        console.log(num2);
        this.num = num2;
    }
    BBB.prototype.info = function (num) {
        console.log(num);
    };
    return BBB;
}());
var x = new BBB(100);
console.log(x.num2);
console.log(x.num);
