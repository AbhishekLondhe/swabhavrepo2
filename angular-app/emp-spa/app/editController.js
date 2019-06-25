angular.module('empApp')
    .controller('editController', ['$scope', 'empService', '$routeParams', '$location', '$rootScope', function ($scope, empService, $routeParams, $location, $rootScope) {

        if($rootScope.logout==true){
            console.log("hello")
            $location.path('/');
            return;
        }
        
        $scope.index = $routeParams.id;
        var emp = empService.getElementByID($scope.index);
        $scope.name = emp.name;
        $scope.doj = emp.doj;
        $scope.salary = emp.salary;
        $scope.designation = emp.designation;


        $scope.updateEmployee = function () {

            $scope.emp = {
                name: $scope.name,
                doj: $scope.doj,
                salary: $scope.salary,
                designation: $scope.designation
            }
            empService.updateDataInArray($scope.index, $scope.emp);
            $location.path('/');
        }
    }])