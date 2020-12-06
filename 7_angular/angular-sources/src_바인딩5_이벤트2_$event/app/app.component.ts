import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css'],
})
export class AppComponent {
  title = '이벤트 바인딩 실습';

  handleEvent(event: any) {
    console.log('handleEvent ====', event);
  }

  handleEvent2(event: any, name: string) {
    console.log('handleEvent 2 ====', event, name);
  }
}
