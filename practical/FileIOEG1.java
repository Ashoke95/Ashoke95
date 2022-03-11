import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FileIOEG1 {

	public static void main(String[] args) throws IOException {
		InputStreamReader input=new InputStreamReader(System.in);
		//FileReader  = new FileReader(input);
		
		BufferedReader br=new BufferedReader(input);
		System.out.print("enter name");
		String n=br.readLine();
		System.out.println(n);
	
		}

}
