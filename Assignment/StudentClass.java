package Ashoke;

class StudentClass {
	private int id;
    private String name;
    
 public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
 String getName() {
	return name;
}
 void  setName(String name) {
	this.name = name;// This keyword refers to current instance itself
}
	
}

class stu
{
	public static void main(String a[])
	{
		 StudentClass obj=new StudentClass();
		 StudentClass obj1=new StudentClass();
		 obj.setId(5);
		 obj.setName("Ashoke");// Setting the name by calling setter method
		 System.out.println("id is : "+obj.getId());
		 System.out.print("Name is :"+obj.getName());   // Getting the name by calling geter method
		 System.out.println();
		 obj1.setId(4);
		System.out.println("id is :"+obj1.getId());
		 obj1.setName("Milan");
		 System.out.println("Name is :"+obj1.getName());
		 
		
	}
}

