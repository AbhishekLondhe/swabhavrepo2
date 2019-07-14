import { Component } from '@angular/core';
import { ReturnStatement } from '@angular/compiler';
@Component({
    selector: 'aurionpro-blueball',
    templateUrl: 'blueball.component.html'
})
export class BlueballComponent {
    btnColor: String[] = new Array(50);
    random: number = Math.floor((Math.random() * 100) / 2);
    count: number = 5;
    disableBtn: boolean = true;
    display:boolean=true;
    constructor() {
        for (let i = 0; i < 50; i++) {
            this.btnColor[i] = "black";
        }
    }
    fiftyArray(n: number): any[] {
        //console.log(Array(n));
        return Array(n);

    }
    btnClicked(index) {
        console.log("index" + index);
        console.log("random" + this.random);
        if (index == this.random && this.count > 0) {
            this.btnColor[index - 1] = "blue";
            this.count = 0;
            alert("You Won!!!");
            clearInterval(this.interval);
            location.reload();
        }
        else if (index < this.random && this.count > 0) {
            this.btnColor[index - 1] = "red";
        }
        else if (index > this.random && this.count > 0) {
            this.btnColor[index - 1] = "green";
        }
        else if (this.count == 0) {
            alert("out of Attempts & target ball is "+this.random );
            this.disableBtn = true;
        }
        this.count--;
    }
    timeLeft: number = 10;
    interval;

startTimer() {
    this.display=false;
    this.disableBtn=false;
    this.interval = setInterval(() => {
        if(this.timeLeft==0){
            clearInterval(this.interval);
            alert("time Out");
            location.reload();
        }
     else if(this.timeLeft > 0) {
        this.timeLeft--;
      } else {
        this.timeLeft = 10;
      }
    },1000)
  }


}