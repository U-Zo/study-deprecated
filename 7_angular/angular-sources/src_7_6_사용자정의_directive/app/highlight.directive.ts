import { Directive, ElementRef, Renderer2 } from '@angular/core';

@Directive({
  selector: '[appHighlight]',
})
export class HighlightDirective {
  constructor(public eleRef: ElementRef, public render: Renderer2) {
    render.setStyle(eleRef.nativeElement, 'color', 'red');
    render.setStyle(eleRef.nativeElement, 'font-size', '50px');
  }
}
