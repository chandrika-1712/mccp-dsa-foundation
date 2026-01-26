import java.util.*;
class Isogram4{
  public static void main(String[] args){
   Scanner sc=new Scanner(System.in);
   String S=sc.next();
   String s=S.toLowerCase();
   int n=s.length();
   boolean[] arr=new boolean[26];
   for(int i=0;i<n;i++){
     char c=s.charAt(i);
     if(arr[c-'a']){
      System.out.print("false");
      return;
     }
     arr[c-'a']=true;
   }
   System.out.print("true");
}
}