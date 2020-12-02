"use strict";
function greet() {
    return 'Hello World';
}
function caller() {
    var msg = greet();
    console.log(msg);
}
caller();
