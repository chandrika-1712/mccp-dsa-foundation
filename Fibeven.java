//2.find and display even fibonocci numbers
import java.util.*;
class Fibeven{
 public static void main(String[] args){
  Scanner sc=new Scanner(System.in);
 int n=sc.nextInt();
 fibo(n);
}
static  fibo(int n){
 if(n==){
  
}else{
int a=0,b=1,c=0,count=1;
while(count<n){
  c=a+b;
 if(c%2==0){
  System.out.print(c+" ");
  count++;
}
  a=b;
  b=c;
 }
}
}
}