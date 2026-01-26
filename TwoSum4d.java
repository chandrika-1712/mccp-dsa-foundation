//verify Twosum for sorted array---hashing
import java.util.*;
class TwoSum4d{
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
    HashSet<Integer> hs=new HashSet<>();
    for(int i=0;i<n;i++){
     if(hs.contains(target-arr[i]))
      return true;
     else
      hs.add(arr[i]);
    }
    return false;
}
}