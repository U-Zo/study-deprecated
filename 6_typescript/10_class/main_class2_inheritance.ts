class Shape {
  area: number;
  constructor(a: number) {
    this.area = a;
  }
}

class Circle extends Shape {
  constructor(num: number) {
    super(num);
  }
  disp(): void {
    console.log(`Area of this circle ${this.area}`);
  }
}

const obj = new Circle(23);
obj.disp();

export {};
