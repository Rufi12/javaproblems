/*BUBBLE SORT CODE*/

public class Main
{
	public static void main(String[] args) {
	    int[] a={7,9,0,2,4,1};
	    int size=a.length;
	   
	 for(int i=0;i<size-1;i++){
	    for(int j=0;j<size-i-1;j++){
	          int key=a[j];
	         if(a[j]>a[j+1]){
	             a[j]=a[j+1];
	             a[j+1]=key;
	         }
	     }
	 }
	 	 for(int i=0;i<size-1;i++){
	 	     System.out.print(a[i]+" ");
	 	 }
	}
}