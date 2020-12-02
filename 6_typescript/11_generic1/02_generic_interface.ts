interface Product {
  mesg: (x: any) => any;
}

class Car implements Product {
  mesg(x: any) {
    return x;
  }
}

const c = new Car();
const m = c.mesg('홍길동');
console.log(m);

const c2 = new Car();
const m2 = c2.mesg(new Date());
console.log(m2);

export {};
