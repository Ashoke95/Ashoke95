import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileIOEg2 {

	public static void main(String[] args) throws IOException {
	FileReader fr=new FileReader("F:\\input2.txt");
	BufferedReader br=new BufferedReader(fr);
	int i;
	while((i=br.read())!=-1)
	{
		System.out.print((char)i+" ");
	}
	
	br.close();
	fr.close();
	}

}
