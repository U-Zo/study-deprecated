function greet() {
  return 'Hello World';
}

function caller() {
  const msg = greet();
  console.log(msg);
}

caller();
