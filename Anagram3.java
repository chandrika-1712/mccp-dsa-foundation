//anagram method3--using single hashmap
import java.util.*;
class Anagram3{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    String s1=sc.next();
    String s2=sc.next();
    s1=s1.toLowerCase();
    s2=s2.toLowerCase();
    char ch1[]=s1.toCharArray();
    char ch2[]=s2.toCharArray();
    HashMap<Character,Integer> hm1=new HashMap<>();
    for(int i=0;i<ch1.length;i++){
     hm1.put(ch1[i],hm1.getOrDefault(ch1[i],0)+1);
    }
    for(int i=0;i<ch2.length;i++){
     if(!hm1.containsKey(ch2[i])){
       System.out.println("false");
       return;
     }
      hm1.put(ch2[i],hm1.get(ch2[i])-1);
      if(hm1.get(ch2[i])==0){
         hm1.remove(ch2[i]);
     }
    }
    if(hm1.isEmpty()){
     System.out.println("true");
    }
    else{
    System.out.println("false");
   }
  }
}