/*
Write a Program that takes input n and prints the below pattern and upload the code to your github repo.
Sample 1:
Input:
n = 4
Expected output:
*
**
***
****

Sample 2
Input:
n= 6
*
**
***
****
*****
******
                                       */
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		
		for(int i=1,k=n;i<=n;i++,k--){
		    int p=k;
		    for(int j=i;j<=n;j++){
		        System.out.print(p--);
		    }
		    System.out.println();
		}
	}
}