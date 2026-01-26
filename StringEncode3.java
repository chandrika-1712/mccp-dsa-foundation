import java.util.*;
class StringEncode3{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	String arr[]=new String[n];
	for(int i=0;i<n;i++){
	  arr[i]=sc.next();
	}
	String ans[]=encode(arr,n);
	System.out.println(Arrays.toString(ans));
  }
  static String[] encode(String arr[],int n){
	String ans[]=new String[n];
	for(int i=0;i<n;i++){
	   StringBuilder sb=new StringBuilder();
	   int len=arr[i].length();
	   sb.append(len);
	   sb.append("#");
	   sb.append(arr[i]);
	   ans[i]=sb.toString();
	   
	}
	return ans;
  }
 }