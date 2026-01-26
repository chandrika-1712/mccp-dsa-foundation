//sort wbr  using dnf method
import java.util.*;
class SortwbrDNF{
 public static void main(String args[]){
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter n value");
  int n=sc.nextInt();
  char arr[]=new char[n];
  System.out.println("Enter elements");
  for(int i=0;i<n;i++){
	  arr[i]=sc.next().charAt(0);
  }
  sort(arr,n);
  System.out.println(Arrays.toString(arr));
 }
 static void sort(char arr[],int n){
   int l=0,m=0,h=n-1;
   while(m<=h){
     if(arr[m]=='w'){
	  char temp=arr[l];
	  arr[l]=arr[m];
	  arr[m]=temp;
	  l++;
	  m++;
	 }
	 else if(arr[m]=='b'){
	  m++;
	 }
	 else{
	  char temp=arr[m];
	  arr[m]=arr[h];
	  arr[h]=temp;
	  h--;
	 }
	}
 }
 }