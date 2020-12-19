import { Component } from '@angular/core';
import { Book } from './book';
import { BookService } from './book.service';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css'],
  providers: [BookService],
})
export class AppComponent {
  title = 'my-app';
  items: Book[];

  constructor(public service: BookService) {}

  send(name: string) {
    this.service.send(name).subscribe(
      (res) => {
        this.items = res;
      },
      (err) => console.log(err)
    );
  }
}
