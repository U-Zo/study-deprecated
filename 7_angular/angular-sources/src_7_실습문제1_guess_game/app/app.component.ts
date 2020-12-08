import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css'],
})
export class AppComponent {
  title = '추억의 Guess 게임';
  guess = 0; // 예측값
  original = Math.floor(Math.random() * 10 + 1); // 정답
  deviation: number; // 정답 - 예측값
  noOfTries = 0; // 시도 횟수

  ok(guess: number) {
    this.guess = guess;
    this.deviation = this.original - guess;
    this.noOfTries++;
  }

  restart() {
    this.noOfTries = 0;
    this.original = Math.floor(Math.random() * 10 + 1);
    this.guess = 0;
  }
}
