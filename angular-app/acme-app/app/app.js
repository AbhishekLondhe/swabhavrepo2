
angular.module('productApp', ['ngRoute'])
    .config(['$routeProvider', function ($routeProvider) {
        $routeProvider
            .when('/', {
                templateUrl: 'fragments/welcome.html',
                controller: 'welcomeController'
            })
            .when('/productdetails:id', {
                templateUrl: 'fragments/productdetails.html',
                controller: 'productdetailsController'
            })
            .when('/productlist', {
                templateUrl: 'fragments/productlist.html',
                controller: 'productlistController'
            })
            .otherwise({ redirectTo: '/' })
    }])

    .directive('star', function () {
        var directive = {
            template: '<i class="fa fa-star" aria-hidden="true"></i>',
            restrict: 'E'
        };
        return directive;
    })


    .filter('starFilter', function ($sce) {
        return function (input) {
            let images = "";
            let index;
            for (index = 1; index < input; index++) {
                images = images + "<i class='fa fa-star' aria-hidden='true'></i>";
            }
            index--;
            console.log("index" + index);
            let temp = input - index;
            console.log("temp" + temp);
            if (temp >0.5) {
                index++;
                images = images = images = images + "<i class='fa fa-star' aria-hidden='true'></i>"
            }
            if (temp <0.5) {
                index++;
                images = images = images = images + "<i class='fa fa-star-half' aria-hidden='true'></i>"
            }
            return $sce.trustAsHtml(images);
        }
    });