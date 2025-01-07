/*MERGE SOrt*/

public class Main
{
    static void mergesort(int[] arr,int l,int h){
          if(l<h){
             int mid=(l+h)/2;
             mergesort(arr,l,mid);
             mergesort(arr,mid+1,h);
             merge(arr,l,mid,h);
          }
    }
          
    static void merge(int[] arr,int l,int mid,int h){
        int n1=mid-l+1;
        int n2=h-mid;
        int[] larr=new int[n1];
        int[] rarr=new int[n2];
        
        for(int i=0;i<n1;i++){
            larr[i]=arr[l+i];
        }
        for(int i=0;i<n2;i++){
            rarr[i]=arr[mid+1+i];
        }
        int s=0,t=0,u=l;
        while(s<n1 && t<n2){
            if(larr[s]<=rarr[t]){
            arr[u]=larr[s];
            s++;
            u++;
        }else{
            arr[u]=rarr[t];
            t++;
            u++;
        }
        }
    while(s<n1){
        arr[u]=larr[s];
        s++;
        u++;
    }
    while(t<n2){
        arr[u]=rarr[t];
        t++;
        u++;
    }
         
    }
    
    public static void main(String[] args){
        int[] arr={10,5,12,1,3,17,45,6};
        
        System.out.println("BEFORE SORTING:");
        for(int x:arr){
            System.out.print(x+" ");
        }
        mergesort(arr,0,arr.length-1);
        System.out.println();
         System.out.println("AFTER SORTING:");
        for(int x:arr){
            System.out.print(x+" ");
        }
        
    }
}