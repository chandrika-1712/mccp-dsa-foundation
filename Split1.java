//4.Reverse the order of words in string seprated by delimeter
import java.util.*;
class Split1{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    String s=sc.nextLine();
    String arr[]=s.split("\\.");
    StringBuilder sb=new StringBuilder();
    for(int i=arr.length-1;i>=0;i--){
     sb.append(arr[i]);
     if(i>0)
       sb.append(".");
   }
   System.out.print(sb.toString());
 }
}