import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css'],
})
export class AppComponent {
  title = '이벤트 바인딩 실습';
  flag = false; // 전체 선택 checkbox 선택값 설정

  callPhone(phoneNumber: string) {
    console.log(phoneNumber);
  }

  change(m: string) {
    console.log(m);
  }

  check(m: boolean) {
    this.flag = m;
  }
}
