//remove duplicate elements and display in sorted order
import java.util.Scanner;
import java.util.TreeSet;
class UniqueSort{
 public static void main(String[] args){
  Scanner sc=new Scanner(System.in);
  int n=sc.nextInt();
   int[] arr=new int[n];
   System.out.println("Enter array elements");
   for(int i=0;i<n;i++){
     arr[i]=sc.nextInt();
   }
   TreeSet<Integer> ts=new TreeSet<>();
   for(int i=0;i<n;i++){
     ts.add(arr[i]);
   } 
   System.out.println("After removing duplicates");
   for(int s:ts){
    System.out.print(s+" ");
   }
  
  }
}