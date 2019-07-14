import { Component } from '@angular/core';
@Component({
    selector: 'aurionpro-welcome',
    templateUrl: 'welcome.component.html'
})
export class WelcomeComponent {
    message: String;
    myOnColor:String="green";
    myOffColor:String="red";
    myText:String;
    constructor() {
        this.message = "welcome to my angular component";
        this.myText="btn hello";
    }

    stateChangeHandler(e){
        console.log("master"+e);
    }
}