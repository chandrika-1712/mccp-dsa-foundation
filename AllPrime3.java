import java.util.*;
public class AllPrime3{
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
  
  int count=0;
  for(int i=1;i*i<=n;i++)
  {
    if(n%i==0){
      count++;
      if(n/i!=i)
       count++;
    }
  }
  if(count==2)
    return true;
 else
   return false;
}
}
  
  