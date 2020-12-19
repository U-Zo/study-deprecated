import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
////////////////////////////////
import {FirstComponent} from './first/first.component';
import {SecondComponent} from './second/second.component';
import {ChildAComponent} from './first/child-a/child-a.component';
import {ChildBComponent} from './first/child-b/child-b.component';
//////////////////////////////
const routes: Routes = [
  ///////////////////////////////////////////
  {path:'first-component', component:FirstComponent,
    children:[
      {path:'child-a', component:ChildAComponent},
      {path:'child-b', component:ChildBComponent},
    ]
  }, //end- first
  //////////////////////////////////////////////////////
  {path:'second-component', component:SecondComponent},
];//path:주소지정 component:컴포넌트지정

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
