/* 
Prob 2:
Write a program to take x and print multiples of x till 1000.
Input:
100

Expected Output:
100
200
300
400
500
600
700
800
900
1000
Explanation - Input is 100, multiples of 100 is 100*1, 100*2, 100*3 and so on till 1000.

*/

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        
        for(int i=1;i<=10;i++){
           System.out.println(x+"*"+i+"="+(x*i));
       }
    }
}