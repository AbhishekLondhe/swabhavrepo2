angular.module('productApp')
.factory('productService',['$http','$q',function($http,$q){
        var obj={};
        obj.getProductData=function(){
            return $q((resolve,reject)=>{
                $http({
                    method:"GET",
                    url:"http://localhost/angular-app/acme-app/products.json"
                }).then(function(response){
                    resolve(response.data)
                },function(response){
                    reject(response.statusText);
                })
            })
        }
        return obj;
}])