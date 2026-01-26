//stack traversing using Listiterator
import java.util.*;
public class Stack2{
 public static void main(String[] args){
   Stack<Integer> stack=new Stack<>();
   Scanner sc=new Scanner(System.in);
   int n=sc.nextInt();
   System.out.println("Enter elements");
   for(int i=1;i<=n;i++){
     int a=sc.nextInt();
     stack.push(a);
   }
   ListIterator<Integer> it=stack.listIterator();
   System.out.println("Elements in stack:");
   while(it.hasNext()){
    System.out.print(it.next()+" ");
   }
  }
}