function xyz(p: { label: string }) {
  console.log(p.label);
}

const m = { size: 10, label: '홍' };
xyz(m);

// interface 구현
interface PPP {
  size: number;
  label: string;
}

function xyz2(p: PPP) {
  console.log(p.size, '\t', p.label);
}

const m1 = { size: 10, label: '홍' };
xyz2(m1);

const m2 = { label: '홍' };
// xyz2(m2); 에러 발생

export {};
