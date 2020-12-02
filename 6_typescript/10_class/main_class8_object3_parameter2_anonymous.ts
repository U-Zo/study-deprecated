function info(str: { readonly username: string; age?: number }) {
  console.log(`${str.username}\t${str.age}`);
  // str.username = 'aaa'; // 오류 - 읽기전용
}

info({ username: '홍길동', age: 20 });
info({ username: '홍길동' });

export {};
