angular.module('productApp')
    .controller('productdetailsController', ['$scope', 'productService', '$routeParams', function ($scope, productService, $routeParams) {
        $scope.index = $routeParams.id;

        productService.getProductData()
            .then((result) => {
                $scope.productList = result;
                $scope.name = $scope.productList[$scope.index].productName;
                $scope.code = $scope.productList[$scope.index].productCode;
                $scope.description = $scope.productList[$scope.index].description;
                $scope.availability = $scope.productList[$scope.index].releaseDate;
                $scope.price = $scope.productList[$scope.index].price;
                $scope.rating = $scope.productList[$scope.index].starRating;
                $scope.imgurl = $scope.productList[$scope.index].imageUrl;
            })
    }])