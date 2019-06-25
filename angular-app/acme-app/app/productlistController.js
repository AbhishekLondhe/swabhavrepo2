angular.module('productApp')
.controller('productlistController',['$scope','productService',function($scope,productService){
    productService.getProductData()
    .then((result)=>{
        $scope.productList=result;
    }).catch((err)=>{
        console.log(err);
    })

    $scope.imageStatus=true;
    $scope.imgBtnName="Show Image";

 $scope.imgBtnClicked=function(){
  if($scope.imgBtnName=="Show Image"){
    $scope.imgBtnName="Hide Image";
    $scope.imageStatus=false;
    return;
}
if($scope.imgBtnName=="Hide Image"){
    $scope.imgBtnName="Show Image";
    $scope.imageStatus=true;
    return;
} 
 }

    
}])