//verify Twosum for unsorted array---Bruteforce
import java.util.*;
class TwoSum1a{
  public static void main(String[] args){
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter array size:");
   int n=sc.nextInt();
   System.out.println("Enter array elements:");
   int arr[]=new int[n];
   for(int i=0;i<n;i++){
    arr[i]=sc.nextInt();
   }
   System.out.println("Enter target:");
   int target=sc.nextInt();
   System.out.println(twosum(n,arr,target));
 }
 static boolean twosum(int n,int a[],int target){
    for(int i=0;i<n-1;i++){
      for(int j=i+1;j<n;j++){
       if(a[i]+a[j]==target)
          return true;
      }
    }
    return false;
}
}