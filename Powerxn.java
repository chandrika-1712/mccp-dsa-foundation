//power using logn
import java.util.*;
class Powerxn{
 public static void main(String args[]){
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter x:");
   int x=sc.nextInt();
   System.out.println("Enter n:");
   int n=sc.nextInt();
   System.out.println("answer is:"+power(x,n));
 }
  static int power(int x,int n){
    int res=1;
    while(n>0){
	 if(n%2==0){
	  res*=x;
	  n=n/2;
	 }
	 else{
	  res=res*x;
	  n--;
	 }
	}
	return res;
  }
 }