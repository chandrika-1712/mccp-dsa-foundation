//verify Twosum for unsorted array---sorting and binarysearch
import java.util.*;
class TwoSum1c{
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
 static boolean twosum(int n,int arr[],int target){
    Arrays.sort(arr);
    int i=0;
    int j=n-1;
    while(i<j){
       int m=(i+j)/2;
       if(target==arr[m])
        return true;
       else if(target>arr[m])
         i++;
       else
         j--;
     }
    return false;
}
}