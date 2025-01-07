/*Write a program that gets n as input and print the reverse of the number

Testcase 1 :
Input : 
325345

Expected output:
543523*/

import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		int sum=0;
		while(n>0){
		    int rem=n%10;
		    sum=sum*10+rem;
		    n=n/10;
		}
		System.out.println(sum);
	}
}