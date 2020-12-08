import { Component } from '@angular/core';
import { MorningService } from './morning.service';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css'],
  providers: [MorningService],
})
export class AppComponent {
  title = 'my-app';
  mesg: string;

  constructor(public service: MorningService) {}

  handleEvent(code: string) {
    this.mesg = `${code} / ${this.service.sayHello(code)}`;
  }
}
