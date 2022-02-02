package Ashoke;
//Java program to convert primitive into objects  
//Autoboxing example of int to Integer  
public class WraperExample1 {

	
	public static void main(String[] args) {
	
		//Converting int into Integer  
		int a=20;  
		Integer i=Integer.valueOf(a);//converting int into Integer explicitly  \\Integer is object type(reference type)
		Integer j=Integer.valueOf(a);//autoboxing, now compiler will write Integer.valueOf(a) internally  
		  
		System.out.println(a+" "+i+" "+j);  

	}

}
