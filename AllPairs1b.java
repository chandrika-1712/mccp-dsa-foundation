//two pointer for unsorted distinct
import java.util.*;
class AllPairs1b{
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
	Arrays.sort(arr);
    int i=0;
    int j=n-1;
    while(i<j){
      if(arr[i]+arr[j]==target)
      {
	    List<Integer> al=new ArrayList<>();
		al.add(arr[i]);
		al.add(arr[j]);
	    res.add(al);
		i++;
		j--;
	  }
      else if(arr[i]+arr[j]<0)
       i++;
      else
        j--;
     }
	return res;
 }
}
				
				
	 