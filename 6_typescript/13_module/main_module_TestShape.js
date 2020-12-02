"use strict";
var __importDefault = (this && this.__importDefault) || function (mod) {
    return (mod && mod.__esModule) ? mod : { "default": mod };
};
Object.defineProperty(exports, "__esModule", { value: true });
var main_module_circle_1 = __importDefault(require("./main_module_circle"));
var main_module_Triangle_1 = require("./main_module_Triangle");
function drawAllShape(shapeToDraw) {
    shapeToDraw.draw();
}
drawAllShape(new main_module_circle_1.default());
drawAllShape(new main_module_Triangle_1.Triangle());
