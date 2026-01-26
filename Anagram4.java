//anagram method4--using two user defined hashmaps
import java.util.*;
class Anagram4{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    String s1=sc.next();
    String s2=sc.next();
    s1=s1.toLowerCase();
    s2=s2.toLowerCase();
    if(s1.length!=s2.length){
      System.out.println("false");
      return;
    }
     int[] arr1=new int[26];
    int[] arr2=new int[26];
    for(int i=0;i<s1.length();i++)
    {
      char c=s1.charAt(i);
      arr1[c-'a']++;
    }
    for(int i=0;i<s2.length();i++)
    {
      char c=s2.charAt(i);
      arr2[c-'a']++;
    }
 if(arr1.equals(arr2)){
     System.out.println("true");
    }
    else{
    System.out.println("false");
   }
  }
}