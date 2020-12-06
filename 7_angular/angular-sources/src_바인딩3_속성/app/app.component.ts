import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css'],
})
export class AppComponent {
  title = '속성 바인딩 실습';
  imgName = '../assets/image/a.jpg';
  imgWidth = 200;
  imgHeight = 200;
}
