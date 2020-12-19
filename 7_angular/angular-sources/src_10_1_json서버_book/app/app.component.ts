import { Component } from '@angular/core';
import { BookService } from './book.service';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css'],
  providers: [BookService],
})
export class AppComponent {
  title = 'my-app';

  items: object;

  constructor(public service: BookService) {}

  send() {
    this.service.send().subscribe(
      (res) => {
        this.items = res;
      },
      (err) => console.log(err)
    );
  }
}
