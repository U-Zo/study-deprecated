"use strict";
// 함수 정의
function disp(n, s, n2) {
    console.log(n, s, n2);
}
disp(100);
disp(100, 'aa');
disp(100, 'hello', 200);
// 함수 정의
function xxx(n) {
    console.log(n);
}
xxx(10);
xxx('20');
function disp2(n, s) {
    console.log(n, s);
}
disp2(100);
disp2('홍길동');
disp2(100, '200');
disp2('aa', 200);
var nums;
nums = [10, 9, 8, 7];
console.log(nums[0], nums[1]);
for (var idx in nums) {
    console.log("in: " + nums[idx]);
}
for (var _i = 0, nums_1 = nums; _i < nums_1.length; _i++) {
    var num_1 = nums_1[_i];
    console.log("of: " + num_1);
}
