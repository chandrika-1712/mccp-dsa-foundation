//print element and frequency in the order of elements in array
import java.util.Scanner;
import java.util.LinkedHashMap;
import java.util.Set;
class FreqInOrder{
 public static void main(String[] args){
  Scanner sc=new Scanner(System.in);
  int n=sc.nextInt();
   int[] arr=new int[n];
   System.out.println("Enter array elements");
   for(int i=0;i<n;i++){
     arr[i]=sc.nextInt();
   }
   LinkedHashMap<Integer,Integer> lh=new LinkedHashMap<>();
   for(int i=0;i<n;i++){
    lh.put(arr[i],lh.getOrDefault(arr[i],0)+1);
   }
   Set<Integer> s=lh.keySet();
   for(int x:s){
     System.out.println(x+":"+lh.get(x));
   }
  }
}
  