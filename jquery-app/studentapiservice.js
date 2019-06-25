var urlLink="http://gsmktg.azurewebsites.net/api/v1/techlabs/test/students/"


var fetchStudentData=function(){
   return new Promise(function(resolve,reject){
       $.ajax({
           url:urlLink,
           success:function(result){
                resolve(result);
           }
       })
   })
}


var saveStudentData=function(student){
    return new Promise(function(resolve,reject){
        $.ajax({
            type:"POST",
            url:urlLink,
            success:function(result){
                resolve(result);
            },

            data:student
        })
    })
}


var deleteStudentData=function(id){
    return new Promise(function(resolve,reject){
        $.ajax({
            type:"DELETE",
            url:urlLink +id,
            success:function(result){
                resolve(result);
            }
        })
    })
}


var updateStudentData=function(id,student){
    return new Promise(function(resolve,reject){
        $.ajax({
            type:"PUT",
            url:urlLink +id,
            success:function(result){
                resolve(result);
            },
            data:student,
        })
    })
}