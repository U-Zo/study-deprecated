// 함수 선언
function disp(n: number): void;
function disp(n: number, s: string): void;
function disp(n: number, s: string, n2: number): void;

// 함수 정의
function disp(n: number, s?: string, n2?: number) {
  console.log(n, s, n2);
}

disp(100);
disp(100, 'aa');
disp(100, 'hello', 200);

// 함수 선언
function xxx(n: number): void;
function xxx(n: string): void;

// 함수 정의
function xxx(n: any) {
  console.log(n);
}

xxx(10);
xxx('20');

// 함수의 선언
function disp2(n: number): void;
function disp2(s: string): void;
function disp2(s: string, n: number): void;
function disp2(n: number, s: string): void;

function disp2(n: any, s?: any) {
  console.log(n, s);
}

disp2(100);
disp2('홍길동');
disp2(100, '200');
disp2('aa', 200);

let nums: number[];
nums = [10, 9, 8, 7];
console.log(nums[0], nums[1]);

for (const idx in nums) {
  console.log(`in: ${nums[idx]}`);
}

for (const num of nums) {
  console.log(`of: ${num}`);
}
