import { Component, OnInit } from '@angular/core';
import { CustService } from './cust.service';

@Component({
  selector: 'app-cust',
  templateUrl: './cust.component.html',
  styleUrls: ['./cust.component.css'],
})
export class CustComponent implements OnInit {
  constructor(public service: CustService) {}

  getMesg() {
    return this.service.currentDate();
  }

  ngOnInit(): void {}
}
