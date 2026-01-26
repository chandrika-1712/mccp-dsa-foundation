//element occurning exactly two times or not using hashmap
import java.util.*;
class TwiceOrNot1{
  public static void main(String[] args){
   Scanner sc=new Scanner(System.in);
   int n=sc.nextInt();
   int arr[]=new int[n];
   for(int i=0;i<n;i++){
    arr[i]=sc.nextInt();
   }
   HashMap<Integer,Integer> hm=new HashMap<>();
   for(int i=0;i<n;i++){
    hm.put(arr[i],hm.getOrDefault(arr[i],0)+1);
   }
   for(int i:hm.values()){
    if(i!=2){
     System.out.println("false");
     return;
    }
    else
     System.out.println("true");
     return;
   }
 }
}