import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { studentService } from './StudentService/studentService';
import { DisplayStudentsComponent } from './displaystudents/displaystudent.component';
import { HttpClientModule } from '@angular/common/http';
import { GenderPipe } from './StudentService/Gender.pipe';
import { AddStudentComponent } from './addstudents/addstudent.component';
import{FormsModule} from '@angular/forms';
import { EditStudentsComponent } from './editstudents/editstudent.component';
import { SearchPipe } from './StudentService/Search.pipe';
@NgModule({
  declarations: [
    AppComponent, DisplayStudentsComponent,GenderPipe,AddStudentComponent,EditStudentsComponent,SearchPipe
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,HttpClientModule,FormsModule
  ],
  providers: [studentService],
  bootstrap: [AppComponent]
})
export class AppModule { }
