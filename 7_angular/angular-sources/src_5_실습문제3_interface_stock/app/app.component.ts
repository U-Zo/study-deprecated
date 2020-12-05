import { Component } from '@angular/core';
import { Stock } from './stock';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css'],
})
export class AppComponent {
  title = 'my-app';

  myStocks: Stock[] = [
    {
      stockSymbol: 'Angular',
      stockPrice: 100,
    },
    {
      stockSymbol: 'Oracle',
      stockPrice: 200,
    },
    {
      stockSymbol: 'React',
      stockPrice: 300,
    },
    {
      stockSymbol: 'Vue',
      stockPrice: 400,
    },
  ];
}
