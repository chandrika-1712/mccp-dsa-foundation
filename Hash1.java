import java.util.Scanner;
import java.util.HashMap;
import java.util.Set;
public class Hash1{
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
   Set<Integer> s1=hm.keySet();
   for(int i:s1){
     System.out.println(i+":"+hm.get(i));
  }
}
}
 