//sort 012  using count method
import java.util.*;
class Sort012a{
 public static void main(String args[]){
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter n value");
  int n=sc.nextInt();
  int arr[]=new int[n];
  System.out.println("Enter elements");
  for(int i=0;i<n;i++){
	  arr[i]=sc.nextInt();
  }
  int[] ans=sort(arr,n);
  System.out.println(Arrays.toString(ans));
 }
 static int[] sort(int arr[],int n){
   int[] ans=new int[n];
   int c1=0,c2=0,c3=0;
   for(int i=0;i<n;i++){
    if(arr[i]==0)
	 c1++;
	else if(arr[i]==1)
	 c2++;
	else 
	 c3++;
	}
	int j=0;
	for(int i=0;i<c1;i++){
	  ans[j]=0;
	  j++;
	}
	for(int i=0;i<c2;i++){
	  ans[j]=1;
	  j++;
	}
	for(int i=0;i<c3;i++){
	  ans[j]=2;
	  j++;
	}
	return ans;
 }
 }
	