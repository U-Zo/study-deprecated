import { Component } from '@angular/core';
import { Stock } from './stock';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css'],
})
export class AppComponent {
  title = 'my-app';

  myStock: Stock = {
    stockSymbol: 'Angular',
    stockPrice: 100,
  };
}
