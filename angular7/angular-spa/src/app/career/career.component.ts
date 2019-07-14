import { Component } from '@angular/core';
@Component({
    selector: 'aurionpro-career',
    templateUrl: 'career.component.html'
})
export class CareerComponent {
    careerName:String;
    constructor(){
        this.careerName="career page!!";
    }
}