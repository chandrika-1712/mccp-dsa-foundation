//prime factors using ArrayList
import java.util.*;
class PrimeF2{
    public static void main(String[] args){
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      System.out.print(primef(n));
   }
   static ArrayList<Integer> primef(int n){
   ArrayList<Integer> al=new ArrayList<>();
    while(n%2==0){
     al.add(2);
     n=n/2;
    }
    for(int i=3;i*i<=n;i=i+2){
     while(n%i==0){
      al.add(i);
     n=n/i;
    }
   }
    if(n>1)
     al.add(n);
    return al;
  }
  
}