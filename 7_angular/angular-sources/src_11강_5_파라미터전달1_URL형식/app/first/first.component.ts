import { Component, OnInit } from '@angular/core';
/////////////////////////////////////////
import {ActivatedRoute} from '@angular/router';

@Component({
  selector: 'app-first',
  templateUrl: './first.component.html',
  styleUrls: ['./first.component.css']
})
export class FirstComponent implements OnInit {

  constructor(public route:ActivatedRoute) { }
  params;
  params2;
  ngOnInit(): void { 
    this.route.paramMap.subscribe(res=>{this.params=res.get("city"),this.params2=res.get("pop")});
   }

}
