import { Person } from './person';

const p = {
  name: '홍길동',
  age: 20,
  address: '서울',
};
console.log(p);

const p2 = p as Person;
console.log(p2);

const p3: Person = new Person('홍길동', 20, '서울');
console.log(p3);
console.log(`${p3.getName()}\t${p3.getAge()}`);
