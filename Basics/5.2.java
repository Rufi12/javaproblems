/*Given an array arr of integers and an index key(0-based index). Your task is to return the element present at the index key in the array.

Input: key = 2 , arr = [10, 20, 30, 40, 50]
Output: 30
Explanation: The value of arr[2] is 30 .
Input: key = 4 , arr = [10, 20, 30, 40, 50, 60, 70]
Output: 50
Explanation: The value of the arr[4] is 50

*/
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    int key=4;
	    int[] arr = {10, 20, 30, 40, 50};
	    int size=arr.length;
	    for(int i=0;i<size;i++){
	    if(key==i){
	        System.out.print(arr[i]);
	    }
	    }
	}
}