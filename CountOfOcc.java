import java.util.*;
class CountOfOcc{
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
   int first=firstOcc(arr,target,n);
   int last=lastOcc(arr,target,n);
   int ans=0;
   if(first==-1||last==-1){
	  ans=0;
   }
   else
	  ans=last-first+1;
   System.out.println("count:"+ans);
  }
  static int firstOcc(int[] arr,int k,int n){
    int l=0;
	int h=n-1;
	int first=-1;
	while(l<=h){
	 int mid=(l+h)/2;
	 if(arr[mid]==k){
	   first=mid;
	   h=mid-1;
	 }
	 else if(arr[mid]<k){
	  l=mid+1;
	 }
	 else{
	  h=mid-1;
	 }
	}
	return first;
  }
  static int lastOcc(int[] arr,int k,int n){
    int l=0;
	int h=n-1;
	int last=-1;
	while(l<=h){
	 int mid=(l+h)/2;
	 if(arr[mid]==k){
	   last=mid;
	   l=mid+1;
	 }
	 else if(arr[mid]<k){
	  l=mid+1;
	 }
	 else{
	  h=mid-1;
	 }
	}
	return last;
  }
 }