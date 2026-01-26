import java.util.*;
public class SieveArr{
 public static void main(String[] args){
  Scanner sc=new Scanner(System.in);
  int n=sc.nextInt();
  System.out.println(findPrime(n));
}

static ArrayList<Integer> findPrime(int n){
  ArrayList<Integer> al=new ArrayList<>();
  boolean[] arr=new boolean[n+1];
  for(int i=0;i<=n;i++){
   arr[i]=true;
  }
  arr[0]=false;
  arr[1]=false;
  for(int i=2;i*i<=n;i++){
    if(arr[i]==true){
      for(int j=i+i;j<=n;j=j+i){
        arr[j]=false;
      }
    }
  }
  for(int i=2;i<=n;i++){
    if(arr[i]==true){
     al.add(i);
    }
  }
  return al;
}
}