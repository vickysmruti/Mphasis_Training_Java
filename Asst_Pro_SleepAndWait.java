class SleepAndWait  
{   
	
    private static Object obj = new Object();   
  
    //main() method starts with handling InterruptedException  
    public static void main(String[] args)throws InterruptedException   
    {        
        //pause process for two second  
        Thread.sleep(2000);   
 
        System.out.println( Thread.currentThread().getName() +   
        " Thread is woken after two second");   
          
        //create synchronized context from which we call Wait()  
        synchronized (obj)    
        {   
            //use wait() method to set obj in waiting state for two seconds  
            obj.wait(2000);   
  
            System.out.println(obj + " Object is in waiting state and woken after 2 seconds");   
        }   
    }   
}  