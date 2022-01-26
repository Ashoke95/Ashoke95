package Ashoke;


class Faculty {
	 void teach() {
	  System.out.println("Teaching subject");
	 }
	}
	class Student extends Faculty {
	 void listen() {
	  System.out.println("Listening to teacher");
	 }
	}
	class homeTution extends Student {
	 void explains() {
	  System.out.println("Does homework");
	 }
	}
	class CheckMultilevelInheritance {
	 public static void main(String argu[]) {
	  homeTution h = new homeTution();
	  h.explains();
	  h.teach();
	  h.listen();
	 }
	}



