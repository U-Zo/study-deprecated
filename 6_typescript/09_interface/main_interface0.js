"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
function xyz(p) {
    console.log(p.label);
}
var m = { size: 10, label: '홍' };
xyz(m);
function xyz2(p) {
    console.log(p.size, '\t', p.label);
}
var m1 = { size: 10, label: '홍' };
xyz2(m1);
var m2 = { label: '홍' };
