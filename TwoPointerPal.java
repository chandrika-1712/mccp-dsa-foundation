//1. Verify whether string is palindrome or not
import java.util.*;
public class TwoPointerPal{
  public static void main(String[] args){
   Scanner sc=new Scanner(System.in);
   String s=sc.next();
   System.out.println(palindrome(s));
 }
 static Boolean palindrome(String s){
   char[] a=s.toCharArray();
   int i=0;
   int j=s.length()-1;
   while(i<j){
    if(a[i]!=a[j]){
     return false;
    }
    i++;
    j--;
  }
  return true;
}
}