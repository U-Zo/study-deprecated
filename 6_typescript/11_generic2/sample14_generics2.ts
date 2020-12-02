class Box<T> {
  obj: T = {} as T;

  setValue(obj: T) {
    this.obj = obj;
  }

  getValue() {
    return this.obj;
  }
}

function wrap<T>(param: T) {
  console.log((<Box<string>>(<any>param)).getValue());
}

const p: Box<string> = new Box<string>();
p.setValue('홍길동');

const p2: Box<number> = new Box<number>();
p2.setValue(10);

wrap(p);
wrap(p2);
