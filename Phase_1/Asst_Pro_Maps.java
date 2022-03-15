import java.util.*;
public class Maps {

	public static void main(String[] args) {

		  HashMap<Integer,String> hm=new HashMap<Integer,String>();      
	      hm.put(1,"Vicky");    
	      hm.put(2,"Vishal");    
	      hm.put(3,"Bunty");   	       
	      System.out.println("\nHashMap");  
	      for(Map.Entry m:hm.entrySet()){    
	       System.out.println(m.getKey()+" "+m.getValue());    
	      }
	      Hashtable<Integer,String> ht=new Hashtable<Integer,String>();  
	      ht.put(4,"Vicky");  
	      ht.put(5,"Dev");  
	      ht.put(6,"Sibasis");    
	      System.out.println("\nHashTable");  
	      for(Map.Entry n:ht.entrySet()){    
	       System.out.println(n.getKey()+" "+n.getValue());    
	      }	      
	      TreeMap<Integer,String> tm=new TreeMap<Integer,String>();    
	      tm.put(7,"Vicky");    
	      tm.put(8,"Nihal");    
	      tm.put(9,"Susant");       	      
	      System.out.println("\nTreeMap");  
	      for(Map.Entry l:tm.entrySet()){    
	       System.out.println(l.getKey()+" "+l.getValue());    
	      }    
	      
	   }  
}

