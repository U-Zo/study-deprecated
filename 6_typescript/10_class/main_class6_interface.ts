interface ILoan {
  interest: number;
}

class AgriLoan implements ILoan {
  interest;
  rebate: number;
  constructor(interest: number, rebate: number) {
    this.interest = interest;
    this.rebate = rebate;
  }
}

const obj = new AgriLoan(10, 1);
console.log(`Interest is ${obj.interest} Rebate is ${obj.rebate}`);

const obj2: ILoan = new AgriLoan(100, 2); // 다형성
console.log(typeof obj2, obj2 instanceof AgriLoan);
