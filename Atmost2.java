//atmost 2 times
import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;
class Atmost2{
 public static void main(String[] args){
   Scanner sc=new Scanner(System.in);
   int n=sc.nextInt();
   System.out.println("Enter array elements");
   int[] arr=new int[n];
   for(int i=0;i<n;i++){
     arr[i]=sc.nextInt();
   }
   HashMap<Integer,Integer> lh=new HashMap<>();
   for(int i=0;i<n;i++){
    lh.put(arr[i],lh.getOrDefault(arr[i],0)+1);
   }
   Set<Integer> s1=lh.keySet();
   for(int x:s1){
       if(lh.get(x)<=2){
        System.out.println(x+":"+lh.get(x));
      }
   }
 }
}