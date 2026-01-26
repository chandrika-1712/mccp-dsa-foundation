//5.Reverse the order of words in string seprated by delimeter and remove leading and trailing dots
import java.util.*;
class Split2{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    String s=sc.nextLine();
    s=s.replaceAll("^\\.+", "");// leading
    s=s.replaceAll("\\.+$", "");// trailing
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