//return numbers Twosum for unsorted array---hashing
import java.util.*;
class TwoSum5d{
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
    HashMap<Integer, Integer> map = new HashMap<>();
    for (int i = 0; i < n; i++) {
        int complement = target - arr[i];
        if (map.containsKey(complement)) {
            return new int[]{map.get(complement), i};
        }
        map.put(arr[i], i);
    }
    return new int[]{-1, -1};
}
}