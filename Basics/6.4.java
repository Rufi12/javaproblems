/*INSERTION SORT*/

public class Main
{
	public static void main(String[] args) {
		int[] num={9,5,6,2,1,8};
		int n=num.length;
		for(int i=0;i<n-1;i++){
		     int key=num[i];
		     int j=i-1;
		     while(j>=0 && key<num[j]){
		         num[j+1]=num[j];
		         j--;
		     }
		     num[j+1]=key;
		}
			for(int i=0;i<n;i++){
			    System.out.print(num[i]+" ");
			}
	}
}