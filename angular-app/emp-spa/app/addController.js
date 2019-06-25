angular.module('empApp')
    .controller('addController', ['$scope','empService','$location', '$rootScope',function ($scope,empService,$location,$rootScope) {
        //add employee

if($rootScope.logout==true){
    $location.path('/');
    return;
}

            $scope.addEmployee = function () {
                var sampleEmployee = {
                    'name': $scope.name,
                    'salary': $scope.salary,
                    'doj': $scope.doj,
                    'designation': $scope.designation,
                }
                empService.addIntoEmployeeArray(sampleEmployee);
            }
    }])