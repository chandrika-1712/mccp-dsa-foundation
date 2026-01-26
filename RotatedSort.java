//binary search on rotated sorted array
import java.util.*;
class RotatedSort{
 public static void main(String args[]){
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter array size:");
   int n=sc.nextInt();
   System.out.println("Enter elements");
   int[] arr=new int[n];
   for(int i=0;i<n;i++){
    arr[i]=sc.nextInt();
   }
   System.out.println("Enter target");
   int target=sc.nextInt();
   int ans=rotated(arr,target,n);
   System.out.println("answer is:"+ans);
  }
  static int rotated(int[] arr,int k,int n){
    int l=0;
	int h=n-1;
	while(l<=h){
	 int mid=(l+h)/2;
	 if(arr[mid]==k){
	   return mid;
	 }
	 else if(arr[l]<=arr[mid]){
	   if(arr[l]<=k&&arr[mid]>=k)
	    h=mid-1;
	   else
	    l=mid+1;
	 }
	 else{
	    if(arr[mid]<k&&arr[h]>k)
		 l=mid+1;
		else 
		 h=mid-1;
	    
	 }
	}
	return -1;
  }
 }