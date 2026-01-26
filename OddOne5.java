//element which occurs only once using xor operation
import java.util.*;
class OddOne5{
  public static void main(String[] args){
   Scanner sc=new Scanner(System.in);
   int n=sc.nextInt();
   int arr[]=new int[n];
   for(int i=0;i<n;i++){
    arr[i]=sc.nextInt();
   }
   int ans=0;
   for(int i=0;i<n;i++){
     ans^=arr[i];
   }
   System.out.println("OddOne: "+ans);
 }
}