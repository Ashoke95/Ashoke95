import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class ThrowEg {
	public static void validate(int num)
	{
		if(num<1){
			throw new ArithmeticException("can not solve");
			
	}
	
		else
		{
			int res=num+100;
			System.out.println("result is :"+res);
		}
	}

	
	public static void valid1() throws FileNotFoundException{
		FileReader f=new FileReader("D:\\a1.txt");
		BufferedReader b= new BufferedReader(f);
		
	}
	public static void main(String[] args) {
		
validate(5);

try
{
	valid1();
}
catch(FileNotFoundException e) {
	e.printStackTrace();
	
}
	}

}
