//brute force for unsorted distinct
import java.util.*;
class AllPairs1a{
 public static void main(String args[]){
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter n value");
  int n=sc.nextInt();
  int arr[]=new int[n];
  System.out.println("Enter elements");
  for(int i=0;i<n;i++){
	  arr[i]=sc.nextInt();
  }
  System.out.println("Enter target value");
  int target=sc.nextInt();
  List<List<Integer>> ans=findAll(arr,n,target);
  System.out.println(ans);
 }
 static List<List<Integer>> findAll(int arr[],int n,int target){
	 List<List<Integer>> res=new ArrayList<>();
	for(int i=0;i<n-1;i++){
		for(int j=i+1;j<n;j++){
			if(arr[i]+arr[j]==target){
				List<Integer> al=new ArrayList<>();
				al.add(arr[i]);
				al.add(arr[j]);
				res.add(al);
			}
		}
	}
	return res;
 }
}
				
				
	 