function Student (Stud_name, Stud_age, Stud_gender) {

    // assigning  parameter values to the calling object
     this.name = Stud_name,
     this.age = Stud_age,
     this.gender = Stud_gender;
    }
 
 // creating objects
 const obj1 = new Student('Vicky', 25, 'Male');
 const obj2 = new Student('Vishal', 25, 'Male');
 const obj3 = new Student('Bunty', 25, 'Female');


 Student.prototype.branch = 'CS';
 Student.prototype.College = 'GITAM';

 console.log(obj1.name); 
 console.log(obj1.age);
 console.log(obj1.gender); 
 console.log(obj1.branch); 
 console.log(obj3.College);

 console.log(obj2.name); 
 console.log(obj2.age);
 console.log(obj2.gender); 
 console.log(obj2.branch);
 console.log(obj3.College);

 console.log(obj3.name); 
 console.log(obj3.age);
 console.log(obj3.gender); 
 console.log(obj3.branch); 
 console.log(obj3.College); 
 
 Student.prototype={branch:'IT'}
 
 const obj4 = new Student('Dev',26,'Male');
 console.log(obj1.branch);

 console.log(obj4.name); 
 console.log(obj4.age);
 console.log(obj4.gender); 
 console.log(obj4.branch); 
