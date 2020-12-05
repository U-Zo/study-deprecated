import { Component, EventEmitter, Input, OnInit, Output } from '@angular/core';
import { Book } from '../book';

@Component({
  selector: 'app-book',
  templateUrl: './book.component.html',
  styleUrls: ['./book.component.css'],
})
export class BookComponent implements OnInit {
  @Input() title: string;
  @Input() books: Book[];
  @Output() customEvent = new EventEmitter<string>();

  send(name: string) {
    this.customEvent.emit(name);
  }

  constructor() {}

  ngOnInit(): void {}
}
