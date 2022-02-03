package Ashoke;
class box  
{
 int width;
 int height; 
int length; 
} 
public class Main {

	public static void main(String[] args) {
		box obj=new box();
		obj.width=5;
		obj.height=10;
		obj.length=12;
		int y=obj.width*obj.height*obj.length;
		System.out.print(y+" ,thank You");
		
	}

}
