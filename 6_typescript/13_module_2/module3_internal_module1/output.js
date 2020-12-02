var xyz;
(function (xyz) {
    var MyDate = /** @class */ (function () {
        function MyDate() {
        }
        return MyDate;
    }());
    xyz.MyDate = MyDate;
})(xyz || (xyz = {}));
var MyDate = /** @class */ (function () {
    function MyDate() {
    }
    return MyDate;
}());
/// <reference path="./aa.ts" />
var kkk = new xyz.MyDate();
kkk.day = 200;
console.log(kkk.day);
var kkk2 = new MyDate();
kkk2.month = 10;
console.log(kkk2);
