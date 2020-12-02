class Employee {
  name: string;
  salary: number;

  constructor(name: string, salary: number) {
    this.name = name;
    this.salary = salary;
  }

  getEmployee(): string {
    return `${this.name} ${this.salary}`;
  }
}

class Manager extends Employee {
  depart: number;

  constructor(name: string, salary: number, depart: number) {
    super(name, salary);
    this.depart = depart;
  }

  getEmployee() {
    return `${this.name} ${this.salary} ${this.depart}`;
  }
}

const manager = new Manager('우조', 10000, 0);
console.log(manager.getEmployee());
