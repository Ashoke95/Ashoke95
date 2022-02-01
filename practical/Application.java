package Ashoke;
import java.util.*;

 class calculate
{   
	int x,y;

	calculate(int x, int y)
	{
		this.x=x;
		this.y=y;

	}
	void sum()
	{
		int a=this.x+this.y;
		System.out.println("sum of " +this.x+ " and "+this.y+ " is: "+a);
	} 
	void sub()
	{
		int s=this.x-this.y;
		System.out.println("subtraction of " +this.x+ " and "+this.y+ " is: "+s);
	}
	
	void mul()
	{
		int m=this.x*this.y;
		System.out.println("Multiplication  of " +this.x+ " and "+this.y+ " is: "+m);
	}
	

	void div()
	{
		int d=this.x/this.y;
		System.out.println("Division  of " +this.x+ " and "+this.y+ " is: "+d);
	}
}
public class Application {

	public static void main(String[] args) {
		calculate obj=new calculate(4,6);
		calculate obj1=new calculate(8,6);
		calculate obj2=new calculate(5,7);
		calculate obj3=new calculate(10,5);
		obj.sum();
		obj1.sub();
		obj2.mul();
		obj3.div();
}
}