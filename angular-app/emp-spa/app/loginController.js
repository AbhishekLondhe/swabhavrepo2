angular.module('empApp')
    .controller('loginController', ['$scope', '$rootScope', '$location', '$window', function ($scope, $rootScope, $location, $window) {
        $rootScope.logout = true;


        $scope.loginEmployee = function () {
            if ($scope.username == 'admin' && $scope.pwd == 'admin123') {
                $rootScope.username = $scope.username;
                $rootScope.pwd = $scope.pwd;
                $window.sessionStorage.username = $scope.username;
                $window.sessionStorage.pwd = $scope.pwd;
                $location.path('/');
                $rootScope.logout = !$rootScope.logout;
            }
            else {
                alert('USERNAME AND PASSWORD IS WRONG!!!')
            }
        }

        function init() {
            if ($window.sessionStorage.username == "admin" && $window.sessionStorage.pwd == "admin123") {
                $scope.username = $window.sessionStorage.username;
                $scope.pwd = $window.sessionStorage.pwd;
                //$scope.loginEmployee();
                $rootScope.logout = !$rootScope.logout;
            }
        }
        init();
        $scope.logoutEmployee=function(){
            $window.sessionStorage.username="";
            $window.sessionStorage.pwd="";
            $location.path('/');
        }
    }])