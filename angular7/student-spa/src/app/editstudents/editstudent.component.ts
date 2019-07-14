import { Component } from "@angular/core";
import { studentService } from '../StudentService/studentService';
import { Router, ActivatedRoute } from '@angular/router';

@Component({
    selector: 'aurionpro-editstudents',
    templateUrl: 'editstudents.component.html'
})
export class EditStudentsComponent {
    student: any={};
    id: String;
    gender:String;
    constructor(private route: ActivatedRoute, private stdService: studentService, private router: Router) {
        this.route.paramMap.subscribe(params => (this.id = params.get("id")));
        this.getObjectById(this.id);
    }

    getObjectById(id) {
        this.stdService.getStudentById(id)
            .then((r) => {
                this.student = r[0];
                console.log(this.student);
                if(this.student.isMale){
                    this.gender="true";
                }
                else{
                    this.gender="false";
                }
            })
    }

    updateData() {
        if(this.gender=="true"){
            this.student.isMale=true;
        }
        else{
            this.student.isMale=false;
        }

        this.stdService.updateStudents(this.id, this.student)
            .then((r) => {
                console.log(r);
                this.router.navigate(['/home']);
            })
            .catch((e) => {
                console.log(e);
            })
    }  
}