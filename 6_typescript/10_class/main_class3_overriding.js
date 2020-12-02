"use strict";
var __extends = (this && this.__extends) || (function () {
    var extendStatics = function (d, b) {
        extendStatics = Object.setPrototypeOf ||
            ({ __proto__: [] } instanceof Array && function (d, b) { d.__proto__ = b; }) ||
            function (d, b) { for (var p in b) if (Object.prototype.hasOwnProperty.call(b, p)) d[p] = b[p]; };
        return extendStatics(d, b);
    };
    return function (d, b) {
        extendStatics(d, b);
        function __() { this.constructor = d; }
        d.prototype = b === null ? Object.create(b) : (__.prototype = b.prototype, new __());
    };
})();
var Employee = /** @class */ (function () {
    function Employee(name, salary) {
        this.name = name;
        this.salary = salary;
    }
    Employee.prototype.getEmployee = function () {
        return this.name + " " + this.salary;
    };
    return Employee;
}());
var Manager = /** @class */ (function (_super) {
    __extends(Manager, _super);
    function Manager(name, salary, depart) {
        var _this = _super.call(this, name, salary) || this;
        _this.depart = depart;
        return _this;
    }
    Manager.prototype.getEmployee = function () {
        return this.name + " " + this.salary + " " + this.depart;
    };
    return Manager;
}(Employee));
var manager = new Manager('우조', 10000, 0);
console.log(manager.getEmployee());
