function testParam(n1: number, s1: string) {
  n1 = 200;
  console.log('n1 =', n1);
  console.log(s1);
}

const num = 100;
testParam(num, 'this is a string');
console.log(num);

class Person {
  username: string;

  constructor(n: string) {
    this.username = n;
  }

  setUsername(n: string) {
    this.username = n;
  }

  getUsername() {
    return this.username;
  }
}

const p = new Person('홍길동');
function testParam2(pp: Person) {
  pp.setUsername('이순신');
}
testParam2(p);
console.log(p.getUsername());

const str = ['홍길동', '이순신', '유관순'];
function changeName(s: string[]) {
  s[0] = '강감찬';
}

console.log('변경 전', str);
changeName(str);
console.log('변경 후', str);

export {};
