//sort the sqaures of non-decreasing array
//merge twosorted arrays and produce sorted merge array
import java.util.*;
class SquareAndSort{
  public static void main(String[] args){
	  Scanner sc=new Scanner(System.in);
	  System.out.println("Enter array size:");
	  int m=sc.nextInt();
	  int[] arr=new int[m];
	  System.out.println("Enter elements:");
	  for(int i=0;i<m;i++){
		  arr[i]=sc.nextInt();
	  }
	  int[] ans=sorted(arr,m);
	  System.out.println(Arrays.toString(ans));
  }
  static int[] sorted(int arr[],int n){
	  int res[]=new int[n];
	  int i=0,j=n-1,k=n-1;
	  while(i<=j){
		 int a=arr[i]*arr[i];
		 int b=arr[j]*arr[j];
		 if(a<b){
			 res[k--]=b;
			 j--;
		 }
		 else{
			 res[k--]=a;
			 i++;
		 }
	  }
	  return res;  
  }
}
   