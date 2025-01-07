/*
Write a program that gets n as input and print the number of digits in the number

Testcase 1 :
Input : 
325345
Expected output:
6

Testcase 2 :
Input : 
9879

Expected output:
4
*/
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int count=0;
	    while(n>0){
	        int rem=n%10;
	        count++;
	         n=n/10;
	    }
	    System.out.println(count);
	}
}