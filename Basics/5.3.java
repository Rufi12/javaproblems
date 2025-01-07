/*Given an array arr, the task is to find whether the arr is palindrome or not. If the arr is palindrome then return true else return false.
An array is said to be palindrome if its reverse array matches the original array. 
Examples:
Input: arr = [1, 2, 3, 2, 1]
Output: true
Explanation: Here we can see we have [1, 2, 3, 2, 1] if we reverse it we can find [1, 2, 3, 2, 1] which is the same as before. So, the answer is true.
*/
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    int[] arr = {1, 2, 3, 4, 5};
	    int size=arr.length;
	    int[] m=new int[size];
	    for(int i=0;i<size;i++){
	        m[i]=arr[4-i];
	       }
	       int count=0;
	       for(int i=0;i<size;i++){
	         if(arr[i]==m[i]){
	             count++;
	            if(count==size){
	                System.out.println("True");
	            }
	         }else{
	             
	             System.out.println("False");
	             break;
	         }
	         
	       }
	       }
}