//1. Using Default Access Specifiers
class defAccessModifier{ 
  void display() 
     { 
         System.out.println("You are using defalut access specifier"); 
     } 
} 
//2. Using Private Access Specifiers
class priAccessModifier { 
   private void display() 
    { 
        System.out.println("You are using private access specifier"); 
    } 
} 
public class AccessModifier {
	public static void main(String[] args) {
		//default
		System.out.println("Dafault Access Specifier");
		defAccessModifier df = new defAccessModifier(); 		  
        df.display(); 
		//private
		System.out.println("Private Access Specifier");
		priAccessModifier  pr = new priAccessModifier(); 
		//trying to access private method of another class 
        //obj.display();
	}
}


//3. using protected access specifiers
class proAccessModifiers {
	protected void show() 
    { 
        System.out.println("This is protected access specifier"); 
    } 
}
//4. using protected access specifiers in public access specifiers
class pubAccessModifiers extends proAccessModifiers  {
	
	public void display() 
    { 
        System.out.println("This is Public Access Specifiers"); 
    } 
}
public class AccessModifier {

	public static void main(String[] args) {
	    pubAccessModifiers pub = new pubAccessModifiers ();   
	       pub.display();
	       pub.show();
	}

}
