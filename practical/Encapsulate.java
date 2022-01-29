

/*In the above program, the class Encapsulate is encapsulated as the variables are declared as private.
 *  The get methods like getAge() , getName() , getRoll() are set as public,
 *   these methods are used to access these variables. The setter methods like setName(),
 *  setAge(), setRoll() are also declared as public and are used to set the values of the variables.*/




package Ashoke;

 class Encapsulate {
	
	private String name;
	private int age,rollno;

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

	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

}

 class tesstencapsulate
{
	public static void main(String[] args) {
		
		Encapsulate t=new Encapsulate();
		t.setName("Ram Das");
		t.setAge(5);
		t.setRollno(4);
		System.out.println("name is " +t.getName());
		System.out.println("Age is "+t.getAge());
		
		System.out.println("rollno  is"+t.getRollno());
		
	}

}
