import { Component } from '@angular/core';

import { Router, ActivatedRoute } from '@angular/router';
import { productService } from 'src/service/productService';

@Component({
    selector:'product_details',
    templateUrl:'./product_details.component.html'
})
export class ProductDetailsComponent{
    id:any
    products:any={}
    product:any={}
    constructor(private router:Router,private route: ActivatedRoute,private productSvc:productService){
        this.route.paramMap.subscribe(param => {
            this.id = param.get('id');
            console.log(this.id)
            this.getProduct(this.id)
        })
    }
    getProduct(id){
        this.productSvc.getProducts()
        .then((r)=>{
            this.products=r
            console.log(this.products)
            for(var i=0;i<this.products.length;i++){
                if(this.products[i].productId==this.id){
                    console.log(this.products[i])
                    this.product=this.products[i]
                    return this.product;
                }
            }
        })    
    }
    returnBack(){
        this.router.navigate(['/product_list'])
    }
}