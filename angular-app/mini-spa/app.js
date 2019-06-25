angular.module('spa.app',['ngRoute'])
.config(function($routeProvider){
    $routeProvider
    
    .when('/',{
        templateUrl:'fragments/history.html',
        controller:'historyController'
    })
    .when('/politics',{
        templateUrl:'fragments/politics.html',
        controller:'politicsController'
    })
    .when('/places',{
        templateUrl:'fragments/places.html',
        controller:'placesController'
    })
    .otherwise({redirectTo:'/'});
})


.controller('historyController',['$scope',function($scope){
    $scope.history='Lorem, ipsum dolor sit amet consectetur adipisicing elit. Nostrum cumque sunt culpa delectus tempore enim, esse dicta voluptatem, officiis animi beatae aspernatur fuga laudantium dolores voluptates. Ducimus placeat doloribus ipsam.';
}])


.controller('politicsController',['$scope',function($scope){
    $scope.politics='Lorem ipsum dolor sit amet consectetur adipisicing elit. Consectetur fugiat quisquam unde consequatur? Reiciendis, laborum laudantium placeat deserunt vitae molestiae quia magnam dolor, quibusdam nihil quod ducimus accusantium nisi sunt!';
}])

.controller('placesController',['$scope',function($scope){
    $scope.places='Lorem ipsum dolor sit amet, consectetur adipisicing elit. Molestias sit possimus enim nisi non est fugit assumenda delectus quo error ducimus, optio laboriosam ipsam similique quos dolore rerum earum soluta.';
}])