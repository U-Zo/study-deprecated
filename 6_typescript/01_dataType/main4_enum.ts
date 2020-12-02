enum Color {
  Red,
  Green,
  Blue,
}
const color: Color = Color.Red;
console.log(color);

enum Color2 {
  Red = 1,
  Green,
  Blue,
}
const color2: Color2 = Color2.Green;
console.log(color2);

enum Color3 {
  Red = 1,
  Green = 3,
  Blue = 4,
}
const color3: Color3 = Color3.Green;
console.log(color3);
