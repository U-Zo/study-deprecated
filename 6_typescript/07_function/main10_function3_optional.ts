function testParam(n1: number, s1: string, s2?: string) {
  console.log(n1);
  console.log(s1);
  console.log(s2);
}

testParam(123, 'string');
testParam(123, 'string', 'hello');
