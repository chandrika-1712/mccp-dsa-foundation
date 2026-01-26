import java.util.*;
class PrimePow{
    public static void main(String[] args){
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      System.out.print(primef(n));
   }
   static int primef(int n){
   int c=0;
   int s=0;
    while(n%2==0){
     c++;
     n=n/2;
    }
    s=s+c;
    for(int i=3;i*i<=n;i=i+2){
     c=0;
     while(n%i==0){
     c++;
     n=n/i;
    }
    s=s+c;
   }
    if(n>1)
     s=s+1;
   return s;
  }
}