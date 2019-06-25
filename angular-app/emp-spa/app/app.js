angular.module('empApp', ['ngRoute'])
    .config(['$routeProvider', function ($routeProvider) {
        $routeProvider
            .when('/', {
                templateUrl: 'fragments/home.html',
                controller: 'homeController'
            })
            .when('/add', {
                templateUrl: 'fragments/add.html',
                controller: 'addController'
            })
            .when('/edit:id', {
                templateUrl: 'fragments/edit.html',
                controller: 'editController'
            })
            .when('/login', {
                templateUrl: 'fragments/login.html',
                controller: 'loginController'
            })
            .otherwise({redirectTo:'/'})
    }]);

