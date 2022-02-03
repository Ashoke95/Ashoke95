package Ashoke;

public class MultidimentionalArray1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] a = {{1,2,3},{4,5,6}, {7,8,9}};
	     
	      for(int i = 0 ; i < 3 ; i++)//representing the row value
	      {
	         //row
	         for(int j = 0 ; j < 3; j++)//representing the row value 
	         {
	            System.out.print(a[i][j] + " ");
	         }
	         System.out.println();
	      }

	

	}

}
