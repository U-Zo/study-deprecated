"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
var customer = {
    firstName: '우조',
    lastName: '김',
    sayHi: function () { return '안녕하세요!'; },
};
console.log('Customer Object');
console.log(customer.firstName);
console.log(customer.lastName);
console.log(customer.sayHi());
var xxx = {
    aaa: function () {
        return 'aa';
    },
    bbb: function () {
        return 'bb';
    },
    ccc: function () { return 'cc'; },
    ddd: function (n) { return n; },
};
console.log(xxx.aaa());
console.log(xxx.bbb());
console.log(xxx.ccc());
console.log(xxx.ddd(1111));
