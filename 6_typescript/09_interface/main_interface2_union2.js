"use strict";
var yyy = {
    firstName: 'Woojo',
    lastName: 'Kim',
    mesg: 'Hi',
    sayHi: function () { return 'Hello world'; },
};
console.log(yyy.mesg);
yyy.mesg = 200;
console.log(yyy.mesg);
yyy.mesg = ['aaa', 'bbb', 'ccc'];
console.log(yyy.mesg);
yyy.mesg = function (x) { return '안녕하세요'; };
var fn = yyy.mesg;
console.log(fn('홍길동'));
