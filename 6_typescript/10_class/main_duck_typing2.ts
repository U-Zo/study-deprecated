interface Point {
  x: number;
  y: number;
}

const p: Point = {
  x: 10,
  y: 10,
};

console.log(`${p.x}\t${p.y}`);

class XXXX implements Point {
  x: number;
  y: number;

  constructor(x: number, y: number) {
    this.x = x;
    this.y = y;
  }
}

const k = new XXXX(10, 20);
console.log(`${k.x}\t${k.y}`);

function kkkk(k: Point, k2: Point) {
  console.log(`${k.x}\t${k.y}`);
  console.log(`${k2.x}\t${k2.y}`);
}

kkkk({ x: 1, y: 2 }, { x: 3, y: 4 });
kkkk({ x: 5, y: 6 }, { x: 7, y: 8 });

export {};
