import { Component } from "@angular/core";
import { studentService } from '../StudentService/studentService';
import { Router } from '@angular/router';

@Component({
    selector:'aurionpro-addstudent',
    templateUrl:'addstudent.component.html'
})
export class AddStudentComponent{
    rollNo:String;
    name:String;
    email:String;
    date:String;
    age:String;
    gender:String;

    constructor(private stdService:studentService,private router:Router){
    }   

    addData(){
        let studentObject={
            rollNo:this.rollNo,
            name:this.name,
            email:this.email,
            isMale:this.gender,
            date:this.date,
            age:this.age
        }

        this.stdService.addStudents(studentObject)
        .then((r)=>{
            console.log(r);
            this.router.navigate(['/home']);
        })
        .catch((e)=>{
            console.log(e);
        })
    }


}