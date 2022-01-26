package Ashoke;
class Guide {
	 void teach() {
	  System.out.println("Teaching subject");
	 }
	}
	class Student extends Guide {
	 void listen() {
	  System.out.println("Listening");
	 }
	}
	class Principal extends Guide {
	 void evaluate() {
	  System.out.println("Evaluating");
	 }
	}
	public class CheckHieraricleInheritance {
	 public static void main(String argu[]) {
	  Principal p = new Principal();
	  p.evaluate();
	  p.teach();
	  //p.listen(); will produce an error
	 }
	}



