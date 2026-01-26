//binary search no of rotated sorted array
import java.util.*;
class Rotations{
 public static void main(String args[]){
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter array size:");
   int n=sc.nextInt();
   System.out.println("Enter elements");
   int[] arr=new int[n];
   for(int i=0;i<n;i++){
    arr[i]=sc.nextInt();
   }
   int ans=rotated(arr,n);
   System.out.println("answer is:"+ans);
  }
  static int rotated(int[] arr,int n){
    int l=0;
	int h=n-1;
	while(l<=h){
	 int mid=(l+h)/2;
	 if(arr[l]<arr[h]){
	  return l;
	 }
	 else if(arr[mid]<=arr[h])
	   h=mid;
	 else
	   l=mid+1;
	}
	return l;
  }
 }