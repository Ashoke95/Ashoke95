import java.io.File;
//import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileIOEG {
public static void main(String a[]) throws IOException
{
	File input=new File("F:\\input2.txt");
	File output=new File("F:\\output2.txt");
	FileReader fr=new  FileReader(input);
	FileWriter fw =new 	FileWriter(output);
	int i;
	while((i=fr.read())!=-1)
		
	{
		fw.write(i);	
	}
	fr.close();
	fw.close();
}
}
