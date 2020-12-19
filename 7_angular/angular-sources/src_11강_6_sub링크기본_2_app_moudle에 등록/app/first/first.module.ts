import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

import { FirstRoutingModule } from './first-routing.module';
import {FirstComponent} from './first.component';
import {ChildAComponent} from './child-a/child-a.component';
import {ChildBComponent} from './child-b/child-b.component';


@NgModule({
  declarations: [
    FirstComponent,
    ChildAComponent,
    ChildBComponent
  ],
  imports: [
    CommonModule,
    FirstRoutingModule

  ]
})
export class FirstModule { }
