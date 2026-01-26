//You are given a String removing non-alphabets and check palindrome
import java.util.*;
class StringPal{
   public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    String S1=sc.nextLine();
    s=S1.toLowerCase();
    StringBuilder sb=new StringBuilder();
    for(int i=0;i<s.length();i++){
      char ch=s.charAt(i);
      if('a'<=ch&&ch<='z')
       sb.append(ch);
    }
    String ans=sb.toString();
    palindrome(ans);
  }
  public static void palindrome(String a){
    int n=a.length();
    for(int i=0;i<n;i++){
     if(a.charAt(i)!=a.charAt(n-i-1)){
        System.out.println("false");
        return;
     }
    }
    System.out.println("true");
  }
}