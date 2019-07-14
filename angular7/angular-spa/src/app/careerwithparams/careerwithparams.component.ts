import { Component } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
@Component({
    selector: 'aurionpro-careerparams',
    templateUrl: 'careerwithparams.component.html'
})
export class CareerWithParamsComponent {
    careerParams:String;
    id:String;
    constructor(private route:ActivatedRoute){
        this.route.paramMap.subscribe(params=>(this.id=params.get("id")));
        this.careerParams="with params!!";
    }
}