package Ashoke;
import java.util.*;
class product
{
	void display() {
		
		System.out.println("enter value of x,y,z respectively");
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
		int y=sc.nextInt();
		int z=sc.nextInt();
		int p=x*y*z;
		System.out.println("product of three no is :"+p+" , Thank You");
	}
}
public class ProductofThreenumber {

	public static void main(String[] args) {

 product t=new product();
 t.display();
	}

}
