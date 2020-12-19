import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
////////////////////////////////

import {SecondComponent} from './second/second.component';

//////////////////////////////
const routes: Routes = [
 
  {path:'second-component', component:SecondComponent},
];//path:주소지정 component:컴포넌트지정

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
