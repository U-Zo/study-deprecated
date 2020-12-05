import { Component } from '@angular/core';
import { Stock } from './Stock';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css'],
})
export class AppComponent {
  title = 'my-app';
  stocks: Stock[] = [];

  handleEvent(e: Stock) {
    this.stocks.push(e);
  }
}
