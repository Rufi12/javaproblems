/*You are given an array arr[], the task is to return a list elements of arr in alternate order (starting from index 0).
Examples:
Input: arr[] = [1, 2, 3, 4]
Output: 1 3
Explanation:
Take first element: 1
Skip second element: 2
Take third element: 3
Skip fourth element: 4
Input: arr[] = [1, 2, 3, 4, 5]
Output: 1 3 5
Explanation:
Take first element: 1
Skip second element: 2
Take third element: 3
Skip fourth element: 4
Take fifth element: 5

*/
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    int[] arr = {1, 2, 3, 4, 5};
	    int size=arr.length;
	    int[] m=new int[size];
	    for(int i=0;i<size;i++){
	    if(i%2==0){
	        m[i]=arr[i];
	        System.out.print(m[i]+" ");
	    }
	    }
	}
}