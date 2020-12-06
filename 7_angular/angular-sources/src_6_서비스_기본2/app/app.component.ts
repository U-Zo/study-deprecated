import { Component } from '@angular/core';
import { HelloService } from './hello.service';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css'],
  providers: [HelloService],
})
export class AppComponent {
  title = 'my-app';

  constructor(public helloService: HelloService) {}
}
