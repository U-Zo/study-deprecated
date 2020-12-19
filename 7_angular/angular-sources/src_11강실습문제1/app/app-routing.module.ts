import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
//////////////////////
import {AddressComponent} from './address/address.component';
import {CountryComponent} from './country/country.component';
import {AddCountryComponent} from './country/add-country/add-country.component';
import {CountryListComponent} from './country/country-list/country-list.component';
import {PersonComponent} from './person/person.component';
import {PersonListComponent} from './person/person-list/person-list.component';

const routes: Routes = [
  {path:"country", component:CountryComponent,
  children:[
   {path:"add", component:AddCountryComponent},
   {path:"list", component:CountryListComponent}
  ]
  },//end country
  {path:"person", component:PersonComponent,
  children:[
   {path:"list", component:PersonListComponent}
  ]
  },//end Person
  {path:'address', component:AddressComponent},
  {path:"**", redirectTo:'/'}
];//path:주소지정 component:컴포넌트지정

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
