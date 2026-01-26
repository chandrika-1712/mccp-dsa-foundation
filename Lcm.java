import java.util.*;

public class Lcm{
  public static void main(String[] args){
    //Solution s=new Solution();
    Scanner sc=new Scanner(System.in);
    int m=sc.nextInt();
    int n=sc.nextInt();
    System.out.println(lcm(m,n));
  }
  public static int lcm(int m,int n){
     int a=Math.max(m,n);
     for(int i=a;i<=m*n;i=i+a){
      if(i%m==0&&i%n==0){
        return i;
      }
     }
     return m*n;
  }
}