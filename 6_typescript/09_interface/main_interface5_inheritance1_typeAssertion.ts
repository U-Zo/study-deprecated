interface Person {
  age: number;
}

interface Musician extends Person {
  instrument: string;
}

const drummer: Musician = {
  age: 20,
  instrument: '드럼',
};

console.log('나이', drummer.age);
console.log('악기', drummer.instrument);

const drummer2 = <Musician>{
  age: 20,
  instrument: 'Drums',
};

console.log('age', drummer2.age);
console.log('instrument', drummer2.instrument);

const drummer3 = {
  age: 20,
  instrument: 'Guitar',
} as Musician;

console.log('age', drummer3.age);
console.log('instrument', drummer3.instrument);
