//Two sum with zero with unsorted array--brute force
import java.util.*;
class TwoSumZero1a{
 public static void main(String[] args){
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter array size:");
   int n=sc.nextInt();
   System.out.println("Enter array elements:");
   int arr[]=new int[n];
   for(int i=0;i<n;i++){
    arr[i]=sc.nextInt();
   }
   System.out.println(twosum(n,arr));
 }
 static boolean twosum(int n,int a[]){
    for(int i=0;i<n-1;i++){
      for(int j=i+1;j<n;j++){
       if(a[i]+a[j]==0)
          return true;
      }
    }
    return false;
 }
}
