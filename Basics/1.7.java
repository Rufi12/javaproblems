/*
Prob 2:
Write a program to get firstName and lastName and n as input and print fullName that is firstName+lastName for n times.

Input
Nandy
Raja
5

Expected output:
NandyRaja
NandyRaja
NandyRaja
NandyRaja
NandyRaja
Explanation - Nandy is the firstName, Raja is the lastName and n is 5, so the expected output has NandyRaja printed 5 times.
*/

import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String firstname=sc.nextLine();
		String lastname=sc.nextLine();
        int n=sc.nextInt();
		for(int i=1; i<=n; i++) {
			System.out.println(firstname+lastname);
		}
	}
}