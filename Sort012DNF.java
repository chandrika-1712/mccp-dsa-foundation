//sort 012  using dnf method
import java.util.*;
class Sort012DNF{
 public static void main(String args[]){
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter n value");
  int n=sc.nextInt();
  int arr[]=new int[n];
  System.out.println("Enter elements");
  for(int i=0;i<n;i++){
	  arr[i]=sc.nextInt();
  }
  sort(arr,n);
  System.out.println(Arrays.toString(arr));
 }
 static void sort(int arr[],int n){
   int l=0,m=0,h=n-1;
   while(m<=h){
     if(arr[m]==0){
	  int temp=arr[l];
	  arr[l]=arr[m];
	  arr[m]=temp;
	  l++;
	  m++;
	 }
	 else if(arr[m]==1){
	  m++;
	 }
	 else{
	  int temp=arr[m];
	  arr[m]=arr[h];
	  arr[h]=temp;
	  h--;
	 }
	}
 }
 }