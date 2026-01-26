//merge twosorted arrays and produce sorted merge array
import java.util.*;
class MergeSort1{
  public static void main(String[] args){
	  Scanner sc=new Scanner(System.in);
	  System.out.println("Enter array 1 size:");
	  int m=sc.nextInt();
	  int[] arr1=new int[m];
	  System.out.println("Enter elements:");
	  for(int i=0;i<m;i++){
		  arr1[i]=sc.nextInt();
	  }
	  System.out.println("Enter array 2 size:");
	  int n=sc.nextInt();
	  int[] arr2=new int[n];
	  System.out.println("Enter elements:");
	  for(int i=0;i<n;i++){
		  arr2[i]=sc.nextInt();
	  }
	  int ans[]=merge(arr1,m,arr2,n);
	  System.out.println(Arrays.toString(ans));
  }
  static int[] merge(int a[],int m,int b[],int n){
	  int res[]=new int[m+n];
	  int i=0,j=0,k=0;
	  while(i<m&&j<n){
		  if(a[i]<b[j]){
			  res[k++]=a[i];
			  i++;
	      }
		  else{
			  res[k++]=b[j];
			  j++;
		  }
      }
	  while(i<m){
		  res[k++]=a[i++];
	  }
	  while(j<n){
		  res[k++]=b[j++];
	  }
	  return res;
  }
}
	  