import { Component, OnInit } from '@angular/core';
import { CustService } from './cust.service';

@Component({
  selector: 'app-cust',
  templateUrl: './cust.component.html',
  styleUrls: ['./cust.component.css'],
  providers: [CustService],
})
export class CustComponent implements OnInit {
  // 생성자를 통해 자동 주입
  constructor(public custService: CustService) {}

  getCurrentDate() {
    return this.custService.currentDate();
  }

  ngOnInit(): void {}
}
