let mesg0: string | number;
mesg0 = 100;
console.log(mesg0);

mesg0 = '홍길동';
console.log(mesg0);

function xxx0(n: number | string) {
  console.log(n);
}

xxx0(100);
xxx0('홍길동');

// 배열
function xxx22(n: number[] | string[]) {
  console.log(n);
}

xxx22([1, 2, 3]);
xxx22(['홍길동', '이순신']);

let mesg00: string | number | string[];
mesg00 = 100;
mesg00 = '홍길동';
mesg00 = ['a', 'b', 'c'];
console.log(mesg00);

// ?
function kkk(n?: number | string) {
  console.log(n);
}

kkk();
kkk(100);
kkk('aa');

export {};
