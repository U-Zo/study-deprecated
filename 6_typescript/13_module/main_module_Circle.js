"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
var Circle = /** @class */ (function () {
    function Circle() {
    }
    Circle.prototype.draw = function () {
        console.log('Circle is drawn(external Module)');
    };
    return Circle;
}());
exports.default = Circle;
