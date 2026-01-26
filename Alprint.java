import java.util.*;
public class Alprint{
  public static void main(String[] args){
  Scanner sc=new Scanner(System.in);
   ArrayList<Integer> al=new ArrayList<>();
   int n=sc.nextInt();
   for(int i=0;i<n;i++){
     int x=sc.nextInt();
     al.add(x);
   }
   System.out.println("using for loop:");
   for(int i=0;i<al.size();i++){
    
    System.out.print(al.get(i)+" ");
   }
   //for each
   System.out.println("\nfor each loop:");
   for(int i:al){
    System.out.print(i+" ");
   }
   //Iterator-only forward
   System.out.println("\nusing iterator:");
   Iterator<Integer> it=al.iterator();
   while(it.hasNext()){
    System.out.print(it.next()+" ");
   }
   //ListIterator--both forward and backward
   System.out.println("\nusing list Iterator:");
   ListIterator<Integer> lit=al.listIterator();
   while(lit.hasNext()){
    System.out.print(lit.next()+" ");
   }
   //lambda expression
   System.out.println("\nusing lambda expression:");
   al.forEach(x->System.out.print(x+" "));
   //Enumeration--legacy used for stack and vector ,only forward
   System.out.println("\nusing Enumeration:");
   Enumeration<Integer> en=Collections.enumeration(al);
   while(en.hasMoreElements()){
    System.out.print(en.nextElement()+" ");
   }
   //removing even
   //create new iterator bcz it is only forward it cant go back
   System.out.println("\nBefore removal using new iterator");
    Iterator<Integer> itt=al.iterator();
   while(itt.hasNext()){
    int m=itt.next();
    if(m%2==0){
       itt.remove();
    }
   }
   System.out.println("\nAfter removal:");
  
    System.out.println(al);
    //no of times exist
   
    Iterator<Integer> ct=al.iterator();
     int count=0;
     System.out.println("\nEnter a num to count:");
    int k=sc.nextInt();
   while(ct.hasNext()){
    
    if(ct.next()==k){
       count++;
    }
   }
   System.out.println("count:");
   System.out.println(count);
  }
}