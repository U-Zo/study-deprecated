import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css'],
})
export class AppComponent {
  title = '이벤트 바인딩 실습';

  handleEvent() {
    console.log('handleEvent');
  }

  handleEvent2(name: string) {
    console.log('handleEvent 2 ====', name);
  }
}
