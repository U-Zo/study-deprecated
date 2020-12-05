import { Component, EventEmitter, OnInit, Output } from '@angular/core';
import { Stock } from '../Stock';

@Component({
  selector: 'app-child',
  templateUrl: './child.component.html',
  styleUrls: ['./child.component.css'],
})
export class ChildComponent implements OnInit {
  @Output() customEvent = new EventEmitter<Stock>();

  add(stock: Stock) {
    this.customEvent.emit(stock);
  }

  constructor() {}

  ngOnInit(): void {}
}
