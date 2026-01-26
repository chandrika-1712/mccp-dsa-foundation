import java.util.*;
class StringEncrypt{
 public static void main(String[] args){
   Scanner sc=new Scanner(System.in);
   String s=sc.nextLine();
   System.out.println(encrypt(s));
 }
 static String encrypt(String s){
   String arr[]=s.split(" ");
   StringBuilder sb=new StringBuilder();
   int n=arr.length;
   for(int i=0;i<n;i++){
	 String a=arr[i];
	 int len=a.length();
	 sb.append("[");
	 sb.append(len);
	 sb.append("]");
	 for(int j=len-1;j>=0;j--){
	   sb.append(a.charAt(j));
     }
	 sb.append("[");
	 sb.append(len);
	 sb.append("]");
	 if(i<n-1){
	   sb.append(" ");
	 }
	}
	return sb.toString();
   }
  }