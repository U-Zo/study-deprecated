const a = function (x: number) {
  return x * 10;
};
console.log(a(10));

// 화살표 함수
const a2 = (x: number) => x * 10;
console.log(a2(10));

const a3 = (x: number) => {
  return x + 10;
};
console.log(a3(10));

const a4 = (x: number) => x + 10;
console.log(a4(10));

export {};
