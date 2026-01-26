//remove duplicate elements and display in input order
import java.util.Scanner;
import java.util.LinkedHashSet;
class Unique2{
 public static void main(String[] args){
  Scanner sc=new Scanner(System.in);
  int n=sc.nextInt();
   int[] arr=new int[n];
   System.out.println("Enter array elements");
   for(int i=0;i<n;i++){
     arr[i]=sc.nextInt();
   }
   LinkedHashSet<Integer> hs=new LinkedHashSet<>();
   for(int i=0;i<n;i++){
     hs.add(arr[i]);
   } 
   System.out.println("After removing duplicates");
   for(int s:hs){
    System.out.print(s+" ");
   }
  
  }
}