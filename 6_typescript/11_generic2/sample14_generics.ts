function wrap<T>(param: T): T {
  return param;
}

const a = wrap(100);
const b = wrap('aaa');
const c = wrap(true);
console.log(`${a} ${b} ${c}`);

function wrap2<T>(param: T[]): number {
  return param.length;
}

console.log(
  wrap2<number>([1, 2])
);
console.log(
  wrap2<string>(['a', 'b'])
);
console.log(
  wrap2<boolean>([true, false])
);

function wrap3<T>(param: T[]): string {
  return `${param.length}`;
}

console.log(
  wrap3<number>([1, 2])
);
console.log(
  wrap3<string>(['a', 'b'])
);
console.log(
  wrap3<boolean>([true, false])
);

export {};
