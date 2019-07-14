import { Routes } from '@angular/router';
import { DisplayStudentsComponent } from './displaystudents/displaystudent.component';
import { AddStudentComponent } from './addstudents/addstudent.component';
import { EditStudentsComponent } from './editstudents/editstudent.component';

export const route:Routes=[
    {path:'home', component:DisplayStudentsComponent},
    {path:'add',component:AddStudentComponent},
    {path:'edit/:id',component:EditStudentsComponent},
    {path:'',redirectTo:'/home',pathMatch:'full'}
]