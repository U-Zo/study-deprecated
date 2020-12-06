import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root',
})
export class SharedService {
  names: string[] = []; // 공유 데이터

  addName(name: string) {
    this.names.push(name);
  }
  constructor() {}
}
