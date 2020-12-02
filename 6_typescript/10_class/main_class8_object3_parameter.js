"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
var student = {
    username: '홍길동',
    age: 20,
};
function info2(str) {
    console.log(str.username + "\t" + str.age);
}
function info(str) {
    console.log(str.username + "\t" + str.age);
}
info(student);
info2(student);
