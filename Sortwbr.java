//sort flag(w,b,r) using count method
import java.util.*;
class Sortwbr{
 public static void main(String args[]){
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter n value");
  int n=sc.nextInt();
  char arr[]=new char[n];
  System.out.println("Enter elements");
  for(int i=0;i<n;i++){
	  arr[i]=sc.next().charAt(0);
  }
  char[] ans=sort(arr,n);
  System.out.println(Arrays.toString(ans));
 }
 static char[] sort(char arr[],int n){
   char[] ans=new char[n];
   int c1=0,c2=0,c3=0;
   for(int i=0;i<n;i++){
    if(arr[i]=='w')
	 c1++;
	else if(arr[i]=='b')
	 c2++;
	else 
	 c3++;
	}
	int j=0;
	for(int i=0;i<c1;i++){
	  ans[j]='w';
	  j++;
	}
	for(int i=0;i<c2;i++){
	  ans[j]='b';
	  j++;
	}
	for(int i=0;i<c3;i++){
	  ans[j]='r';
	  j++;
	}
	return ans;
 }
 }