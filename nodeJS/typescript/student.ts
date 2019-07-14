export class Student{
    constructor(private rollno,private firstname,private lastname){
        this.rollno=rollno;
        this.firstname=firstname;
        this.lastname=lastname;
    }
    public get Rollno(){
        return this.rollno;
    }
    public get FirstName(){
        return this.firstname;
    }
    public get LastName(){
        return this.lastname;
    }
}

export class Address{
    constructor(private city,private state){
        this.city=city;
        this.state=state;

    }
    public get City(){
        return this.city;
    }
    public get State(){
        return this.state;
    }
}