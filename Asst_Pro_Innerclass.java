class CPU {
    // nested class
    class Processor{
        double cores;
        double getCache(){
            return 4.3;
        }
    }
}
class Shape {
   public void display() {
      System.out.println("Inside the Shape class");
   }
}
class AnonymousDemo {
   public void createClass() {
      // Anonymous class
      Shape s = new Shape() {
         public void display() {
            System.out.println("Inside an anonymous class.");
         }
      };
      s.display();
   }
}
public class Innerclass {
    public static void main(String[] args) {
		CPU cpu = new CPU();
       // create an object of inner class using outer class
        CPU.Processor pro = cpu.new Processor();
        System.out.println("Processor Cache = " + pro.getCache());
	  // create an object of anonymous class
		AnonymousDemo an = new AnonymousDemo();
        an.createClass();
    }
}
