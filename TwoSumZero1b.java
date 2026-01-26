//verify Twosum for unsorted array---two pointer
import java.util.*;
class TwoSumZero1b{
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
 static boolean twosum(int n,int arr[]){
    Arrays.sort(arr);
    int i=0;
    int j=n-1;
    while(i<j){
      if(arr[i]+arr[j]==0)
       return true;
      else if(arr[i]+arr[j]<0)
       i++;
      else
        j--;
     }
    return false;
}
}