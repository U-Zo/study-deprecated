import { Person, bbb, Employee } from './b.js';
// import ccc from './c.js';
import { default as kkk } from './c.js';
import ccc from './c.js';

const p = new Person('홍길동');
bbb();
console.log(p.name);

ccc();
kkk();

const e = new Employee('김우조', 1000);
console.log(e);
console.log(e.getName());
e.setName('우조');
e.setSalary(2000);
console.log(e);
