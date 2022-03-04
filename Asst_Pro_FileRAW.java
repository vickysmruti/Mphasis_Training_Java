
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileRAW {
 
    public static void main(String[] args) {
        try {
            FileReader reader = new FileReader("C:\\Users\\vicky\\eclipse-workspace\\Practice Projects\\bin/MyFile.txt");
            int character;
 
            while ((character = reader.read()) != -1) {
                System.out.print((char) character);
            }
            reader.close();
 
        } catch (IOException e) {
            e.printStackTrace();
        }
    } 
}
public class FileWrite {
	 
    public static void main(String[] args) {
        try {
            FileWriter writer = new FileWriter("C:\\Users\\vicky\\eclipse-workspace\\Practice Projects\\bin/MyFile.txt");
			writer.write("\r\n");
            writer.write("sibasish");
            writer.write("\r\n");   // write new line
            writer.write("Good Bye!");
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
public class FileAppend {
	 
    public static void main(String[] args) {
        try {
            FileWriter writer = new FileWriter("C:\\Users\\vicky\\eclipse-workspace\\Practice Projects\\bin/MyFile.txt", true);
            BufferedWriter bufferedWriter = new BufferedWriter(writer);
 
            bufferedWriter.write("Hello World");
            bufferedWriter.newLine();
            bufferedWriter.write("See You Again!");
 
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}