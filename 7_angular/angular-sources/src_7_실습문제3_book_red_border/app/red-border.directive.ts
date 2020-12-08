import { Directive, ElementRef, HostListener, Renderer2 } from '@angular/core';

@Directive({
  selector: '[appRedBorder]',
})
export class RedBorderDirective {
  constructor(public eleRef: ElementRef, public render: Renderer2) {}

  @HostListener('mouseover') onMouseOver() {
    this.render.setStyle(this.eleRef.nativeElement, 'border', '2px solid red');
    this.render.setStyle(this.eleRef.nativeElement, 'font-size', '20px');
  }

  @HostListener('mouseleave') onMouseLeave() {
    this.render.removeStyle(this.eleRef.nativeElement, 'border');
    this.render.removeStyle(this.eleRef.nativeElement, 'font-size');
  }
}
