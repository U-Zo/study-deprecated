"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
var person = {
    firstName: 'Woojo',
    lastName: 'Kim',
    sayEcho: function () { },
    email: '',
};
person.sayEcho = function () {
    console.log('SayEcho');
    return 'test';
};
person.email = 'test@test.com';
console.log(person);
