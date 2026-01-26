import java.util.*;
class StringEncode1{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
	String s=sc.next();
	System.out.println(encode(s));
  }
  static String encode(String s){
	StringBuilder sb=new StringBuilder();
    for(int i=0;i<s.length();i++){
		char ch=s.charAt(i);
       if(i%2!=0){
         sb.append(ch=='z'?'a':(char)(ch+1));
       }
       else{
         sb.append(ch=='a'?'z':(char)(ch-1));
       }
    }
     return sb.toString();
  }
 }