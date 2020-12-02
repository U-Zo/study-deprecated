const num = 5;
if (num > 0) {
  console.log('number is positive');
}

const num2 = 12;
if (num2 % 2 === 0) {
  console.log('even');
} else {
  console.log('odd');
}

const grade: string = 'A';
switch (grade) {
  case 'A': {
    console.log('Excellent');
    break;
  }
  case 'B': {
    console.log('Good');
    break;
  }
  case 'C': {
    console.log('Fair');
    break;
  }
  case 'D': {
    console.log('Poor');
    break;
  }
  default: {
    console.log('Invalid choice');
    break;
  }
}

export {};
