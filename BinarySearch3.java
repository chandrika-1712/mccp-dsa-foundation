import java.util.*;
class BinarySearch3{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
   System.out.println("Enter array size:");
   int n=sc.nextInt();
   System.out.println("Enter array elements:");
   int arr[]=new int[n];
   for(int i=0;i<n;i++){
    arr[i]=sc.nextInt();
   }
   System.out.println("Enter target:");
   int target=sc.nextInt();
   int l=0,h=n-1;
   System.out.println(binarysearch(arr,l,h,target));
  }
  static int binarysearch(int arr[],int l,int h,int x){
	if(l<=h){
	 int m=(l+h)/2;
	 if(arr[m]==x){
	  return m;
	 }
	 else if(arr[m]<x)
	   return binarysearch(arr,m+1,h,x);
	 else
	   return binarysearch(arr,l,m-1,x);
	 }
	 return -1;
  }
 }