"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
var Person = /** @class */ (function () {
    function Person(username, age, email) {
        this.username = username;
        this.age = age;
        this.email = email;
    }
    Person.prototype.getInfo = function () {
        return this.username + " " + this.age + " " + this.email;
    };
    return Person;
}());
var xxx = new Person('홍길동', 20, 'aa@daum.net');
console.log(xxx.getInfo());
