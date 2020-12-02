import { Component } from '@angular/core';

@Component({
  selector: 'app-root', //선택자
  //index.html어세 app-root를 사용ㅎ고잇다
  template: `
    <table>
      <tr>
        <td><h1>홍길동</h1></td>
      </tr>
    </table>
  `,
  // 화면 표시
  styles: [
    `
      h1 {
        color: red;
      }
      ,
      h2 {
        background: yellow;
      }
    `,
  ],
  // 화면 꾸미기 를 가져오고 있다
})
export class AppComponent {
  title = 'my-app';
}
