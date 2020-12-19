import { Component, OnInit } from '@angular/core';
//////////////////////////////
import {Router} from '@angular/router';
import {ActivatedRoute} from '@angular/router';
 
@Component({
  selector: 'app-second',
  templateUrl: './second.component.html',
  styleUrls: ['./second.component.css']
})
export class SecondComponent implements OnInit {

  constructor(public router:Router,public activerouter:ActivatedRoute) {
    console.log("생성자 호출");
   }  //주입
  user={
    userid:"",
    passwd:""
  }
  goFirst(){
    console.log("goFirst실행됨");
    this.router.navigate(['first-component']);  //이동
  }
  ngOnInit(): void {
    console.log("ngOnInit()호출=============");
    this.activerouter.paramMap.subscribe(params=>{
      this.user.userid=params.get("userid");
      this.user.passwd=params.get("passwd");
    });
  }

}
