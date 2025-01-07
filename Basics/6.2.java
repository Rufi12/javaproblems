/*Write a program to print the divisors of a number recursively.

Example:
Input: 6

Output: 1 2 3 6
*/
import java.util.Scanner;
class main{
    static void printDivisors(int n, int i) {
       if (i > n) 
            return;
       if (n % i == 0) 
            System.out.print(i + " ");
         printDivisors(n, i + 1);
    }

    public static void main(String[] args) {
        printDivisors(6, 1);
            }
          }
