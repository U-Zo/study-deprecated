interface NameList {
  [index: number]: string;
}

const list: NameList = ['aaa', 'bbb', 'ccc'];
list[3] = 'ddd';
console.log(list);

interface NameList2 {
  [index: number]: number;
}

const list2: NameList2 = [1, 2, 3];
list2[3] = 100;
console.log(list2);

interface age {
  [index: string]: number;
}

// const ageList: age = {};
const ageList = <age>{};
ageList['one'] = 100;
ageList['two'] = 200;
ageList['three'] = 300;
console.log(ageList);
