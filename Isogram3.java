import java.util.*;
class Isogram3{
  public static void main(String[] args){
   Scanner sc=new Scanner(System.in);
   String S=sc.next();
   String s=S.toLowerCase();
   int n=s.length();
   int[] arr=new int[26];
   for(int i=0;i<n;i++){
     char c=s.charAt(i);
     arr[c-'a']++;
   }
   for(int i=1;i<26;i++){
    if(arr[i]>1){
     System.out.print("false");
     return;
    }
   }
   System.out.print("true");
}
}