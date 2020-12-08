import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css'],
})
export class AppComponent {
  title = '우편번호 찾기';
  category1: string[] = ['서울', '경기', '부산', '제주'];
  category2 = [
    { 서울: ['강남구', '종로구', '용산구'] },
    { 경기: ['용인시', '파주시', '성남시'] },
    { 부산: ['남포동', '서면', '해운대구'] },
    { 제주: ['서귀포시', '제주시', '신제주시'] },
  ];

  address: string[] = ['주소'];

  select(m: string) {
    this.address = this.category2.find((address) => address[m])[m];
  }
}
