//remove duplicate elements
import java.util.Scanner;
import java.util.HashSet;
class Unique{
 public static void main(String[] args){
  Scanner sc=new Scanner(System.in);
  int n=sc.nextInt();
   int[] arr=new int[n];
   System.out.println("Enter array elements");
   for(int i=0;i<n;i++){
     arr[i]=sc.nextInt();
   }
   HashSet<Integer> hs=new HashSet<>();
   for(int i=0;i<n;i++){
     hs.add(arr[i]);
   } 
   System.out.println("After removing duplicates");
   for(int s:hs){
    System.out.print(s+" ");
   }
  
  }
}