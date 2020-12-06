import { Component, OnInit } from '@angular/core';
import { SharedService } from '../shared.service';

@Component({
  selector: 'app-woman',
  templateUrl: './woman.component.html',
  styleUrls: ['./woman.component.css'],
  providers: [SharedService],
})
export class WomanComponent implements OnInit {
  constructor(public service: SharedService) {}

  addName(name: string) {
    this.service.addName(name);
    console.log(this.service.names);
  }

  ngOnInit(): void {}
}
