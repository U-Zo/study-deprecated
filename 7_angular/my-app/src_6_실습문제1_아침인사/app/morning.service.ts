import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root',
})
export class MorningService {
  constructor() {}

  sayHello(code: string) {
    let mesg: string;
    if (code === 'KR') {
      mesg = '안녕하세요, 좋은 아침입니다.';
    } else if (code === 'US') {
      mesg = 'Good morning';
    } else if (code === 'CN') {
      mesg = '짜오 샹 하오';
    } else {
      mesg = '오하요 고자이마스';
    }

    return mesg;
  }
}
