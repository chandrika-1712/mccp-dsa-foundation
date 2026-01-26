import java.util.*;
class Swap{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int m=sc.nextInt();
    int n=sc.nextInt();
    System.out.println("Before Swapping");
    System.out.println("m:"+m+"  n:"+n);
    System.out.println("After Swapping");
    Swap s=new Swap();
    s.swap1(m,n);
    s.swap2(m,n);
    s.swap3(m,n);
    s.swap4(m,n);
    s.swap5(m,n);
    s.swap6(m,n);
    s.swap7(m,n);
 } 
 void swap1(int m,int n){
   int a=m;
   m=n;
   n=a;
   System.out.println("Using third variable:");
   System.out.println("m:"+m+"  n:"+n);
 }
 void swap2(int m,int n){
   m=m+n;
   n=m-n;
   m=m-n;
   System.out.println("Addition and subtraction:");
   System.out.println("m:"+m+"  n:"+n);
 }
 void swap3(int m,int n){
   m=m*n;
   n=m/n;
   m=m/n;
   System.out.println("multiplication and division:");
   System.out.println("m:"+m+"  n:"+n);
 }
 void swap4(int m,int n){
   m=m^n;
   n=m^n;
   m=m^n;
   System.out.println("XOR:");
   System.out.println("m:"+m+"  n:"+n);
 }
 void swap5(int m,int n){
   m=m+n-(n=m);
   System.out.println("Singleline(+):");
   System.out.println("m:"+m+"  n:"+n);
 }
 void swap6(int m,int n){
   int[] arr = {m, n};
   int temp = arr[0];
   arr[0] = arr[1];
   arr[1] = temp;
    System.out.println("Using array:");
   System.out.println("m:"+arr[0]+" n:"+arr[1]);
 }
 void swap7(int m,int n){
   m =m ^ n^ (n = m);
   System.out.println("Singleline(XOR):");
   System.out.println("m:"+m+" n:"+n);
 } 

}