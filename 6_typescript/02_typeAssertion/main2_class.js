"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
var person_1 = require("./person");
var p = {
    name: '홍길동',
    age: 20,
    address: '서울',
};
console.log(p);
var p2 = p;
console.log(p2);
var p3 = new person_1.Person('홍길동', 20, '서울');
console.log(p3);
console.log(p3.getName() + "\t" + p3.getAge());
