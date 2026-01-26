import java.util.*;
class Power{
 public static void main(String[] args){
   Scanner sc=new Scanner(System.in);
   int n=sc.nextInt();
   System.out.println(nested(n));
 }
 static ArrayList<ArrayList<Integer>> nested(int n){
   ArrayList<ArrayList<Integer>> al=new ArrayList<>();
   int count=0;
   for(int i=2;i*i<=n;i++){
     count=0;
     while(n%i==0){
       count++;
      n=n/i;
     }
     if(count>0){
      ArrayList<Integer> in=new ArrayList<>();
      in.add(i);
      in.add(count);
      al.add(in);
    }
   }
   if(n>1){
    ArrayList<Integer> in=new ArrayList<>();
      in.add(n);
      in.add(1);
      al.add(in);
    
   }

   return al;
}
}
      
