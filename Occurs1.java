//atleast k times
import java.util.*;
class Occurs1{
 public static void main(String[] args){
   Scanner sc=new Scanner(System.in);
   int n=sc.nextInt();
   int[] arr=new int[n];
   System.out.println("Enter array elements");
   for(int i=0;i<n;i++){
     arr[i]=sc.nextInt();
   }
    System.out.println("Enter k value");
   int k=sc.nextInt();
   LinkedHashMap<Integer,Integer> lh=new LinkedHashMap<>();
   for(int i=0;i<n;i++){
    lh.put(arr[i],lh.getOrDefault(arr[i],0)+1);
   }
   Set<Integer> s1=lh.keySet();
   for(int x:s1){
       if(lh.get(x)>=k){
        System.out.println(x+":"+lh.get(x));
      }
   }
 }}