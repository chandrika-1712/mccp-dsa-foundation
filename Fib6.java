//6.verify whether n is fibonocci or not-o(n)
import java.util.*;
class Fib6{
 public static void main(String[] args){
  Scanner sc=new Scanner(System.in);
  int n=sc.nextInt();
  System.out.print(fibo(n));
}
static boolean fibo(int n){
   if(n==0||n==1)
    return true;
   else{
    int a=0,b=1,c=0;
    while(true){
    c=a+b;
    if(c==n)
     return true;
    if(c>n)
     break;
    }
    a=b;
    b=c;
  java}
 return false;
}
}