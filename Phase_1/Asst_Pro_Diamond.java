interface MyInterface1{  
   public static int num = 100;
   public default void display() {
      System.out.println("display method of MyInterface1");
   }
}
interface MyInterface2{  
   public static int num = 1000;
   public default void display() {
      System.out.println("display method of MyInterface2");
   }
}  
public class Diamond implements MyInterface1, MyInterface2{
   public void display() {
      MyInterface1.super.display();
      //or,
      MyInterface2.super.display();
   }      
   public static void main(String args[]) {
      Diamond obj = new Diamond();
      obj.display();
   }
}
