import java.util.*;
class Factor3{
 public static void main(String[] args){
  Scanner sc=new Scanner(System.in);
  int n=sc.nextInt();
  System.out.println(f3(n));
 }
 public static ArrayList<Integer> f3(int n){
    ArrayList<Integer> al=new ArrayList<>();
    for(int i=1;i*i<=n;i++){
      if(n%i==0){
       al.add(i);
       if(n/i!=i)
        al.add(n/i);
      }
    }
    
    return al;
 }
}