//Prob 1 : Write a program that takes an integer, then a string, then a char from the user and prints them in the screen.
/*
Input:  2 Name y
Expected Output:
2
Name
y
 */

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        sc.nextLine();
        String name=sc.nextLine();

        char c=sc.next().charAt(0);
        System.out.println(num);
        System.out.println(name);
        System.out.println(c);
    }
}
