import { Directive, ElementRef, HostListener, Renderer2 } from '@angular/core';

@Directive({
  selector: '[appHighlight]',
})
export class HighlightDirective {
  constructor(public eleRef: ElementRef, public render: Renderer2) {}

  @HostListener('mouseover') onMouseOver() {
    this.render.setStyle(this.eleRef.nativeElement, 'color', 'red');
    this.render.setStyle(this.eleRef.nativeElement, 'font-size', '50px');
  }

  @HostListener('mouseleave') onMouseLeave() {
    this.render.removeStyle(this.eleRef.nativeElement, 'color');
    this.render.removeStyle(this.eleRef.nativeElement, 'font-size');
  }
}
