import { Component, OnInit } from '@angular/core';
import { FormControl, FormGroup, Validators } from '@angular/forms';

@Component({
  selector: 'app-dog',
  templateUrl: './dog.component.html',
  styleUrls: ['./dog.component.css'],
})
export class DogComponent implements OnInit {
  form = new FormGroup({
    required1: new FormControl('', [
      Validators.required,
      Validators.pattern('[0-9]{2}'),
    ]),
    upperCase2: new FormControl('', [
      Validators.required,
      Validators.pattern('[A-Z]{3}'),
    ]),
  });

  dog = {
    name: '',
    age: '',
    species: '진돗개',
  };

  constructor() {}

  onSubmit() {
    console.log('onSubmit');
  }

  ngOnInit(): void {}
}
