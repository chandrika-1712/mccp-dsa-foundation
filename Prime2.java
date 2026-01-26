import java.util.*;
class Prime2{
   public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
       System.out.println("using <O(sqrt(n)):"+prime2(n));
   }
    static boolean prime2(int n){
     if(n<=1)
      return false;
     for(int i=2;i*i<=n;i++){
        if(n%i==0)
         return false;
         
     }
     return true;
   }
   
}