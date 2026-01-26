//method 1 for perfect Square
import java.util.*;
class Perfect1{
 public static void main(String[] args){
  Scanner sc=new Scanner(System.in);
  int n=sc.nextInt();
  System.out.println(p1(n));
 }
 public static String p1(int n){
   for(int i=1;i*i<=n;i++)//sqrt(n)
   {
   if(i*i==n)
     return "Yes";
   }
   return "No";
  }
}