class Customer {
    constructor(id, firstname, lastname) {
        this._id = id;
        this._firstname = firstname;
        this._lastname = lastname;
    }
    get Id() {
        return this._id;
    }
    get FirstName() {
        return this._firstname;
    }
    get LastName() {
        return this._lastname;
    }
    set Id(id) {
        this._id = id;
    }
    set FirstName(firstname) {
        this._firstname = firstname;
    }
    set LastName(lastname) {
        this._lastname = lastname;
    }
}
let c1 = new Customer(101, "abhi", "londhe");
console.log(c1.Id);
console.log(c1.FirstName);
console.log(c1.LastName);
