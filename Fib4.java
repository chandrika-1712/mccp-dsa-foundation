//4.find and display fibonocci numbers up to n
import java.util.*;
class Fib4{
 public static void main(String[] args){
  Scanner sc=new Scanner(System.in);
 int n=sc.nextInt();
 fibo(n);
}
static void fibo(int n){
 ArrayList<Integer> al=new ArrayList<>();
 if(n==1){
  System.out.println(0);;
}
else{
int a=0,b=1,c=0;
System.out.print(a+" "+b);
while(true){
  c=a+b;
  if(c>n)
   break;
  System.out.print(" "+c);
  a=b;
  b=c;
 }
}
}
}