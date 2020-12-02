class ZZZ {
  constructor(public num: number, public str: string) {
    console.log(`${num} ${str}`);
  }
}

const zzz = new ZZZ(100, '김');
console.log(`${zzz.num} ${zzz.str}`);

export {};
