//method 3 for perfect Square
import java.util.*;
class Perfect3{
 public static void main(String[] args){
  Scanner sc=new Scanner(System.in);
  int n=sc.nextInt();
  System.out.println(p3(n));
 }
 public static String p3(int n){
   double a=Math.sqrt(n);
   int x=(int)Math.floor(a);
   int y=(int)Math.ceil(a);
   if(x==y)
    return "YES";   
  else 
   return "NO";
}
}