import { Component, Input, Output } from '@angular/core';
import { EventEmitter } from '@angular/core';
@Component({
    selector: 'btn-toggle',
    templateUrl: 'btntoggle.component.html'
})
export class BtnToggleComponent {
    @Input()
    valueForText: String;
    @Input()
    OnColor: String;
    @Input()
    OffColor: String;
    myColor: String;
    @Output()
    stateChange: EventEmitter<String>;
    status: boolean = false;

    constructor() {
        console.log("inside constructor");
        this.valueForText = "";
        this.OnColor = "";
        this.OffColor = "";
        this.stateChange = new EventEmitter<String>();
    }
    onInit() {
        console.log("inside on Init");
        console.log(this.valueForText);
        console.log(this.OnColor);
    }

    clickHandler(e) {
        console.log(e);
        console.log("clicked");
        if (this.status == false) {
            console.log("btn on");
            this.status = true;
            this.myColor = this.OnColor;
            this.stateChange.emit("stateChange firing:ON");
        }
        else {
            console.log("btn off");
            this.status = false;
            console.log("mycolor" + this.myColor);
            this.myColor = this.OffColor;
            this.stateChange.emit("stateChange firing:OFF");
        }
    }
}