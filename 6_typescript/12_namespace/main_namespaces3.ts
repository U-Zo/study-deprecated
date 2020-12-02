namespace MyNamespace {
  export interface IPerson {
    username: string;
    age: number;
  }

  export class Math {
    eng: number;
    kor: number;

    constructor(eng: number, kor: number) {
      this.eng = eng;
      this.kor = kor;
    }

    getInfo() {
      return `${this.eng} ${this.kor}`;
    }
  }

  export const user = {
    name: '이순신',
    age: 33,
  };

  export function print() {
    console.log('===============');
  }
}

const kkk: MyNamespace.IPerson = {
  username: '홍길동',
  age: 10,
};
console.log(`${kkk.username} ${kkk.age}`);

const m = new MyNamespace.Math(100, 200);
console.log(`${m.eng} ${m.kor}`);

console.log(`${MyNamespace.user.name} ${MyNamespace.user.age}`);
MyNamespace.print();

export {};
