class Box {
  obj: any;

  setValue(obj: any) {
    this.obj = obj;
  }

  getValue() {
    return this.obj;
  }
}

const a: Box = new Box();
a.setValue('홍길동');

const str: string = a.getValue() as string;
console.log(str);

const b: Box = new Box();
b.setValue(new Date());
const str2: Date = b.getValue() as Date;
console.log(str2);

export {};
