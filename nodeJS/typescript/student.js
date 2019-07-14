"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
var Student = /** @class */ (function () {
    function Student(rollno, firstname, lastname) {
        this.rollno = rollno;
        this.firstname = firstname;
        this.lastname = lastname;
        this.rollno = rollno;
        this.firstname = firstname;
        this.lastname = lastname;
    }
    Object.defineProperty(Student.prototype, "Rollno", {
        get: function () {
            return this.rollno;
        },
        enumerable: true,
        configurable: true
    });
    Object.defineProperty(Student.prototype, "FirstName", {
        get: function () {
            return this.firstname;
        },
        enumerable: true,
        configurable: true
    });
    Object.defineProperty(Student.prototype, "LastName", {
        get: function () {
            return this.lastname;
        },
        enumerable: true,
        configurable: true
    });
    return Student;
}());
exports.Student = Student;
var Address = /** @class */ (function () {
    function Address(city, state) {
        this.city = city;
        this.state = state;
        this.city = city;
        this.state = state;
    }
    Object.defineProperty(Address.prototype, "City", {
        get: function () {
            return this.city;
        },
        enumerable: true,
        configurable: true
    });
    Object.defineProperty(Address.prototype, "State", {
        get: function () {
            return this.state;
        },
        enumerable: true,
        configurable: true
    });
    return Address;
}());
exports.Address = Address;
