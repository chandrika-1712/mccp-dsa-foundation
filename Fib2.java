//2.find and display nth fibonocci numbers
import java.util.*;
class Fib2{
 public static void main(String[] args){
  Scanner sc=new Scanner(System.in);
 int n=sc.nextInt();
 fibo(n);
}
static void fibo(int n){
 if(n==1){
  System.out.print(0);
}
else if(n==2){
 System.out.print(0+" "+1);
}
else{
int a=0,b=1,c=0;
for(int i=2;i<=n;i++){
  c=a+b;
  System.out.print(c+" ");
  a=b;
  b=c;
 }
}
}
}