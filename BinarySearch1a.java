import java.util.*;
class BinarySearch1a{
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
   System.out.println(findFirstOcc(arr,n,target));
  }
  static int findFirstOcc(int arr[],int n,int x){
    int l=0;
	int h=n-1;
	while(l<=h){
	 int m=(l+h)/2;
	 if(arr[m]==x){
	  while(m>0&&arr[m-1]==x){
	   m--;
	  }
	  return m;
	 }
	 else if(arr[m]<x)
	   l=m+1;
	 else
	   h=m-1;
	 }
	 return -1;
  }
 }