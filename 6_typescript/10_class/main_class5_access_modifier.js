"use strict";
var __extends = (this && this.__extends) || (function () {
    var extendStatics = function (d, b) {
        extendStatics = Object.setPrototypeOf ||
            ({ __proto__: [] } instanceof Array && function (d, b) { d.__proto__ = b; }) ||
            function (d, b) { for (var p in b) if (Object.prototype.hasOwnProperty.call(b, p)) d[p] = b[p]; };
        return extendStatics(d, b);
    };
    return function (d, b) {
        extendStatics(d, b);
        function __() { this.constructor = d; }
        d.prototype = b === null ? Object.create(b) : (__.prototype = b.prototype, new __());
    };
})();
Object.defineProperty(exports, "__esModule", { value: true });
var Encapsulate = /** @class */ (function () {
    function Encapsulate() {
        this.str = 'hello';
        this.str2 = 'world';
    }
    return Encapsulate;
}());
var obj = new Encapsulate();
console.log(obj.str);
// console.log(obj.str2); // 접근 불가
var A = /** @class */ (function () {
    function A() {
        this.a = 10;
        this.b = 20;
        this.c = 30;
    }
    return A;
}());
var B = /** @class */ (function (_super) {
    __extends(B, _super);
    function B() {
        return _super !== null && _super.apply(this, arguments) || this;
    }
    B.prototype.info = function () {
        console.log(this.a);
        // console.log(this.b); // 접근 불가
        console.log(this.c);
    };
    return B;
}(A));
var aa = new B();
aa.info();
