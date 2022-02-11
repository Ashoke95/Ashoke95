package Ashoke;

import java.util.Arrays;

public class ArraysBinarySearch {

	public static void main(String[] args) {
		
		int arr[] = {60,10,20,30,40,50};  
        int key = 60;  
        
        Arrays.sort(arr);
        for(int i=0;i<arr.length;i++)
        System.out.print(arr[i]+" ");
        int result = Arrays.binarySearch(arr,key);  
        if (result < 0)  
            System.out.println("Element is not found!");  
        else  
            System.out.println("Element is found at index: "+result);
	}

}
