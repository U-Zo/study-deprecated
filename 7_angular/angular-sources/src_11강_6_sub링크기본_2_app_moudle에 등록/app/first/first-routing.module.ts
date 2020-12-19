import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
//////////////////////////////
import {FirstComponent} from './first.component';
import {ChildAComponent} from './child-a/child-a.component';
import {ChildBComponent} from './child-b/child-b.component';

const routes: Routes = [
   ///////////////////////////////////////////
   {path:'first-component', component:FirstComponent,
   children:[
     {path:'child-a', component:ChildAComponent},
     {path:'child-b', component:ChildBComponent},
   ]
 } //end- first
 //////////////////////////////////////////////////////
];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule]
})
export class FirstRoutingModule { }
