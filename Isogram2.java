import java.util.*;
class Isogram2{
  public static void main(String[] args){
   Scanner sc=new Scanner(System.in);
   String S=sc.next();
   String s=S.toLowerCase();
   int n=s.length();
   HashMap<Character,Integer> hm=new HashMap<>();
   for(int i=0;i<n;i++){
    char c=s.charAt(i);
    hm.put(c,hm.getOrDefault(c,0)+1);
    if(hm.get(c)>1){
     System.out.print("false");
     return;
  }
}
  System.out.print("true");
}
}