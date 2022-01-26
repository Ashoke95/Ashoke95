package Ashoke;


class Teacher {
	 void teach() {
	  System.out.println("Teaching subjects: Java");
	 }
	}
	class Students extends Teacher {
	 void listen() {
	  System.out.println("Listening to teacher");
	 }
	}
	class CheckSingleInheritance {
	 public static void main(String args[]) {
	  Students s1 = new Students();
	  s1.teach();
	  s1.listen();
	 }
	}

