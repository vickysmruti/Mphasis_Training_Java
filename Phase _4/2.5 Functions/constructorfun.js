// ------------- Example 1: Create Multiple Objects with Constructor Function---------------
// In JavaScript, you can create multiple objects from a constructor function.

// constructor function
// function Person () {
//     this.name = 'John',
//     this.age = 23,

//      this.greet = function () {  // function expression
//         console.log('hello');
//     }
// }

// create objects
// const p1 = new Person();
// const p2 = new Person();

// access properties


// console.log(p1.name);  // John
// console.log(p2.name);  // John -----------

// constructor function
// function Person () {
//     this.name = 'John',
//     this.age = 23
// }

// create an object
// const person = new Person();



// *-------------Example 2: JavaScript Constructor Function Parameters -------------------
// You can also create a constructor function with parameters. For example,

// constructor function
function Person (person_name, person_age, person_gender) {

   // assigning  parameter values to the calling object
    this.name = person_name,
    this.age = person_age,
    this.gender = person_gender,

    this.greet = function () {
        return ('Hi' + ' ' + this.name);
    }
}


// creating objects
const person11 = new Person('John', 23, 'male');
const person22 = new Person('Sam', 25, 'female');

// accessing properties
console.log(person11.name); // "John"
console.log(person22.name); // "Sam"



// --------------Example 3: Adding Properties And Methods in an Object----------------
// You can add properties or methods in an object like this:

// constructor function
// function Person () {
//     this.name = 'John',
//     this.age = 23
// }

// creating objects
// let per1 = new Person();
// let per2 = new Person();

// adding property to person1 object
// person1.gender = 'male';

// adding method to person1 object
// person1.greet = function () {
//     console.log('hello');
// }

// person1.greet();   // hello

// Error code person2 doesn't have greet() method
// person2.greet();



// ----------------------Example 4: JavaScript Object Prototype---------------------
// You can also add properties and methods to a constructor function using a prototype. For example,

// constructor function
// function Person () {
//     this.name = 'John',
//     this.age = 23
// }

// creating objects
// let person1 = new Person();
// let person2 = new Person();

// adding new property to constructor function
// Person.prototype.gender = 'Male';

// console.log(person1.gender); // Male
// console.log(person2.gender); // Male
