let num1 = 10;
let num2 = 3;

num1++;
console.log(`++: ${num1}`);
num2--;
console.log(`--: ${num2}`);

let num3 = 10;
let num4 = ++num3;
console.log(`전치 ${num3} ${num4}`);

let num5 = num3++;
console.log(`후치 ${num3} ${num5}`);

export {};
