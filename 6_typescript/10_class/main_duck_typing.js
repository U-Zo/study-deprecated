"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
var Sparrow = /** @class */ (function () {
    function Sparrow() {
        this.sound = '참새 짹짹';
    }
    return Sparrow;
}());
var Parrot = /** @class */ (function () {
    function Parrot() {
        this.sound = '앵무새 안녕';
    }
    return Parrot;
}());
var Duck = /** @class */ (function () {
    function Duck() {
        this.sound = '오리 꽥꽥';
    }
    Duck.prototype.swim = function () {
        console.log('오리가 헤엄침');
    };
    return Duck;
}());
var parrot = new Sparrow();
var sparrow = new Parrot();
var parrotTwo = new Duck();
console.log(parrot.sound);
console.log(sparrow.sound);
console.log(parrotTwo.sound);
var xxx = parrotTwo;
xxx.swim();
