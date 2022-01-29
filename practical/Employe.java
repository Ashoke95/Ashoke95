package Ashoke;

public class Employe {
	private String name,address;
	int age,rollno;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}

	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	
}
class test
{
	public static void main(String a[])
	{
		Employe t=new Employe();
		t.setName("Ashoke");
		t.setAge(10);
		t.setAddress("haur");
		System.out.println("name is " +t.getName());
		System.out.println("Age is "+t.getAge());
		
		System.out.println("Address  is "+t. getAddress());
		System.out.println("roll no  is "+t. getRollno());
	}
}