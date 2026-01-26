import java.util.*;
class Prime4{
   public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
       System.out.println("using O(n/2):"+prime4(n));
      
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

}
