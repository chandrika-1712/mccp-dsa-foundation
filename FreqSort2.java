//2.given array of n integers, sort them based decreasing order of frequency Using HashMap, priority queue and sorting
import java.util.*;
class FreqSort2{
  public static ArrayList<Integer> freq(int arr[]){
    HashMap<Integer,Integer> hm=new HashMap<>();
    for(int i=0;i< arr.length;i++){
      hm.put(arr[i],hm.getOrDefault(arr[i],0)+1);
    }
    PriorityQueue<ArrayList<Integer>> f=new PriorityQueue<>(new Sort());
    for(Map.Entry<Integer,Integer> e:hm.entrySet()){
       ArrayList<Integer> al=new ArrayList<>();
       al.add(e.getValue());
       al.add(e.getKey());
       f.add(al);//offer 
    }
    ArrayList<Integer> ans=new ArrayList<>();
    while(f.size()>0){
      ArrayList<Integer> pair=f.poll();
      int a=pair.get(0);
      int b=pair.get(1);
      for(int j=0;j<a;j++){
        ans.add(b); 
      }
    }
    return ans;
   }
   public static void main(String[] args){
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter array size:");
     int n=sc.nextInt();
     System.out.println("Enter elements");
     int[] arr=new int[n];
     for(int i=0;i<n;i++){
       arr[i]=sc.nextInt();
     }
     ArrayList<Integer> al=freq(arr);
     for(int i:al){
      System.out.print(i+" ");
     }
    }
  }
  class Sort implements Comparator<ArrayList<Integer>>{
    public int compare(ArrayList<Integer> a,ArrayList<Integer> b){
      if(a.get(0).equals(b.get(0)))
        return a.get(1)-b.get(1);
      else
        return b.get(0)-a.get(0);
    }
  }
     
    

       
    
 

