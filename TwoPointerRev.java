//2. Find reverse of the string
import java.util.*;
class TwoPointerRev{
  public static void main(String[] args){
   Scanner sc=new Scanner(System.in);
   String s=sc.next();
   System.out.println(reverse(s));
 }
 static String reverse(String s){
   char[] a=s.toCharArray();
   int i=0;
   int j=s.length()-1;
   while(i<j){
     char temp=a[i];
     a[i]=a[j];
     a[j]=temp;
     i++;
    j--;
    }
  return String.valueOf(a);
}
}