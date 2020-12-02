"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
function testParam(n1, s1) {
    n1 = 200;
    console.log('n1 =', n1);
    console.log(s1);
}
var num = 100;
testParam(num, 'this is a string');
console.log(num);
var Person = /** @class */ (function () {
    function Person(n) {
        this.username = n;
    }
    Person.prototype.setUsername = function (n) {
        this.username = n;
    };
    Person.prototype.getUsername = function () {
        return this.username;
    };
    return Person;
}());
var p = new Person('홍길동');
function testParam2(pp) {
    pp.setUsername('이순신');
}
testParam2(p);
console.log(p.getUsername());
var str = ['홍길동', '이순신', '유관순'];
function changeName(s) {
    s[0] = '강감찬';
}
console.log('변경 전', str);
changeName(str);
console.log('변경 후', str);
