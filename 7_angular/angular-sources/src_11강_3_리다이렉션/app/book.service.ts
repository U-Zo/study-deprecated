import { Injectable } from '@angular/core';
//////////////////////////////////
import {HttpClient, HttpParams} from '@angular/common/http';
import {map} from 'rxjs/operators';
////////////////////////////////////

@Injectable({
  providedIn: 'root'
})
export class BookService {

  constructor(public http:HttpClient) { }
    send(kkk){  //수정    
      // var url="http://localhost:3000/books";
      // return this.http.get(url).pipe(map(res=>res));
      var url="http://localhost:3000/books";
      let params= new HttpParams().set("name",kkk);  //HttpParams import
      if(kkk.length ==0){
        return this.http.get(url).pipe(map(res=>res));
      }else{
        return this.http.get(url,{params}).pipe(map(res=>res));
      }
  
    }
  
}
//////  json 서버 생성 - db.json 작성
//1. json 서버 생성  ng new json , 
//2. 서버 설치 :npn install json-server --save
//3. db.json 작성 및 public 폴더생성
//4.
// {
//   "name": "json",
//   "version": "0.0.0",
//   "scripts": {
//     "ng": "ng",
//     "start": "ng serve",
//     "build": "ng build",
//     "test": "ng test",
//     "lint": "ng lint",
//     "e2e": "ng e2e",
//     "json-server": "json-server --watch db.json"
//   },
//   "private": true,
//   "dependencies": {
//     "@angular/animations": "~10.2.0",
//     "@angular/common": "~10.2.0",
//     "@angular/compiler": "~10.2.0",
//     "@angular/core": "~10.2.0",
//     "@angular/forms": "~10.2.0",
//     "@angular/platform-browser": "~10.2.0",
//     "@angular/platform-browser-dynamic": "~10.2.0",
//     "@angular/router": "~10.2.0",
//     "json-server": "^0.16.3",
//     "rxjs": "~6.6.0",
//     "tslib": "^2.0.0",
//     "zone.js": "~0.10.2"
//   },
//   "devDependencies": {
//     "@angular-devkit/build-angular": "~0.1002.0",
//     "@angular/cli": "~10.2.0",
//     "@angular/compiler-cli": "~10.2.0",
//     "@types/node": "^12.11.1",
//     "@types/jasmine": "~3.5.0",
//     "@types/jasminewd2": "~2.0.3",
//     "codelyzer": "^6.0.0",
//     "jasmine-core": "~3.6.0",
//     "jasmine-spec-reporter": "~5.0.0",
//     "karma": "~5.0.0",
//     "karma-chrome-launcher": "~3.1.0",
//     "karma-coverage-istanbul-reporter": "~3.0.2",
//     "karma-jasmine": "~4.0.0",
//     "karma-jasmine-html-reporter": "^1.5.0",
//     "protractor": "~7.0.0",
//     "ts-node": "~8.3.0",
//     "tslint": "~6.1.0",
//     "typescript": "~4.0.2"
//   }
// }
//5. package.json에등록
//  "scripts": {
//   "ng": "ng",
//   "start": "ng serve",
//   "build": "ng build",
//   "test": "ng test",
//   "lint": "ng lint",
//   "e2e": "ng e2e",
//   "json-server": "json-server --watch db.json"
// },

//6.서버실행 
//npm run json-server