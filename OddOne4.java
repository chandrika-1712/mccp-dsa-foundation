//element which occurs only once using visited and unvisited
import java.util.*;
class OddOne4{
  public static void main(String[] args){
   Scanner sc=new Scanner(System.in);
   int n=sc.nextInt();
   int arr[]=new int[n];
   for(int i=0;i<n;i++){
    arr[i]=sc.nextInt();
   }
   boolean[] visited=new boolean[n];
   for(int i=0;i<n;i++){
    if(visited[i])
     continue;
    for(int j=i+1;j<n;j++){
     if(arr[i]==arr[j]){
       visited[i]=true;
       visited[j]=true;
     }
    }
   }
   for(int i=0;i<n;i++){
    if(!visited[i])
      System.out.println("Oddone: "+arr[i]);
   }
 }
}