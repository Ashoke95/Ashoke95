
public class Tryeg {

	public static void main(String[] args) {

		try {
			System.out.println("hello  how are you");

			// int a=5/0;//ArithmeticException-/by 0
			// System.out.println(a);
			//String b = null;// NullpointerException
			//System.out.println("value of length is :" + b.length());

			//String s = "Ashoke";
			//int c = Integer.parseInt(s);// NumberformetException
			//System.out.println(c);
			int d[] = new int[5];
			d[4] = 30;// ArrayIndexOutofBound
			System.out.println(d[5]);

		} catch (Exception e) {
			System.out.println(e);

		}
	finally
	{
		System.out.println("it is neccessary");
	}
	}
	

}
