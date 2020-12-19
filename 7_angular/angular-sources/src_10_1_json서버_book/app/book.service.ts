import { Injectable } from '@angular/core';

import { HttpClient } from '@angular/common/http';
import { map } from 'rxjs/operators';

@Injectable({
  providedIn: 'root',
})
export class BookService {
  constructor(public http: HttpClient) {}

  send() {
    const url = 'http://localhost:3000/books';
    return this.http.get(url).pipe(map((res) => res));
  }
}
