import { IShape } from './main_module_IShape';

export class Triangle implements IShape {
  public draw() {
    console.log('Triangle is drawn(external Module)');
  }
}
