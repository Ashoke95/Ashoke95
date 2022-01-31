package Ashoke;
import java.io.FileWriter;
import java.io.IOException;
public class FileWriterExample {

	
	 public static void main(String[] args) {
	
		 FileWriter writer = null;
	        try {
	            writer = new FileWriter("F:\\Anudip\\text.txt");
	            writer.write("Hi hou r you?");
	            writer.flush();
	            System.out.println("Data written to File");
	        } catch (IOException ioe) {
	            ioe.printStackTrace();
	        } finally {
	            try {
	                if (writer != null) {
	                    writer.close();
	                }
	            } catch (IOException ioe) {

	            }
	        }
	    }

	}