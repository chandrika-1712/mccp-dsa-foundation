import java.util.Scanner;
public class Set3{
 public static void main(String[] args){
  Scanner sc=new Scanner(System.in);
  int n=sc.nextInt();
  int ans=setBits(n);
  System.out.println(ans);
}
static int setBits(int n){
 int c=0;
 while(n>0){
   n=n&(n-1);
   c++;
 }
 return c;
}
}