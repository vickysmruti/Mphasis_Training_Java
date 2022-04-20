function Employee (Emp_name, Emp_age, Emp_sal) {

    // assigning  parameter values to the calling object
     this.name = Emp_name;
     this.age = Emp_age;
     this.salary = Emp_sal;
    }
 
 // creating objects
 const obj1 = new Employee('Vicky', 25, 60000);
 const obj2 = new Employee('Vishal', 25, 70000);
 const obj3 = new Employee('Bunty', 25, 44000);


 Employee.prototype.desg = 'ASE';

 console.log(obj1.name, obj1.age, obj1.salary, obj1.desg);
 console.log(obj2.name, obj2.age, obj2.salary, obj2.desg);
 console.log(obj3.name, obj3.age, obj3.salary, obj3.desg);
 
Employee.prototype={desg:'SAP'}
 
 const obj4 = new Employee('Dev',26,50000);
 console.log(obj1.name, obj1.age, obj1.salary, obj1.desg);
 
 console.log(obj4.name, obj4.age, obj4.salary, obj4.desg);

