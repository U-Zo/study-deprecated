// interface IParent1 {
//   v1: number;
// }

// interface IParent2 {
//   v2: number;
// }

// interface Child extends IParent1, IParent2 {}

// type alias
type IParent1 = {
  v1: number;
};

type IParent2 = {
  v2: number;
};

type Child = IParent1 & IParent2; // 타입을 합칠 때는 & 연산자 사용

const iObj: Child = {
  v1: 100,
  v2: 200,
};

console.log(iObj.v1, '\t', iObj.v2);
