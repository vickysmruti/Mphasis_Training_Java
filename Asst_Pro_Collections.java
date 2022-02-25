import java.util.*;

public class Collection {

	public static void main(String[] args) {
		  System.out.println("ArrayList");
		  ArrayList<String> al=new ArrayList<String>();   
	      al.add("Brahmapur");//
	      al.add("Pune");    	   
	      System.out.println(al+"\n");  

	      System.out.println("Vector");
	      Vector<Integer> v=new Vector();
	      v.addElement(22); 
	      v.addElement(27); 
	      System.out.println(v+"\n");

	      System.out.println("LinkedList");
	      LinkedList<String> ll=new LinkedList<String>();  
	      ll.add("Vicky");  
	      ll.add("Vishal");  	       
	      System.out.println(ll+"\n");  

	      System.out.println("HashSet");
	      HashSet<Integer> hs=new HashSet<Integer>();  
	      hs.add(101);  
	      hs.add(103);  
	      hs.add(102);
	      System.out.println(hs+"\n");

	      System.out.println("LinkedHashSet");
	      LinkedHashSet<Integer> lhs=new LinkedHashSet<Integer>();  
	      lhs.add(11);  
	      lhs.add(12);  
	      lhs.add(13);      
	      System.out.println(lhs);
	    }  
}
