//pangram method2--using hashset
import java.util.*;
class Pangram2{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    String s1=sc.nextLine();
    s1=s1.toLowerCase();
    HashSet<Character> hm=new HashSet<>();
     for(char c : s1.toCharArray()) {
            if (c>='a'&&c<='z'){
                hm.add(c);
            }
        }
      if (hm.size() == 26) {
            System.out.println("pangram");
        } else {
            System.out.println("not pangram");
        }
  }
}