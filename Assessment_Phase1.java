import java.util.Arrays;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileFilter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.Scanner;

public class Assessment {

	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.println("Hi and Welcome to LockedMe.com");
		System.out.println("My name is N Smruti Ranjan Reddy, being a java full stack developer i have developed this application.");
		System.out.println("You can choose between given options for subsequent operations.");
		System.out.println();

		while(true){
			System.out.println("To fetch current file names in ascending order, Please Enter 1");
			System.out.println("To know the details of the user interface, Enter 2");
			System.out.println("To close the application, Enter 3");

			System.out.println();
			System.out.println("Enter your choice::");
			int choice = scan.nextInt();

			switch(choice){
			case 1: System.out.println("Files in Ascending Order");
			FileSort();
			break;
			case 2: System.out.println("User Interface");
			UserInterface();
			break;
			case 3: System.out.println("Closing Application, Thank You");
			System.exit(0);
			break;
			default: System.out.println("Incorrect input!!! Please re-enter choice from our menu");
			}
		}
	}

	public static void FileSort(){
		Scanner scanner = new Scanner( System.in );
        System.out.println("Enter the file path: ");
        String dirPath = scanner.nextLine(); // Takes the directory path as the user input

        File folder = new File(dirPath);
        if(folder.isDirectory())
        {
            File[] fileList = folder.listFiles();
            Arrays.sort(fileList);
            System.out.println("\nTotal number of items present in the directory: " + fileList.length );

            FileFilter fileFilter = new FileFilter()
            {
                @Override
                public boolean accept(File file) {
                    return !file.isDirectory();
                }
            };
            fileList = folder.listFiles(fileFilter);
            
            Arrays.sort(fileList, new Comparator()
            {
                @Override
                public int compare(Object f1, Object f2) {
                    return ((File) f1).getName().compareTo(((File) f2).getName());
                }
            });
            
            for(File file:fileList)
            {
                System.out.println(file.getName());
            }
            System.out.println("");
        }   
	}

	public static void UserInterface(){
		Scanner op = new Scanner(System.in);
		while(true){
			System.out.println();
			System.out.println("To add a file, Please Enter 7");
			System.out.println("To delete a file, Please Enter 8");
			System.out.println("To search a file, Enter 9");

			System.out.println();
			System.out.println("Enter your choice::");
			int option = op.nextInt();

			switch(option){
			case 7: System.out.println("File Addition");
			FileAdd();
			break;
			case 8: System.out.println("File Deletion");
			FileDel();
			break;
			case 9: System.out.println("File Searching");
			FileSearch();
//			break;
			return;
			default: System.out.println("Incorrect input!!! Please re-enter choice from our menu");
			}
		}
	}

	public static void FileAdd()
    {
		File file = new File("D:\\Mphasis_Training_JAVA\\screenshots/add.txt"); 
		boolean result;  
		try   
		{  
			result = file.createNewFile();  
			if(result){  
				System.out.println("file created "+file.getCanonicalPath());
				System.out.println("");
				}  
			else{  
				System.out.println("File already exist at location: "+file.getCanonicalPath()); 
				System.out.println("");
				}  
		}   
		catch (IOException e)   
		{  
		e.printStackTrace();  
		}           
    }
	
	public static void FileDel() {
		File file = new File("D:\\Mphasis_Training_JAVA\\screenshots/add.txt");

		if (file.delete()) {
			System.out.println("File deleted successfully");
			System.out.println("");
			}
		else {
			System.out.println("Failed to delete the file");
			System.out.println("");
			}
	}
	
	public static void FileSearch() {
		File dir = new File("D:\\Mphasis_Training_JAVA\\screenshots/typecasting1.png");
	      String[] children = dir.list();
	      
	      if (children == null) {
	         System.out.println("does not exist");
	         System.out.println("");
	      } else {
	         for (int i = 0; i < children.length; i++) {
	            String filename = children[i];
	            System.out.println(filename);
	         }
	      }
	}
}