import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { CustComponent } from './cust.component';

@NgModule({
  declarations: [CustComponent],
  exports: [CustComponent],
  imports: [CommonModule],
})
export class CustModule {}
