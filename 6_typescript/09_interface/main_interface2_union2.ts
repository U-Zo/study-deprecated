interface IPerson {
  firstName: string;
  lastName: string;
  mesg: string | number | string[] | ((x: any) => string);
  sayHi: () => string;
}

const yyy: IPerson = {
  firstName: 'Woojo',
  lastName: 'Kim',
  mesg: 'Hi',
  sayHi: () => 'Hello world',
};

console.log(yyy.mesg);

yyy.mesg = 200;
console.log(yyy.mesg);

yyy.mesg = ['aaa', 'bbb', 'ccc'];
console.log(yyy.mesg);

yyy.mesg = (x) => '안녕하세요';

const fn = yyy.mesg;
console.log(fn('홍길동'));
