//5.find and return fibonocci numbers up to n
import java.util.*;
class Fib5{
 public static void main(String[] args){
  Scanner sc=new Scanner(System.in);
  int n=sc.nextInt();
  System.out.print(fibo(n));
}
static ArrayList<Integer> fibo(int n){
 ArrayList<Integer> al=new ArrayList<>();
 if(n==1){
  al.add(0);
}
else{
int a=0,b=1,c=0;
al.add(a);
al.add(b);
while(true){
  c=a+b;
  if(c>n)
   break;
  al.add(c);
  a=b;
  b=c;
 }
}
return al;
}
}