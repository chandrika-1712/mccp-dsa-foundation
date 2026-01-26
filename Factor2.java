import java.util.*;
class Factor2{
 public static void main(String[] args){
  Scanner sc=new Scanner(System.in);
  int n=sc.nextInt();
  System.out.println(f2(n));
 }
 public static ArrayList<Integer> f2(int n){
    ArrayList<Integer> al=new ArrayList<>();
    for(int i=1;i<=n/2;i++){
      if(n%i==0)
       al.add(i);
    }
    al.add(n);
    return al;
 }
}