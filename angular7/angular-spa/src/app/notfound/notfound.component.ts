import { Component } from '@angular/core';
@Component({
    selector: 'aurionpro-notfound',
    templateUrl: 'notfound.component.html'
})
export class NotFoundComponent {
    notFoundName:String;
    constructor(){
        this.notFoundName="page is NotFound!!";
    }
}