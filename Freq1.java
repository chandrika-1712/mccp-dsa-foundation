import java.util.Scanner;
import java.util.HashMap;
//import java.util.Set;
public class Freq1{
 public static void main(String[] args){
 Scanner sc=new Scanner(System.in);
 int n=sc.nextInt();
 int[] arr=new int[n];
 for(int i=0;i<n;i++){
   arr[i]=sc.nextInt();
 }
 HashMap<Integer,Integer> hm=new HashMap<>();
 for(int i=0;i<n;i++){
  hm.put(arr[i],hm.getOrDefault(arr[i],0)+1);
}
for(int i=0;i<n;i++){
  if(hm.containsKey(arr[i])){
   System.out.println(arr[i]+" : "+hm.get(arr[i]));
   hm.remove(arr[i]);
 }
}
}
}
 
 
   