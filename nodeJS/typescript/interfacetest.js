function printStudent(students) {
    for (let s of students) {
        console.log(`id is ${s.id}`);
        console.log(`fname is${s.firstname}`);
        console.log(`lname is ${s.lastname}`);
    }
}
printStudent([{ id: "101", firstname: "abc", lastname: "xyz" }, { id: "102", firstname: "pqr", lastname: "mno" }]);
