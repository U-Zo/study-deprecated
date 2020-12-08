import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppComponent } from './app.component';
import { CustModule } from './cust/cust.module';

@NgModule({
  declarations: [AppComponent],
  imports: [BrowserModule, CustModule],
  providers: [],
  bootstrap: [AppComponent],
})
export class AppModule {}
