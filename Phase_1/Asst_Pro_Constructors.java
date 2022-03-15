class Const {
  String name;
  int a;
  // No Argument Conctructor
  public Const() {
    name = "Vicky";
  }
	
  // Parameterised Constructor
  Const(String l) {
    
    System.out.println(l + " Programming Language");
  }
}

class Main {
  public static void main(String[] args) {

    Const obj = new Const("Java");
    Const o = new Const();
    System.out.println("name = " + o.name);
	System.out.println("Default Value:" + o.a);
  }
}
