import java.util.Scanner;
public class Set1{
 public static void main(String[] args){
  Scanner sc=new Scanner(System.in);
  int n=sc.nextInt();
  int ans=setBits(n);
  System.out.println(ans);
}
static int setBits(int n){
 int c=0;
 while(n>0){
  if(n%2==1)
    c++;
   n=n/2;
 }
 return c;
}
}


  
  