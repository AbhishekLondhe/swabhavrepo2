import { Pipe, PipeTransform } from "@angular/core";

@Pipe({
    name:'genderType'
})

export class GenderPipe implements PipeTransform{
    transform(isMale:boolean):String{
        if(isMale==true){
            return "Male";
        }
        else{
            return "Female";
        }
    }
}