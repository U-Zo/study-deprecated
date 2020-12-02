const student = {
  username: '홍길동',
  age: 20,
};

function info2(str: { username: string; age: number }) {
  console.log(`${str.username}\t${str.age}`);
}

function info(str: any) {
  console.log(`${str.username}\t${str.age}`);
}

info(student);
info2(student);

export {};
