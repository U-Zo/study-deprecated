"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
var MyNamespace;
(function (MyNamespace) {
    var Math = /** @class */ (function () {
        function Math(eng, kor) {
            this.eng = eng;
            this.kor = kor;
        }
        Math.prototype.getInfo = function () {
            return this.eng + " " + this.kor;
        };
        return Math;
    }());
    MyNamespace.Math = Math;
    MyNamespace.user = {
        name: '이순신',
        age: 33,
    };
    function print() {
        console.log('===============');
    }
    MyNamespace.print = print;
})(MyNamespace || (MyNamespace = {}));
var kkk = {
    username: '홍길동',
    age: 10,
};
console.log(kkk.username + " " + kkk.age);
var m = new MyNamespace.Math(100, 200);
console.log(m.eng + " " + m.kor);
console.log(MyNamespace.user.name + " " + MyNamespace.user.age);
MyNamespace.print();
