angular.module('empApp')
.controller('homeController',['$scope','empService',function($scope,empService){
    $scope.employeeList=empService.getEmployeeData();

    $scope.deleteClicked=function(index){
        empService.removeEmployee(index);
    }

}])