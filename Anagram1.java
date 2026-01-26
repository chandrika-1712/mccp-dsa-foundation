//anagram method1--using sorting
import java.util.*;
class Anagram1{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    String s1=sc.next();
    String s2=sc.next();
    s1=s1.toLowerCase();
    s2=s2.toLowerCase();
    char ch1[]=s1.toCharArray();
    char ch2[]=s2.toCharArray();
    Arrays.sort(ch1);
    Arrays.sort(ch2);
    String a=String.valueOf(ch1);
    String b=String.valueOf(ch2);
    if(a.equals(b)){
     System.out.println("true");
    }
    else{
    System.out.println("false");
   }
  }
}