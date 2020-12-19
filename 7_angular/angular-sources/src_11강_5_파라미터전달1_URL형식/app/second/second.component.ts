import { Component, OnInit } from '@angular/core';
//////////////////////////////
import {Router} from '@angular/router';
 
@Component({
  selector: 'app-second',
  templateUrl: './second.component.html',
  styleUrls: ['./second.component.css']
})
export class SecondComponent implements OnInit {

  constructor(public router:Router) { }  //주입
  goFirst(){
    console.log("goFirst실행됨");
    this.router.navigate(['first-component']);  //이동
  }
  ngOnInit(): void {
  }

}
