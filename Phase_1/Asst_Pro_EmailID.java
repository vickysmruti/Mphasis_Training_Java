import java.util.Scanner;

public class EmailID {
	
        public static void main(String[] args) { 
        	
            String[] strArray = { "vicky@gmail.com", "siba@gmail.com", "mallik@gmail.com","deepak@gmail.com", "sibasis@gmail.com" };  
            boolean x = false; 
            int in = 0;   
            String searchElement = null;
            System.out.println("Enter the email to search");
            Scanner sc = new Scanner(System.in);
            searchElement = sc.nextLine();
                      
            if (searchElement == null) {
            	System.out.println("You haven't entered an email");
            	return;  
            }
            for (int i = 0; i < strArray.length; i++) {  
                if(searchElement.equals(strArray[i])) {  
                    in = i;
                    x = true; 
                    break;  
                }  
            }  
            if(x)  
                System.out.println(searchElement +" EmailID found at index "+in);  
            else  
                System.out.println(searchElement +" EmailID not found in the array");  
        }  
}  
