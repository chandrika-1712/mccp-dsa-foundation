import java.util.*;
class NumFact3{
 public static void main(String[] args){
  Scanner sc=new Scanner(System.in);
  int n=sc.nextInt();
  System.out.println(f3(n));
 }
 public static int f3(int n){
    int count=0;
    for(int i=1;i*i<=n;i++){
      if(n%i==0){
       count++;
       if(n/i!=i)
        count++;
      }
    }
    
    return count;
 }
}