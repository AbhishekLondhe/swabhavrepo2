class Customer{
    private _id:Number;
    private _firstname:String;
    private _lastname:String;
    constructor(id:Number,firstname:String,lastname:String){
        this._id=id;
        this._firstname=firstname;
        this._lastname=lastname;
    }
    public get Id(){
        return this._id;
    }

    public get FirstName(){
            return this._firstname;
    }

    public get LastName(){
        return this._lastname;
    }

    public set Id(id:Number){
        this._id=id;
    }

    public set FirstName(firstname:String){
        this._firstname=firstname;
    }

    public set LastName(lastname:String){
        this._lastname=lastname;
    }

}
let c1=new Customer(101,"abhi","londhe");
console.log(c1.Id);
console.log(c1.FirstName);
console.log(c1.LastName);