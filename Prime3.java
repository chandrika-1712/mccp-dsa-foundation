import java.util.*;
class Prime3{
   public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
       System.out.println("using O(sqrt(n)):"+prime3(n));
          }
    static boolean prime3(int n){
    int c=0;
     if(n<=1)
      return false;
     for(int i=1;i*i<=n;i++){
        if(n%i==0){
          c++;
         if(n/i!=i)
           c++;
        }
     }
    if(c==2)
     return true;
     else
      return false;
   }
   
}