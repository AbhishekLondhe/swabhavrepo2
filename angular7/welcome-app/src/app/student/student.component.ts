import { Component } from "@angular/core";
import { IStudents } from "./IStudents";
import{ICourse} from "./ICourse"

@Component({
    selector: 'aurionpro-student',
    templateUrl: 'student.component.html'
})
export class StudentComponent {
    student: IStudents;
    imgHeight:String="400px";
    imgWidth:String="400px";
    courses:ICourse[];
    constructor() {
        this.student = {
            name: "abhishek",
            cgpa: 9.54,
            location: "borivali",
            profilePic: '../../assets/download.jpg'
        }
    }
    convertCgpaToColor() {
        if(this.student.cgpa<5){
           return "red";
        }
        else if(this.student.cgpa>=5 && this.student.cgpa<8){
            return "yellow";
        }
        else{
            return "green";
        }
    }
    loadCourse(){
        this.courses=[{courseId:1,courseName:"java"},{courseId:2,courseName:"angular"},{courseId:3,courseName:"jquery"}];
    }
    nameChange(newVal:String){
        console.log(newVal);
        this.student.name=newVal;
    }
}

