/*Write a program that gets n as input and print all the prime numbers till that number.

Testcase 1 :
Input : 
5
Expected output:
2 3 5*/

import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=2;i<=n;i++){
		    int count=0;
		    	for(int j=1;j<=n;j++){
		    if(i%j==0){
		        count++;
		    }
		    
		    	}	
		    if(count==2){
		        System.out.print(i+" ");
		    }
		
		}
	}
}