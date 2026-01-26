import java.util.*;
class Solution{
    int gcd(int m,int n){
      int a=Math.min(m,n);
      while(a>1){
         if(m%a==0&&n%a==0){
          return a;
         }
         a--;
      }
      return 1;
    }
}
public class Gcd{
  public static void main(String[] args){
    Solution s=new Solution();
    Scanner sc=new Scanner(System.in);
    int m=sc.nextInt();
    int n=sc.nextInt();
    System.out.println(s.gcd(m,n));
  }
}