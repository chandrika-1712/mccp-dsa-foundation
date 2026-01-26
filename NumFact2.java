import java.util.*;
class NumFact2{
 public static void main(String[] args){
  Scanner sc=new Scanner(System.in);
  int n=sc.nextInt();
  System.out.println(f3(n));
 }
 public static int f3(int n){
    int count=1;
    for(int i=1;i<=n/2;i++){
      if(n%i==0){
        count++;
      }
    }
    
    return count;
 }
}