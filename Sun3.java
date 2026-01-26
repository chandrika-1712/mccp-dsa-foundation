//You are given array of n building heights, find max altitude
import java.util.*;
class Sun3{
   public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    System.out.println("Enter elements");
    int arr[]=new int[n];
    for(int i=0;i<n;i++){
      arr[i]=sc.nextInt();
    }
    int max=0;
    int count=0;
    for(int i=0;i<n-1;i++){
      if(arr[i]<arr[i+1])
      {
       count++;
       max=Math.max(max,count);
      }
      else
       count=0;
    }
    System.out.println("count is "+max);
  }
}