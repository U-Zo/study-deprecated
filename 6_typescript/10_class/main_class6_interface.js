"use strict";
var AgriLoan = /** @class */ (function () {
    function AgriLoan(interest, rebate) {
        this.interest = interest;
        this.rebate = rebate;
    }
    return AgriLoan;
}());
var obj = new AgriLoan(10, 1);
console.log("Interest is " + obj.interest + " Rebate is " + obj.rebate);
var obj2 = new AgriLoan(100, 2); // 다형성
console.log(typeof obj2, obj2 instanceof AgriLoan);
