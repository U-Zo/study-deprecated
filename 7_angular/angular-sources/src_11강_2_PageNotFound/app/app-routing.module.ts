import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
////////////////////////////////
import {FirstComponent} from './first/first.component';
import {SecondComponent} from './second/second.component';
import {PageNotFoundComponent} from './page-not-found/page-not-found.component'; //추가
//////////////////////////////////////////////
const routes: Routes = [
  {path:'first-component', component:FirstComponent },
  {path:'second-component', component:SecondComponent },
  {path:'**',component:PageNotFoundComponent}  //추가
];//path:주소지정 component:컴포넌트지정

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
