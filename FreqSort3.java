//3.given array of n integers, sort them based decreasing order of frequency Using HashMap, priority queue and array
import java.util.*;
class FreqSort3{
  public static ArrayList<Integer> freq(int arr[]){
    HashMap<Integer,Integer> hm=new HashMap<>();
    for(int i=0;i< arr.length;i++){
      hm.put(arr[i],hm.getOrDefault(arr[i],0)+1);
    }
    PriorityQueue<int[]> f=new PriorityQueue<>(new Sort());
    for(Map.Entry<Integer,Integer> e:hm.entrySet()){
       int[] al=new int[2];
       al[0]=e.getValue();
       al[1]=e.getKey();
       f.add(al);//offer 
    }
    ArrayList<Integer> ans=new ArrayList<>();
    while(f.size()>0){
      int[] pair=f.poll();
      int a=pair[0];
      int b=pair[1];
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
  class Sort implements Comparator<int[]>{
    public int compare(int[] a,int[] b){
      if(a[0]==b[0])
        return a[1]-b[1];
      else
        return b[0]-a[0];
    }
  }
     
    

       
    
 

