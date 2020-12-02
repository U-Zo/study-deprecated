class BBB {
  num: number;
  info(num: number) {
    console.log(num);
  }
  constructor(public num2: number) {
    console.log(num2);
    this.num = num2;
  }
}

const x = new BBB(100);
console.log(x.num2);
console.log(x.num);

export {};
