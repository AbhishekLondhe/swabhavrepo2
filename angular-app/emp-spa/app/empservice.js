angular.module('empApp')
.factory('empService',function(){

    var obj={};


    var employees = [
        {
            'name': 'abhishek',
            'salary': 45000,
            'doj': '1 / 7 / 2019',
            'designation': 'Developer'
        },
        {
            'name': 'deepak',
            'salary': 70000,
            'doj': '15 / 7 / 2019',
            'designation': 'Tester'
        },
        {
            'name': 'shekhar',
            'salary': 80000,
            'doj': '10 / 7 / 2019',
            'designation': 'Developer'
        },
        {
            'name': 'yogita',
            'salary': 60000,
            'doj': '12 / 7 / 2019',
            'designation': 'Analyst'
        },
        {
            'name': 'onkar',
            'salary': 55000,
            'doj': '26 / 6 / 2019',
            'designation': 'Tester'
        },
        {
            'name': 'mahesh',
            'salary': 50000,
            'doj': '5 / 7 / 2019',
            'designation': 'Analyst'
        }
    
    ]

    obj.getEmployeeData=function(){
        return employees;
    }
    obj.addIntoEmployeeArray=function(emp){
        employees.push(emp);
    }
    obj.removeEmployee=function(x){
        employees.splice(x, 1);
    }
    var dataStore=[];
    obj.getElementByID=function(emp){
        return employees[emp];
    }
    obj.updateDataInArray=function(index,emp){
      employees[index]=emp;
    }
    obj.redirect=function(){
        if($rootScope.logout==true){
            $location.path('/');
            return;
        }
    }

    return obj;
})





