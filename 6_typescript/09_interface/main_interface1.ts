interface IPerson {
  firstName: string;
  lastName: string;
  sayHi: () => string;
}

const customer: IPerson = {
  firstName: '우조',
  lastName: '김',
  sayHi: () => '안녕하세요!',
};

console.log('Customer Object');
console.log(customer.firstName);
console.log(customer.lastName);
console.log(customer.sayHi());

const xxx = {
  aaa: function () {
    return 'aa';
  },
  bbb: () => {
    return 'bb';
  },
  ccc: () => 'cc',
  ddd: (n: any) => n,
};

console.log(xxx.aaa());
console.log(xxx.bbb());
console.log(xxx.ccc());
console.log(xxx.ddd(1111));

export {};
