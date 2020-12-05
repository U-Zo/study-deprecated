import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css'],
})
export class AppComponent {
  title = '이벤트 바인딩 실습 예제3';
  length = 0;

  getLength(e: any) {
    this.length = e.target.value.length;
  }
}
