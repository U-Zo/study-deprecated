interface IPerson {
  firstName: string;
  lastName: string;
  mesg: string | number | string[];
  sayHi: () => string;
}

const kkk: IPerson = {
  firstName: 'Woojo',
  lastName: 'Kim',
  mesg: 'Hi',
  sayHi: () => 'Hello world',
};

console.log(kkk.mesg);

// ===========================================
kkk.mesg = 200;

console.log(kkk.mesg);

kkk.mesg = ['aaa', 'bbb', 'ccc'];
console.log(kkk.mesg);

export {};
