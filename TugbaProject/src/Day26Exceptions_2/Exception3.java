package Day26Exceptions_2;
import java.io.File;
import java.io.FileReader;
import java.io.FileNotFoundException;


public class Exception3 {

	public static void main(String[] args) {
		
		   try {
	            File file = new File("D:\\SomeFolder\\file.txt");

	            FileReader fileReader = new FileReader(file);
	            
	        } catch (FileNotFoundException ex) {
	        	
	            System.out.println("File not found;");
	            
	            System.out.println(ex.getStackTrace());
	        }
	    }
	}

	