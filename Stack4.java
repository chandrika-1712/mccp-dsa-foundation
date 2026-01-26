//stack traversing using lambda expression
import java.util.*;
public class Stack4{
 public static void main(String[] args){
   Stack<Integer> stack=new Stack<>();
   Scanner sc=new Scanner(System.in);
   int n=sc.nextInt();
   System.out.println("Enter elements");
   for(int i=1;i<=n;i++){
     int a=sc.nextInt();
     stack.push(a);
   }
   System.out.println("Elements in stack:");
   stack.stream().forEach(item->System.out.print(item+" "));

}
}