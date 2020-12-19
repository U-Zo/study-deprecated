import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { CountryComponent } from './country/country.component';
import { PersonComponent } from './person/person.component';
import { AddressComponent } from './address/address.component';
import { AddCountryComponent } from './country/add-country/add-country.component';
import { CountryListComponent } from './country/country-list/country-list.component';
import { PersonListComponent } from './person/person-list/person-list.component';

@NgModule({
  declarations: [
    AppComponent,   
    CountryComponent,
    PersonComponent,
    AddressComponent,
    AddCountryComponent,
    CountryListComponent,
    PersonListComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
