//Trapping rain water
import java.util.*;
class Trapping{
 public static void main(String args[]){
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter n value");
  int n=sc.nextInt();
  int arr[]=new int[n];
  System.out.println("Enter elements");
  for(int i=0;i<n;i++){
	  arr[i]=sc.nextInt();
  }
  System.out.println("Answer:"+trapRain(arr,n));
 }
 static int trapRain(int arr[],int n){
   int[] lmax=new int[n];
   int[] rmax=new int[n];
   int max1=arr[0];
   for(int i=0;i<n;i++){
    if(max1<arr[i])
	 max1=arr[i];
	lmax[i]=max1;
   }
   int max2=arr[n-1];
   for(int i=n-1;i>=0;i--){
    if(max2<arr[i])
	 max2=arr[i];
	rmax[i]=max2;
   }
   int res=0;
   for(int i=0;i<n;i++){
    int val=Math.min(lmax[i],rmax[i]);
	int ans=Math.abs(arr[i]-val);
	res+=ans;
    }
	return res;
 }
 }