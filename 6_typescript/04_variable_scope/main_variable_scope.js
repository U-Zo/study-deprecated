"use strict";
var globalNum = 10;
var Numbers = /** @class */ (function () {
    function Numbers() {
        this.numVal = 20;
    }
    Numbers.prototype.xxx = function () {
        var localNum = 40;
        console.log(globalNum, Numbers.sVal); // 전역, static 변수
    };
    Numbers.sVal = 30;
    return Numbers;
}());
console.log(globalNum);
console.log(Numbers.sVal);
var n = new Numbers();
var result = n.numVal;
console.log(result);
n.xxx();
