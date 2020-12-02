function testParam(...n: number[]) {
  console.log(n);
}

testParam(1, 2, 3);
testParam(10, 20, 30, 40, 50);

function testParam2(x: any, y: any, ...n: string[]) {
  console.log(x, y, n);
}

testParam2(1, 2, 'aaa', 'bbb', 'ccc');
testParam2('a', 'b', 'c', 'd', 'e');

export {};
