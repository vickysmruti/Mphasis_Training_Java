
import java.util.ArrayList;
import java.util.Arrays;

// exception class
class CustomException extends Exception {
  public CustomException(String message) {
    super(message);
  }
}
class ThrowExcep
{
	  ArrayList<String> languages = new ArrayList<>(Arrays.asList("Java", "Python", "JavaScript"));
	  public void checkLanguage(String language) throws CustomException {
	    if(languages.contains(language)) {
	      throw new CustomException(language + " already exists");
	    }
	    else {
	      languages.add(language);
	      System.out.println(language + " is added to the ArrayList");
	    }
	  }
	static void fun()
	{
		try
		{
			throw new NullPointerException("demo");
		}
		catch(NullPointerException e)
		{
			System.out.println("Caught inside fun().");
			throw e; // re-throwing the exception
		}
	}

	public static void main(String args[])throws InterruptedException
	{
		ThrowExcep obj = new ThrowExcep();
		try {
		      obj.checkLanguage("Swift");
		      obj.checkLanguage("Java");
		    }
		    catch(CustomException e) {
		      System.out.println("[" + e + "] Exception Occured");
		    }
		try
		{
			fun();
		}
		catch(NullPointerException e)
		{
			System.out.println("Caught in main.");
		}
		Thread.sleep(10000);
		System.out.println("Hello Vicky");
	}
}