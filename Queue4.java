//Queue traversing using lambda expression
import java.util.*;
public class Queue4{
 public static void main(String[] args){
   Queue<Integer> q=new LinkedList<>();
   Scanner sc=new Scanner(System.in);
   int n=sc.nextInt();
   System.out.println("Enter elements");
   for(int i=1;i<=n;i++){
     int a=sc.nextInt();
     q.add(a);
   }
   System.out.println("Elements in Queue:");
   q.stream().forEach(item->System.out.print(item+" "));
  }
}