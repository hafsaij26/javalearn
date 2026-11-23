const student = {
    name: "hafsa",
    age: 20,
    grade: "A",
    rollNumber: 12345,
    semester: 4,
    displayInfo: function() {
        console.log(`Name: ${this.name}`);
        console.log(`Age: ${this.age}`);
        console.log(`Grade: ${this.grade}`);
        console.log(`Roll Number: ${this.rollNumber}`);
        console.log(`Semester: ${this.semester}`);
    }
}