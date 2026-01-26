import java.util.*;
class Prime5{
   public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
       System.out.println("using O(n):"+prime5(n));
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
