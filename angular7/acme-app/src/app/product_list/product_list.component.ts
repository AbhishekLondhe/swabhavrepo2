import { Component } from '@angular/core';
import { productService } from 'src/service/productService';


@Component({
    selector:'product_list',
    templateUrl:'./product_list.component.html'
})
export class ProductListComponent{
    products:any={}
    show:boolean
    constructor(private productSvc:productService){
        this.productSvc.getProducts()
        .then((r)=>{
            this.products=r
            console.log(this.products)
        })
    }
    showImage(){   
            this.show=!this.show   
    }
    
}