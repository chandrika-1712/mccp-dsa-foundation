import java.util.*;
class Isogram1{
  public static void main(String[] args){
   Scanner sc=new Scanner(System.in);
   String S=sc.next();
   String s=S.toLowerCase();
   int n=s.length();
   HashSet<Character> hs=new HashSet<>();
   for(int i=0;i<n;i++){
    char c=s.charAt(i);
    hs.add(c);
  }
  if(hs.size()!=n){
   System.out.print("false");
   return;
  }
  System.out.print("true");
}
}
   