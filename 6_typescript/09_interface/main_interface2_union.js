"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
var kkk = {
    firstName: 'Woojo',
    lastName: 'Kim',
    mesg: 'Hi',
    sayHi: function () { return 'Hello world'; },
};
console.log(kkk.mesg);
// ===========================================
kkk.mesg = 200;
console.log(kkk.mesg);
kkk.mesg = ['aaa', 'bbb', 'ccc'];
console.log(kkk.mesg);
