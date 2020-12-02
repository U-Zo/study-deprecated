abstract class Animal {
  abstract makeSound(): void; // 추상 메서드
  move(): void {
    console.log('Animal move');
  }
}

class Cat extends Animal {
  makeSound(): void {
    // 오버라이딩
    console.log('makeSound');
  }
}

const c = new Cat();
c.makeSound();
c.move();

export {};
