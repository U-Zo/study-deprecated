class Greeter {
  greeting: string;
  constructor(message: string) {
    this.greeting = message;
  }
  greet(): string {
    return `Hello, ${this.greeting}`;
  }
}

const greeter = new Greeter('world');
console.log(greeter.greet());
greeter.greeting = 'aa';
console.log(greeter.greet());
