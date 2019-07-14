import { Component } from '@angular/core';
import { MathService } from '../services/MathService';
import { NumberAPIService } from '../NumberAPIService/NumberAPIService';
@Component({
    selector: 'aurionpro-multibind',
    templateUrl: 'multibind.component.html'
})
export class MultiBindComponent {
    message: String;
    fontSize: String;
    fontStyle: string;
    result:any;
    backgroundColor: string;
    fontColor: string;
    //constructor(private mathService:MathService) {
    constructor(private numService:NumberAPIService){  
    this.message = "welcome to my angular component";
    }
/*
    ResultCubeNo(no){
        this.mathService.cubeEvenNo(no)
        .then((r)=>{
            this.result=r;
        })
        .catch((e)=>{
            this.result=e;
        })
    }*/

    ResultFacts(no){
        if(no == null){
            this.result=" enter a number";
            return;
        }
        this.numService.getFacts(no)
        .then((r)=>{
            this.result=r;
        })
        .catch((e)=>{
            this.result=e;
        })
    }

}