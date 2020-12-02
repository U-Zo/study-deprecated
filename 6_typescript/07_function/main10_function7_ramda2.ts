const a = function (x: number) {
  console.log('a', x);
};
a(10);

const a2 = (x: number) => {
  console.log('a2', x);
};
a2(10);

const a3 = (x: number) => {
  console.log('a3', x);
};
a3(10);

const k = function (x: number, y: number) {
  console.log(`k ${x}\t${y}`);
};
k(10, 20);

const k2 = (x: number, y: number) => {
  console.log(`k2 ${x}\t${y}`);
};
k2(10, 20);

export {};
