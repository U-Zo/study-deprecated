"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
function info(str) {
    console.log(str.username + "\t" + str.age);
    // str.username = 'aaa'; // 오류 - 읽기전용
}
info({ username: '홍길동', age: 20 });
info({ username: '홍길동' });
