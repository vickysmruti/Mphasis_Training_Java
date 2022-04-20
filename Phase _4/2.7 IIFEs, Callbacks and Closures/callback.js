function myDisplayer(some) {
    document.getElementById("demo").innerHTML = some;
  }
  
  function myCalculator(num1, num2, myCallback) {
    let mul = num1 * num2;
    myCallback(mul);
  }
  
  myCalculator(5, 5, myDisplayer);