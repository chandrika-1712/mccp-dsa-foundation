//return indices of Twosum for unsorted array---sorting and twopointer
import java.util.*;
class TwoSum3b{
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
         System.out.println("Pair: "+Arrays.toString(ans));
    }

 }
 static int[] twosum(int n,int arr[],int target){
    Arrays.sort(arr);
    int i=0;
    int j=n-1;
    while(i<j){
      if(arr[i]+arr[j]==target)
       return new int[]{i,j};
      else if(arr[i]+arr[j]<target)
       i++;
      else
        j--;
     }
    return new int[]{-1,-1};
}
}