"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
var person = {
    firstName: 'Woojo',
    lastName: 'Kim',
    sayEcho: function () {
        console.log('sayEcho()');
    },
    phones: ['010', '032'],
};
console.log(person.firstName);
console.log(person.lastName);
person.sayEcho();
console.log(person.phones[0], person.phones[1]);
