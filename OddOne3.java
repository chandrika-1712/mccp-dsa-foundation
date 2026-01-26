//element which occurs only once using hashmap
import java.util.*;
class OddOne3{
  public static void main(String[] args){
   Scanner sc=new Scanner(System.in);
   int n=sc.nextInt();
   int arr[]=new int[n];
   for(int i=0;i<n;i++){
    arr[i]=sc.nextInt();
   }
   int max=0;
   for(int i=0;i<n;i++){
    max=Math.max(max,arr[i]);
   }
   int[] count=new int[max+1];
   for(int i:arr){
    count[i]++;
   }
   for(int i=0;i<max+1;i++){
    if(count[i]==1){
     System.out.println("Oddone: "+i);
    }
   }
 }
}