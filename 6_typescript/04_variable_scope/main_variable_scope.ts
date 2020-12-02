const globalNum = 10;

class Numbers {
  numVal = 20;
  static sVal = 30;

  xxx(): void {
    const localNum = 40;
    console.log(globalNum, Numbers.sVal); // 전역, static 변수
  }
}

console.log(globalNum);
console.log(Numbers.sVal);

const n = new Numbers();
const result: number = n.numVal;
console.log(result);
n.xxx();
