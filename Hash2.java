import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;
public class Hash2{
  public static void main(String[] args){
   HashMap<Integer,Double> hm=new HashMap<>();
  Scanner sc=new Scanner(System.in);
  int n=sc.nextInt();
   for (int i = 0; i < n; i++) {
            System.out.print("Enter roll number: ");
            int rollNo = sc.nextInt();
            System.out.print("Enter CGPA: ");
            double cgpa = sc.nextDouble();
            hm.put(rollNo, cgpa);
        }
   
   for(Map.Entry<Integer,Double> e:hm.entrySet()){
     Integer key=e.getKey();
     Double value=e.getValue();
     System.out.println(key+":"+value);
   }
}
}