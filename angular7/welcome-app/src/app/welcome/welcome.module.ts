import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { FormsModule } from '@angular/forms'
import { AppRoutingModule } from '../app-routing.module';
import { WelcomeComponent } from '../welcome/welcome.component';
import { StudentComponent } from '../student/student.component';
import { BlueballComponent } from '../blueball/blueball.component';
import { MultiBindComponent } from '../multibinding/multiBind.Component';
import { MathService } from '../services/MathService';
import { NumberAPIService } from '../NumberAPIService/NumberAPIService';
import { HttpClientModule } from '@angular/common/http';
import { SnakePipe } from '../NumberAPIService/snake.pipe';
import { BtnToggleComponent } from '../btntoggle/btntoggle.component';
import { BtnRatingComponent } from '../btnrating/btnrating.component';

@NgModule({
  declarations: [
    WelcomeComponent, StudentComponent, BlueballComponent, MultiBindComponent, SnakePipe, BtnToggleComponent,BtnRatingComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule, FormsModule, HttpClientModule
  ],
  providers: [MathService, NumberAPIService],
  bootstrap: [WelcomeComponent]
})
export class WelcomeModule {

}