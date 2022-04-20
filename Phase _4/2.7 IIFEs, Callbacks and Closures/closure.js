

function greet(){
    let name='Vicky';
    console.log('outer function');

    function display(){
        return 'Hi '+name;
    }
    return display;
}

const g = greet();
console.log(g);
console.log(g());



// Example2

function calculate(x){
    function multiply(y){
        return x*y;
    }
    return multiply;
}

const c = calculate(3);
console.log(multiply);
console.log(multiply());
console.log(multiply(3));
