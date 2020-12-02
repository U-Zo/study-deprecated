namespace MyNamespace {
  export interface IPerson {
    username: string;
    age: number;
  }
}

const kkk: MyNamespace.IPerson = {
  username: '홍길동',
  age: 10,
};
console.log(kkk.username, kkk.age);

namespace MyNamespace2 {
  export interface IPerson {
    email: string;
    phone: number;
  }
}

const kkk2: MyNamespace2.IPerson = {
  email: 'test@test.com',
  phone: 1234,
};
console.log(`${kkk2.email} ${kkk2.phone}`);

export {};
