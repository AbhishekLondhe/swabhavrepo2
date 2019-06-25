/*
    angular.module('modStudent', [])
        .controller('controllerStudent', function ($scope, $rootScope,$timeout) {
            console.log($scope);
            console.log($rootScope);
            $scope.btnclick = function () {
                $scope.student= {
                    id: 1,
                    name: "abhishek",
                    image: "a.jpg",
                    cgpa: 7.56
                }
                $timeout(function(){
                    $scope.student = {
                    id: 2,
                    name: "deepak",
                    image: "b.jpg",
                    cgpa: 8.86
                }
                },3000);
            }
        });
*/

angular.module('modStudent',[])
        .controller('controllerStudent',['$scope','$timeout',function($scope,$timeout){
            $scope.btnclick=function(){
                $scope.student= {
                    id: 1,
                    name: "abhishek",
                    image: "a.jpg",
                    cgpa: 7.56
                }
                $timeout(function(){
                    $scope.student = {
                    id: 2,
                    name: "deepak",
                    image: "b.jpg",
                    cgpa: 8.86
                }
                },3000);
            }
        }])