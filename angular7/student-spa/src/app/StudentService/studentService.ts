import { Injectable } from "@angular/core";
import {  HttpClient } from '@angular/common/http';

@Injectable()
export class studentService{
    constructor(private http : HttpClient){
    }
    getStudents(){
        return this.http.get("http://gsmktg.azurewebsites.net/api/v1/techlabs/test/students/",{responseType:'json'})
        .toPromise();
    }
    getStudentById(id){
        return this.http.get("http://gsmktg.azurewebsites.net/api/v1/techlabs/test/students/"+id)
        .toPromise();
    }
    addStudents(studentObject){
        return this.http.post("http://gsmktg.azurewebsites.net/api/v1/techlabs/test/students/",studentObject,{responseType:'json'})
        .toPromise();
    }
    deleteStudents(id){
        return this.http.delete("http://gsmktg.azurewebsites.net/api/v1/techlabs/test/students/"+id)
        .toPromise();
    }
    updateStudents(id,studObj){
        return this.http.put("http://gsmktg.azurewebsites.net/api/v1/techlabs/test/students/"+id,studObj)
        .toPromise();
    }
}