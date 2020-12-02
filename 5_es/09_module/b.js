export class Person {
  constructor(n) {
    this.name = n;
  }
}

export function bbb() {
  console.log('hello');
}

export class Employee {
  constructor(name, sal) {
    this.name = name;
    this.sal = sal;
  }

  getName() {
    return this.name;
  }

  setName(name) {
    this.name = name;
  }

  getSalary() {
    return this.sal;
  }

  setSalary(sal) {
    this.sal = sal;
  }

  getEmployee() {
    return `${this.name}\t${this.sal}`;
  }
}
