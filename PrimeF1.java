//prime factors
import java.util.*;
class PrimeF1{
    public static void main(String[] args){
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      primef(n);
   }
   static void primef(int n){
    while(n%2==0){
     System.out.print(2+" ");
     n=n/2;
    }
    for(int i=3;i*i<=n;i=i+2){
     while(n%i==0){
     System.out.print(i+" ");
     n=n/i;
    }
   }
    if(n>1)
     System.out.print(n);
  }
}