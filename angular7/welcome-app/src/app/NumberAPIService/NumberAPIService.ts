import { Injectable } from "@angular/core";
import { HttpClient } from '@angular/common/http';

@Injectable()
export class NumberAPIService {
    url:String="https://www.numbersapi.com"
    constructor(private http: HttpClient) {
    }


    getFacts(no) {
         return this.http.get("http://numbersapi.com/"+no,{responseType:'text'})
        .toPromise();
    }
}
