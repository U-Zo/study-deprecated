import { IShape } from './main_module_IShape';
import Circle from './main_module_circle';
import { Triangle } from './main_module_Triangle';

function drawAllShape(shapeToDraw: IShape) {
  shapeToDraw.draw();
}

drawAllShape(new Circle());
drawAllShape(new Triangle());
