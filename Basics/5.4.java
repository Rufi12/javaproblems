/*Given two arrays of arr1 and arr2, the task is to calculate the product of the maximum element of the first array arr1, and minimum element of the second array arr2.

Examples :

Input : arr1 = [5, 7, 9, 3, 6, 2],  arr2 = [1, 2, 6, 1, 9]
Output : 9
Explanation: The max in arr1 is 9. The min element in arr2 is 1. The product is 9*1 = 9.
Input : arr1 = [0, 0, 0, 0],  arr2 = [1, 1, 2]
Output : 0
*/
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    int[] arr1 = {0, 0, 0, 0};
	    int[] arr2 ={1, 1, 2};
	    int size1=arr1.length;
	    int size2=arr2.length;
	    int max=arr1[1];
	    for(int i=1;i<size1;i++){
	       if(max<arr1[i]){
	           max=arr1[i];
	       }
	       }
	       
	       int min=arr2[1];
	       for(int i=1;i<size2;i++){
	       if(min>arr2[i]){
	           min=arr2[i];
	       }
	       }
	       System.out.println(max*min);
	       
	}
}