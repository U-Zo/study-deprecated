function calculateDiscount(price: number, rate: number = 0.5) {
  const discount = price * rate;
  console.log('discount amount', discount);
}

calculateDiscount(1000);
calculateDiscount(1000, 0.3);
