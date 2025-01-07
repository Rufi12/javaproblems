/*
Write a Program which takes input n and prints the below pattern and upload the code to your github repo.



Sample 1:

Input:

n = 4

Expected output:

4321

321

21

1
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