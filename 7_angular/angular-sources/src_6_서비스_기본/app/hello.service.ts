import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root',
})
export class HelloService {
  constructor() {}

  sayHello() {
    return 'Hello 서비스';
  }
}
