import { Component, Input, OnInit } from '@angular/core';
import { Stock } from '../stock';

@Component({
  selector: 'app-child',
  templateUrl: './child.component.html',
  styleUrls: ['./child.component.css'],
})
export class ChildComponent implements OnInit {
  @Input() iStocks: Stock[];

  stocks: Stock[];

  handleEvent() {
    this.stocks = this.iStocks;
  }

  constructor() {}

  ngOnInit(): void {}
}
