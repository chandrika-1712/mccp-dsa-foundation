//3.find and return nth fibonocci numbers
import java.util.*;
class Fib3{
 public static void main(String[] args){
  Scanner sc=new Scanner(System.in);
 int n=sc.nextInt();
 System.out.println(fibo(n));
}
static ArrayList<Integer> fibo(int n){
 ArrayList<Integer> al=new ArrayList<>();
 if(n==1){
  al.add(0);
}
else if(n==2){
 al.add(0);
 al.add(1);
}
else{
int a=0,b=1,c=0;
for(int i=2;i<=n;i++){
  c=a+b;
  al.add(c);
  a=b;
  b=c;
 }
}
return al;
}
}