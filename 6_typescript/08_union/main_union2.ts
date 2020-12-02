function aaa(n: any): string | number {
  return n;
}

const x: string | number = aaa({ kkk: 100, kkk2: 200 });
const x2: string | number = aaa(2000);

console.log(x, x2);

export {};
