import { Component } from '@angular/core';
@Component({
    selector: 'aurionpro-about',
    templateUrl: 'about.component.html'
})
export class AboutComponent {
    aboutName:String;
    constructor(){
        this.aboutName="about page!!";
    }
}