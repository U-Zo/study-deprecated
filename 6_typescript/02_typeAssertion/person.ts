export class Person {
  constructor(public name: string, public age: number, public address: string) {
    console.log('생성자 호출');
  }

  getName() {
    return this.name;
  }

  getAge() {
    return this.age;
  }

  getAddress() {
    return this.address;
  }
}
