const person = {
  firstName: 'Woojo',
  lastName: 'Kim',
  sayEcho: function () {},
  email: '',
};

person.sayEcho = function (): string {
  console.log('SayEcho');
  return 'test';
};

person.email = 'test@test.com';
console.log(person);

export {};
