interface User {
  bar: number;
  baz: string;
}

const u: User = {} as User;
u.bar = 100;
u.baz = '홍길동';
console.log(u);

const user: User = {
  bar: 1000,
  baz: '김우조',
};
console.log(user);
