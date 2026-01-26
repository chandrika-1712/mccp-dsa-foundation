//remove duplicate characters from a string using two pointer
import java.util.*;
class RemoveConsDup{
 public static void main(String args[]){
  Scanner sc=new Scanner(System.in);
  String s=sc.next();
  System.out.println(remove(s));
 }
 static String remove(String s){
   String ans="";
   int n=s.length();
   int si=0,ei=1;
   char ch1=s.charAt(si);
   while(ei<n){
	 char ch2=s.charAt(ei);
     if(ch1==ch2)
	  ei++;
	 else{
	  ans+=ch1;
	  ch1=ch2;
	  ei++;
	 }
	 }
	 ans+=ch1;
	 return ans;
 }
 }