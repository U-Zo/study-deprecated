class Sparrow {
  sound = '참새 짹짹';
}

class Parrot {
  sound = '앵무새 안녕';
}

class Duck {
  sound = '오리 꽥꽥';
  swim() {
    console.log('오리가 헤엄침');
  }
}

const parrot: Parrot = new Sparrow();
const sparrow: Sparrow = new Parrot();
const parrotTwo: Parrot = new Duck();

console.log(parrot.sound);
console.log(sparrow.sound);
console.log(parrotTwo.sound);

const xxx = parrotTwo as Duck;
xxx.swim();

export {};
