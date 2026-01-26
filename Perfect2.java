//method 2 for perfect Square
import java.util.*;
class Perfect2{
 public static void main(String[] args){
  Scanner sc=new Scanner(System.in);
  int n=sc.nextInt();
  System.out.println(p2(n));
 }
 public static String p2(int n){
   int x=(int)Math.sqrt(n);//double is converted to int
   if(x*x==n)
     return "Yes";
   else
    return "No";
  }
}