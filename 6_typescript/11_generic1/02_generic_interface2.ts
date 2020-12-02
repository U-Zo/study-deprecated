interface Product<T> {
  mesg: (x: T) => T;
}

class Car<T> implements Product<T> {
  mesg(x: T) {
    return x;
  }
}

const c: Car<string> = new Car<string>();
const m = c.mesg('이순신');
console.log(m);

const d: Car<Date> = new Car<Date>();
const m2 = d.mesg(new Date());
console.log(m2);

export {};
