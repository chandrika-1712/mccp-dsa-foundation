//remove duplicate characters from a string using stack
import java.util.*;
class RemoveConsDup2{
 public static void main(String args[]){
  Scanner sc=new Scanner(System.in);
  String s=sc.next();
  System.out.println(remove(s));
 }
 static String remove(String s){
   Stack<Character> st=new Stack<>();
   for(int i=0;i<s.length();i++){
    char ch=s.charAt(i);
    if(st.isEmpty()||st.peek()!=ch){
	 st.push(ch);
	}
    }
	String ans="";
	for(char c:st){
		ans+=c;
	}
	return ans;
 }
 }