function Person(){
    this.name = 'vicky';
    this.age = 25;

    this.greet = function(){
        console.log('please');
    }
}
const pers = new Person();
console.log(pers.name);

// more

function Person(){
    this.name = 'vicky';
    this.age = 25;
}

const p = new Person();
console.log(p.name);