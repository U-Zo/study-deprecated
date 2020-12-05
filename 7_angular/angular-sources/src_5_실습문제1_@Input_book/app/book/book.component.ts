import { Component, Input, OnInit } from '@angular/core';
import { Book } from '../book';

@Component({
  selector: 'app-book',
  templateUrl: './book.component.html',
  styleUrls: ['./book.component.css'],
})
export class BookComponent implements OnInit {
  @Input() title: string = '';
  @Input() books: Book[] = [];

  constructor() {}

  ngOnInit(): void {}
}
