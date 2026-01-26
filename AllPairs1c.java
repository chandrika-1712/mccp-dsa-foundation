//Hashmap for unsorted distinct
import java.util.*;
class AllPairs1c{
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
	 HashMap<Integer,Integer> hm=new HashMap<>();
	 for(int i=0;i<n;i++){
	  int a=arr[i];
	  int b=target-arr[i];
	  if(hm.containsKey(b)){
	   List<Integer> al=new ArrayList<>();
		al.add(b);
		al.add(a);
	    res.add(al);
	   }
	   else
	    hm.put(a,hm.getOrDefault(a,0)+1);
	}
	return res;
 }
}
				
				
	 