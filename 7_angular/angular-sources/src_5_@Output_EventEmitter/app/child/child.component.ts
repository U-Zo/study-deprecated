import { Component, EventEmitter, OnInit, Output } from '@angular/core';

@Component({
  selector: 'app-child',
  templateUrl: './child.component.html',
  styleUrls: ['./child.component.css'],
})
export class ChildComponent implements OnInit {
  @Output() customEvent = new EventEmitter<string>();

  send(name: string) {
    this.customEvent.emit(name);
  }

  constructor() {}

  ngOnInit(): void {}
}
