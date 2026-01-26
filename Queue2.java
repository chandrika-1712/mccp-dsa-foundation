//Queue traversing using Listiterator
import java.util.*;
public class Queue2{
 public static void main(String[] args){
   Queue<Integer> q=new LinkedList<>();
   Scanner sc=new Scanner(System.in);
   int n=sc.nextInt();
   System.out.println("Enter elements");
   for(int i=1;i<=n;i++){
     int a=sc.nextInt();
     q.add(a);
   }
   ListIterator<Integer> it=q.listIterator();//giving error
   System.out.println("Elements in Queue:");
   while(it.hasNext()){
    System.out.print(it.next()+" ");
   }
  }
}