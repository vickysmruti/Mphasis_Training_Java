class Syncronize{
 synchronized void printSync(int n){  
   for(int i=1;i<=5;i++){  
     System.out.println(n*i);  
     try{  
      Thread.sleep(400);  
     }catch(Exception e){System.out.println(e);}  
   }   
 }  
}   
class MyThread1 extends Thread{  
	Syncronize t;  
	MyThread1(Syncronize t){  
		this.t=t;  
	}  
	public void run(){  
		t.printSync(5);  
	}    
}  
class MyThread2 extends Thread{  
	Syncronize t;  
	MyThread2(Syncronize t){  
		this.t=t;  
	}  
	public void run(){  
		t.printSync(100);  
	}  
}    
public class Sync{  
	public static void main(String args[]){  
		Syncronize obj = new Syncronize();//only one object  
		MyThread1 t1=new MyThread1(obj);  
		MyThread2 t2=new MyThread2(obj);  
		t1.start();  
		t2.start();  
	}  
}  
