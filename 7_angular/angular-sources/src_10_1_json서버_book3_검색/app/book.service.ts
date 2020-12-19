import { Injectable } from '@angular/core';

import { HttpClient, HttpParams } from '@angular/common/http';
import { map } from 'rxjs/operators';
import { Book } from './book';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root',
})
export class BookService {
  constructor(public http: HttpClient) {}

  send(name: string): Observable<Book[]> {
    const url = 'http://localhost:3000/books';
    const params = new HttpParams().set('name', name);

    if (!name) return this.http.get(url).pipe(map((res) => res as Book[]));

    return this.http.get(url, { params }).pipe(map((res) => res as Book[]));
  }
}
