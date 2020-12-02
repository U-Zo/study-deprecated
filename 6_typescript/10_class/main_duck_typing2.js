"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
var p = {
    x: 10,
    y: 10,
};
console.log(p.x + "\t" + p.y);
var XXXX = /** @class */ (function () {
    function XXXX(x, y) {
        this.x = x;
        this.y = y;
    }
    return XXXX;
}());
var k = new XXXX(10, 20);
console.log(k.x + "\t" + k.y);
function kkkk(k, k2) {
    console.log(k.x + "\t" + k.y);
    console.log(k2.x + "\t" + k2.y);
}
kkkk({ x: 1, y: 2 }, { x: 3, y: 4 });
kkkk({ x: 5, y: 6 }, { x: 7, y: 8 });
