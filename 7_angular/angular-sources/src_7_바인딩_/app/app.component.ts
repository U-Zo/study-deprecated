import { Component } from '@angular/core';
import { Person } from './Person';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css'],
})
export class AppComponent {
  title = 'my-app';

  user: Person = {
    name: '홍길동',
    age: 20,
    address: '서울',
  };
}
