import java.util.Scanner;

class Calculator {
  public static void main(String[] args) {

    char op;
    Double n1, n2, r;

    // create an object of Scanner class
    Scanner input = new Scanner(System.in);

    // ask users to enter operator
    System.out.println("Choose an operator: +, -, *, /, %");
    op = input.next().charAt(0);

    // ask users to enter numbers
    System.out.println("Enter first number");
    n1 = input.nextDouble();

    System.out.println("Enter second number");
    n2 = input.nextDouble();

    switch (op) {

      // addition
      case '+':
        r = n1 + n2;
        System.out.println(n1 + " + " + n2 + " = " + r);
        break;

      // subtraction
      case '-':
        r = n1 - n2;
        System.out.println(n1 + " - " + n2 + " = " + r);
        break;

      // multiplication
      case '*':
        r = n1 * n2;
        System.out.println(n1 + " * " + n2 + " = " + r);
        break;

      // division
      case '/':
        r = n1 / n2;
        System.out.println(n1 + " / " + n2 + " = " + r);
        break;

	  // modulo
      case '%':
        r = n1 % n2;
        System.out.println(n1 + " % " + n2 + " = " + r);
        break;

      default:
        System.out.println("Invalid operator");
        break;
    }

    input.close();
  }
}
