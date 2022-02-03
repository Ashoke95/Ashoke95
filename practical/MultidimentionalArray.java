package Ashoke;
//2D array or multi dimentional Array
public class MultidimentionalArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] multidimensionalArray = { {1,2},{2,3}, {3,4} };
	     
	      for(int i = 0 ; i < 3 ; i++)//representing the row value
	      {
	         //row
	         for(int j = 0 ; j < 2; j++)//representing the row value 
	         {
	            System.out.print(multidimensionalArray[i][j] + " ");
	         }
	         System.out.println();
	      }

	}

}
