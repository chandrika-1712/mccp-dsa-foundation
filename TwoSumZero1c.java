//verify Twosum zero for unsorted array---hashing
import java.util.*;
class TwoSumZero1c{
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
    HashSet<Integer> hs=new HashSet<>();
    for(int i=0;i<n;i++){
     if(hs.contains(-arr[i]))
      return true;
     else
      hs.add(arr[i]);
    }
    return false;
}
}