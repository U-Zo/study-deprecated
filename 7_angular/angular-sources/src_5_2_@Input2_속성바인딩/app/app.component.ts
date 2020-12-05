import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css'],
})
export class AppComponent {
  title = 'my-app';

  // 자식에게 전달할 데이터
  appUsername = '홍길동';
  appUserAge = 20;
}
