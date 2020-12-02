import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css'],
})
export class AppComponent {
  title = '바인딩 실습';
  name = '홍길동';
  age = 20;
  address = '서울';
}
