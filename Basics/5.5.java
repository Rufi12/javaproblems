/*Given a range [L, R]. The task is to find the sum of all the prime numbers in the given range from L to R both inclusive.
Examples:  

Input : L = 10, R = 20
Output : Sum = 60
Prime numbers between [10, 20] are:
11, 13, 17, 19
Therefore, sum = 11 + 13 + 17 + 19 = 60
Input : L = 15, R = 25
Output : Sum = 59
Note: Use sieve of eratosthenes to solve the problem**/

import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	   int L=sc.nextInt();
	   int R =sc.nextInt();
	    int[] arr=new int[R+1];
	    for(int i=1;i<=R;i++){
	        arr[i]=1;
	        
	        	
	    }
	    for(int i=2;i<=Math.sqrt(R);i++){
	          if(arr[i]==1){
	            
	            for(int j=i*2;j<=R;j=j+i){
	                 arr[j]=0;
	                 
	            }
	        }
	    }
	    int sum=0;
	     for(int i=L;i<=R;i++){
	        if(arr[i]==1){
	             sum=sum+i;
	          
	        }
	    }
		System.out.print(sum);
	}
}