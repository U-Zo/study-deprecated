import { Component, Input, OnInit } from '@angular/core';
import { Book } from './book';
import { BookService } from './book.service';

@Component({
  selector: 'app-book',
  templateUrl: './book.component.html',
  styleUrls: ['./book.component.css'],
  providers: [BookService],
})
export class BookComponent implements OnInit {
  bookList: Book[];

  constructor(public service: BookService) {
    this.bookList = service.bookList();
  }

  ngOnInit(): void {}
}
