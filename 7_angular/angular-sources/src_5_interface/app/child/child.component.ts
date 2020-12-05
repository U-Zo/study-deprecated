import { Component, Input, OnInit } from '@angular/core';
import { Stock } from '../stock';

@Component({
  selector: 'app-child',
  templateUrl: './child.component.html',
  styleUrls: ['./child.component.css'],
})
export class ChildComponent implements OnInit {
  @Input() iStock: Stock;

  stockSymbol = '';
  stockPrice = 0;

  handleEvent() {
    this.stockSymbol = this.iStock.stockSymbol;
    this.stockPrice = this.iStock.stockPrice;
  }

  constructor() {}

  ngOnInit(): void {}
}
