//pangram method1--using hashmap
import java.util.*;
class Pangram1{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    String s1=sc.nextLine();
    s1=s1.toLowerCase();
    HashMap<Character,Integer> hm=new HashMap<>();
     for(char c : s1.toCharArray()) {
            if (c>='a'&&c<='z'){
                hm.put(c,hm.getOrDefault(c,0)+1);
            }
        }
      if (hm.size() == 26) {
            System.out.println("pangram");
        } else {
            System.out.println("not pangram");
        }
  }
}