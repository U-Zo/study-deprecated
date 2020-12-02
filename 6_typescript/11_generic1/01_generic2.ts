class Box<T> {
  obj: T = <T>{};

  setValue(obj: T) {
    this.obj = obj;
  }

  getValue(): T {
    return this.obj;
  }
}

const x: Box<string> = new Box<string>();
x.setValue('홍길동');

const xx: string = x.getValue();
console.log(xx);

const y: Box<Date> = new Box<Date>();
y.setValue(new Date());

const yy: Date = y.getValue();
console.log(yy);

export {};
