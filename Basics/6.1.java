/*Write a recursive program to find the sum of digits of a number.
Example:
Input: 342
Output: 9
Example 2:
Input: 34534

Ouput: 19
*/

class main{
    static int sumd(int n){
        if(n==0)
           return 0;
        else 
           return (n%10)+sumd(n/10);
        
        
        
}
 public static void main(String[] args) {
        System.out.println(sumd(342));
 }
}