//pangram method3--using user defined hashmap
import java.util.*;
class Pangram3{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    String s1=sc.nextLine();
    s1=s1.toLowerCase();
    boolean arr[]=new boolean[26];
     for(char c : s1.toCharArray()) {
            if (c>='a'&&c<='z'){
                arr[c-'a']=true;
            }
        }
       Boolean pangram=false;
       for(int i=0;i<26;i++){
         if(arr[i]) {
            pangram=true;
        } else {
            pangram=false;
            break;
        }
      }
      if (pangram) {
            System.out.println("pangram");
        } else {
            System.out.println("not pangram");
        }
  }
}