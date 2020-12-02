let num = 5;
let factorial = 1;

for (let i = num; i >= 1; i--) {
  factorial *= i;
}
console.log(factorial);

num = 5;
factorial = 1;
while (num >= 1) {
  factorial = factorial * num;
  num--;
}
console.log(factorial);

// do ~ while
let n = 10;
do {
  console.log(n);
  n--;
} while (n >= 0);

// for ~ in
const x = [1, 2, 3];
for (const x2 in x) {
  console.log(x2, x[x2]);
}

const xx: any = 'abc';
for (const x2 in xx) {
  console.log('>>', xx[x2]);
}

const xxx: any = { k: 100, k2: 200, k3: 300 };
for (const x2 in xxx) {
  console.log('>>', x2, xxx[x2]);
}

// for ~ of
const y = 'abc';
for (const y2 of y) {
  console.log(y2);
}

const yy = ['a2', 'b2', 'c2'];
for (const y2 of yy) {
  console.log(y2);
}

// const yyy = { k: 100, k2: 200, k3: 300 };
// for (const y2 of yyy) {
//   console.log(y2);
// }

export {};
