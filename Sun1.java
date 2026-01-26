//Count of no of buildings facing sunlight using simple for loop
import java.util.*;
class Sun1{
   public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    System.out.println("Enter elements");
    int arr[]=new int[n];
    for(int i=0;i<n;i++){
      arr[i]=sc.nextInt();
    }
    int max=arr[0];
    int count=1;
    for(int i=1;i<n;i++){
      if(arr[i]>max){
         count++;
         max=arr[i];
      }
    }
    System.out.println("count is "+count);
  }
}
    

