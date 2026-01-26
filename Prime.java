import java.util.*;
class Prime{
   public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
       System.out.println("using best(O(1)):"+prime1(n));
       System.out.println("using <O(sqrt(n)):"+prime2(n));
       System.out.println("using O(sqrt(n)):"+prime3(n));
       System.out.println("using O(n/2):"+prime4(n));
       System.out.println("using O(n):"+prime5(n));
   }
   static boolean prime1(int n){
    if(n<=1)
     return false;
    if(n==2||n==3)
     return true;
    if(n%2==0||n%3==0)
      return false;
    for(int i=5;i*i<=Math.sqrt(n);i=i+6){
      if(n%i==0||n%(i+2)==0)
        return false;
    }
    return true;
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
   
   static boolean prime4(int n){
    if(n<=1)
     return false;
     int c=1;
    for(int i=1;i<=n/2;i++){
      if(n%i==0)
        c++;
    }
    if(c==2)
     return true;
    else
     return false;
   }
   static boolean prime5(int n){
    int c=0;
    if(n<=1)
     return false;
   
   for(int i=1;i<=n;i++){
     if(n%i==0)
      c++;
   }
   if(c==2)
    return true;
     else 
      return false;
   }
}
