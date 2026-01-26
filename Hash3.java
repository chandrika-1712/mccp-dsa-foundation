import java.util.Scanner;
import java.util.HashMap;
import java.util.Set;
public class Freq{
 public static void main(String[] args){
 Scanner sc=new Scanner(System.in);
 int n=sc.nextInt();
 int[] arr=new int[n];
 for(int i=0;i<n;i++){
   arr[i]=sc.nextInt();
 }
 HashMap<Integer,Integer> hm=new HashMap<>();
 for(int i=0;i<n;i++){
  if(hm.containskey(a[i]))
   hm.put(a[i],hm.get(a[i]+1));
  else
   hm.put(a[i],1);
}
Set<Integer> s1=hm.keySet();
for(int i:s1){
  System.out.println(i+":"+hm.get(i));
}
}
}
 
 
   