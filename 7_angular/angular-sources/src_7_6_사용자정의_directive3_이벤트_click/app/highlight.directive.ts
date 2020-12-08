import {
  Directive,
  ElementRef,
  HostListener,
  Input,
  Renderer2,
} from '@angular/core';

@Directive({
  selector: '[appHighlight]',
})
export class HighlightDirective {
  @Input('appHighlight') colorName: string;

  constructor(public eleRef: ElementRef, public render: Renderer2) {}

  @HostListener('click') onMouseClick() {
    this.render.setStyle(this.eleRef.nativeElement, 'color', this.colorName);
  }
}
