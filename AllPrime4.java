import java.util.*;
public class AllPrime4{
 public static void main(String[] args){
  Scanner sc=new Scanner(System.in);
  int n=sc.nextInt();
  for(int i=1;i<=n;i++){
   if(isPrime(i)){
    System.out.print(i+" ");
   }
}
}
static boolean isPrime(int n){
  for(int i=2;i*i<=n;i++)
  {
    if(n%i==0)
     return false;
  }
  return true;
}
}
  
  