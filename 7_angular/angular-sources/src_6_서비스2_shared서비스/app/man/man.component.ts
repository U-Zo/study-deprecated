import { Component, OnInit } from '@angular/core';
import { SharedService } from '../shared.service';

@Component({
  selector: 'app-man',
  templateUrl: './man.component.html',
  styleUrls: ['./man.component.css'],
})
export class ManComponent implements OnInit {
  constructor(public service: SharedService) {}

  addName(name: string) {
    this.service.addName(name);
    console.log(this.service.names);
  }

  ngOnInit(): void {}
}
