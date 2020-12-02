"use strict";
function calculateDiscount(price, rate) {
    if (rate === void 0) { rate = 0.5; }
    var discount = price * rate;
    console.log('discount amount', discount);
}
calculateDiscount(1000);
calculateDiscount(1000, 0.3);
