import java.util.*;
class Fibeven2{
 public static void main(String[] args){
  Scanner sc=new Scanner(System.in);
 int n=sc.nextInt();
 fibo(n);
}
static void fibo(int n){
 if(n==0||n==1){
  System.out.print(0);
}else{
int a=0,b=2,c=0,count=1;
while(count<n){
  ans=4*b+a;
  System.out.print(ans+" ");
  a=b;
  b=ans;
 }
}
}
}