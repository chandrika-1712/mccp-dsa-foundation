//return Twosum for unsorted array---Bruteforce
import java.util.*;
class TwoSum2a{
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
   int[] ans=twosum(n,arr,target);
    if (ans[0] == -1) {
         System.out.println("No pair found");
    } else {
         System.out.println("Pair: " + Arrays.toString(ans));
    }
}
 static int[] twosum(int n,int a[],int target){
    for(int i=0;i<n-1;i++){
      for(int j=i+1;j<n;j++){
       if(a[i]+a[j]==target)
         return new int[]{a[i],a[j]};
      }
    }
    return new int[]{-1,-1};
}
}