class Encapsulate {
  str: string = 'hello';
  private str2: string = 'world';
}

const obj = new Encapsulate();
console.log(obj.str);
// console.log(obj.str2); // 접근 불가

class A {
  public a: number = 10;
  private b: number = 20;
  protected c: number = 30;
}

class B extends A {
  info() {
    console.log(this.a);
    // console.log(this.b); // 접근 불가
    console.log(this.c);
  }
}

const aa = new B();
aa.info();

export {};
