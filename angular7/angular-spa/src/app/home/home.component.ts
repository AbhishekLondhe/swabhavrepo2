import { Component } from '@angular/core';
@Component({
    selector: 'aurionpro-home',
    templateUrl: 'home.component.html'
})
export class HomeComponent {
    homeName:String;
    constructor(){
        this.homeName="home page!!";
    }
}