import java.util.*;
class StringCompress3{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
	String s=sc.next();
	System.out.println(compress(s));
  }
  static String compress(String s){
    int i=0;
	int n=s.length();
	StringBuilder sb=new StringBuilder();
	while(i<n){
	  char c=s.charAt(i);
	  int count=0;
	  while(i<n&&s.charAt(i)==c){
	   count++;
	   i++;
	  }
	  String ans=Integer.toOctalString(count);
	  sb.append(c);
	  sb.append(ans);
	}
	return sb.toString();
  }
 }