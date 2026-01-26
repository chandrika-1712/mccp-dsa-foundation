//anagram method5--using one user defined hashmap
import java.util.*;
class Anagram5{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    String s1=sc.next();
    String s2=sc.next();
    s1=s1.toLowerCase();
    s2=s2.toLowerCase();
    if(s1.length()!=s2.length()){
      System.out.println("false");
      return;
    }
     int[] arr1=new int[26];
    for(int i=0;i<s1.length();i++)
    {
      char c=s1.charAt(i);
      arr1[c-'a']++;
    }
    for(int i=0;i<s2.length();i++)
    {
      char c=s2.charAt(i);
      arr1[c-'a']--;
    }
 for(int count : arr1) {
            if (count != 0) {
                System.out.println("false");
                return;
            }
        }

        System.out.println("true");
  }
}