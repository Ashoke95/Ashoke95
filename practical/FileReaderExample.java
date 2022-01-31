package Ashoke;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class FileReaderExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Reader reader = null;
        try {
            reader = new FileReader("F:\\Anudip\\text.txt");
            int data;
            while ((data = reader.read()) != -1) {
                System.out.print((char) data);
            }

        } catch (IOException ex) {
            ex.printStackTrace();
        } finally {
            if (reader != null)
                try {
                    reader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
        }
	}

}
