import java.util.*;
class Solution{
   int p1(int n){
      int l=0;
      int h=n;
      while(l<h){
        int m=(l+h)/2;
        if(m*m==n){
          return 1;
        }
        else if(m*m<n){
          l=m+1;
        }
        else{
          h=m-1;
        }
      }
      return 0;
   }
}
public class Sqaure1{
   public static void main(String[] args){
    Solution obj=new Solution();
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    System.out.println(obj.p1(n));
   }
}