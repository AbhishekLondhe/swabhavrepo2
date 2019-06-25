angular.module('productApp')
.directive('starRating',function(){
    function ratingFunction($scope,element,attributes){

    }
    return{
        link:ratingFunction,
        template:"{{product.starRating |}}",
        restrict:'E',
    }
})