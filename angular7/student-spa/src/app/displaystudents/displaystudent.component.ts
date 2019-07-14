import { Component } from "@angular/core";
import { studentService } from '../StudentService/studentService';
import { Router } from '@angular/router';
@Component({
    selector: 'aurionpro-dispstudents',
    templateUrl: 'displaystudent.component.html'
})
export class DisplayStudentsComponent {
    msg: String;
    result: any;
    resultLength: String;
    id: String;

    constructor(private stdService: studentService,private router:Router) {
        this.StudentList();

    }

    StudentList() {
        this.stdService.getStudents()
            .then((r) => {
                this.result = r;
                this.resultLength = this.result.length;
            })
            .catch((e) => {
                this.result = e;
            })
    }

    deleteStudent(id) {
        this.stdService.deleteStudents(id)
            .then((r) => {
                console.log(r);
                this.StudentList();
            })
            .catch((e) => {
                console.log(e);
            })
    }
}



