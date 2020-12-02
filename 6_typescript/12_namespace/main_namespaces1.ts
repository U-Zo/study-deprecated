class MyDate {
  day: number = {} as number;
}

const m: MyDate = new MyDate();
console.log(m.day);
m.day = 20;

console.log(m.day);

export {};
