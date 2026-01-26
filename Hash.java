import java.util.HashMap;
import java.util.Set;
public class Hash{
  public static void main(String[] args){
   HashMap<Integer,Double> hm=new HashMap<>();
   hm.put(1,9.4);
   hm.put(2,8.8);
   hm.put(3,8.2);
   Set<Integer> s1=hm.keySet();
   for(int i:s1){
     System.out.println(i+":"+hm.get(i));
  }
}
}
 