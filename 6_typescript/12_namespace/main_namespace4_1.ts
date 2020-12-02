import FirstNamespace from './main_namespaces4';

class Person implements FirstNamespace.IPerson {
  username;
  age;
  email;

  constructor(username: string, age: number, email: string) {
    this.username = username;
    this.age = age;
    this.email = email;
  }

  getInfo() {
    return `${this.username} ${this.age} ${this.email}`;
  }
}

const xxx = new Person('홍길동', 20, 'aa@daum.net');

console.log(xxx.getInfo());

export {};
