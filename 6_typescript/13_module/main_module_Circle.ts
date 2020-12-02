import { IShape } from './main_module_IShape';

export default class Circle implements IShape {
  public draw() {
    console.log('Circle is drawn(external Module)');
  }
}
