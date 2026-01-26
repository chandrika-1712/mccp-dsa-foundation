//print element and frequency in descending order
import java.util.Scanner;
import java.util.TreeMap;
import java.util.Set;
import java.util.Collections;
class FreqInSort2{
 public static void main(String[] args){
  Scanner sc=new Scanner(System.in);
  int n=sc.nextInt();
   int[] arr=new int[n];
   System.out.println("Enter array elements");
   for(int i=0;i<n;i++){
     arr[i]=sc.nextInt();
   }
   TreeMap<Integer,Integer> tm=new TreeMap<>(Collections.reverseOrder());
   for(int i=0;i<n;i++){
    tm.put(arr[i],tm.getOrDefault(arr[i],0)+1);
   }
   Set<Integer> s=tm.keySet();
   for(int x:s){
     System.out.println(x+":"+tm.get(x));
   }
  }
}