package Ashoke;





class shape{  
	void display(){System.out.println("inside is display");}  
	}  
	class rectaingle extends shape{  
	void area(){System.out.println("inside area");}  
	}  
	class cube extends rectaingle{  
	void volume(){System.out.println("this is volume");}
	
	
	}  
	public class Tester {
		public static void main(String a[])
		{
			cube t=new cube();
			t.display();
			t.area();
			t.volume();
		}
	}