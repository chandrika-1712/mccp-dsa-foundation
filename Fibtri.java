//you are given an integer n print fibonocci triangle with n rows
//find last digit of nth finonocci number
import java.util.*;
class Fibtri{
 public static void main(String[] args){
  Scanner sc=new Scanner(System.in);
 int n=sc.nextInt();
 fibo(n);
}
static void fibo(int n){
   int N=n*(n+1)/2;
   int f[]=new int[N];
   f[0]=0;
   f[1]=1;
   for(int i=2;i<n;i++){
     f[i]=f[i-2]+f[i-1];
   }
   int k=0;
   for(int i=1;i<=f.length;i++){
    for(int j=1;j<=i;j++){
      System.out.print(f[k]);
      k++;
    }
    System.out.println();
   }
}
}
