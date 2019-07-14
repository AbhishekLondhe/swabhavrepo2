//console.log(window);
global.f3="hello";
console.log(this);
console.log(typeof(this));
console.log("hello world");
f1();
function f1(){
    console.log("inside f1");
}
let f2=function(){
    console.log("inside f2");
}
f2();
console.log(global);
