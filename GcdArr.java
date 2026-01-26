import java.util.*;
class GcdArr{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int[] arr=new int[n];
    
    System.out.println("Enter array of elemnents");
    for(int i=0;i<n;i++){
      arr[i]=sc.nextInt();
    }
    System.out.println("Gcd of Array of numbers");
    System.out.println(gcd1(n,arr));
    
  }
  public static int gcd1(int n,int arr[]){
    
    int m=0;
    m=gcd(arr[0],arr[1]);
    for(int i=1;i<n-1;i++){
      m=gcd(m,arr[i+1]);
    }
    return m;
  }
  public static int gcd(int a,int b){
    while(b%a!=0){
      int r=b%a;
      b=a;
      a=r;
    }
    return a;
  }
}