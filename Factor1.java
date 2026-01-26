import java.util.*;
class Factor1{
 public static void main(String[] args){
  Scanner sc=new Scanner(System.in);
  int n=sc.nextInt();
  System.out.println(f1(n));
 }
 public static ArrayList<Integer> f1(int n){
    ArrayList<Integer> al=new ArrayList<>();
    for(int i=1;i<=n;i++){
      if(n%i==0)
       al.add(i);
    }
    return al;
 }
}
  