package Ashoke;

public class StringEqualorNot1 {

	public static void main(String[] args) {
		
		String a="Stephen Edwin King";
		String b="Walter Winchell";
		String c="stephen edwin king";
		boolean equals=a.equalsIgnoreCase(b);
		boolean equals1=a.equalsIgnoreCase(c);
		
		System.out.println("\""+a+"\" equals \"" +b+"\"?"+equals);
		System.out.println("\""+a+"\" equals \"" +c+"\"?"+equals1);
		
		
	}

}
