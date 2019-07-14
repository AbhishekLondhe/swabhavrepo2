import { Component, Input, Output } from '@angular/core';
@Component({
    selector: 'btn-rating',
    templateUrl: 'btnrating.component.html'
})
export class BtnRatingComponent {

    @Input()
    rating:number;
    constructor() {
        this.rating=0;
    }
}