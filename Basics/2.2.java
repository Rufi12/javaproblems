Write a Program that takes input n and prints the below pattern and upload the code to your github repo.



/* Sample 1:

Input:
n = 8

Expected output:
1 
2 2 
3 3 3 
4 4 4 4 
5 5 5 5 5 
6 6 6 6 6 6 
7 7 7 7 7 7 7 
8 8 8 8 8 8 8 8 

*/

import java.util.*;
public class Main
{
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	for(int i=1,p=1;i<=n;i++,p++){
	    for(int j=1;j<=i;j++){
	       System.out.print(p+" ");
	   }
	    System.out.println("");
	}
	}
}