package Ashoke;

public class MutableExample {

	

private String a;
 public  MutableExample(String a)
{
	this.a=a;
}

	

	public String getA() {
	return a;
}



public void setA(String a) {
	this.a = a;
}



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MutableExample obj = new  MutableExample("Ashoke");
		System.out.println(obj.getA());
		obj.setA("Hi how are you!");
		System.out.println(obj.getA());
	}

}
