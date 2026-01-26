import java.util.*;
public class AccessL{
  public static void main(String[] args){
   LinkedList<Integer> l=new LinkedList<>();
   l.add(7);
   l.add(17);
   l.add(37);
   l.add(77);
   //using for loop 
   System.out.println("Using for loop");
   for(int i=0;i<l.size();i++)
   {
     System.out.print(l.get(i)+" ");
   }
   //using for each loop
   System.out.println("\nfor each loop");
   for(Integer x:l){
    System.out.print(x+" ");
   }
   //using iterator
   System.out.println("\nIterator");
   Iterator it=l.iterator();
   while(it.hasNext()){
    System.out.print(it.next()+" ");
   }
   //using listiterator 
   System.out.println("\nListIterator");
   ListIterator lt=l.listIterator();
   while(lt.hasNext()){
    System.out.print(lt.next()+" ");
   }
   //using lambda expression
   System.out.println("\nlambda expression");
   l.forEach(x->System.out.print(x+" "));
 }
}
  
   