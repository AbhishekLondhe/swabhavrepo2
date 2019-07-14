
import { Injectable } from '@angular/core';
 @Injectable()
export class MathService{
    constructor(){
        console.log("mathservice created");
    }

    cubeEvenNo(no){
        return new Promise((resolve,reject)=>{
            console.log(no);
            if(no%2==0){
                resolve(no*no*no);
            }
            else{
                reject('not even no');
            }
        })
    }
}