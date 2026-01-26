reverse only characters
import java.util.*;
class ReverseCh{
 public static void main(String[] args){
   Scanner sc=new Scanner(System.in);
   String s=sc.next();
   System.out.println(reverse(s));
  }
  static String reverse(String s){
    char[] arr=s.toCharArray();
	int i=0,j=s.length()-1;
	while(i<j){
            if(Character.isLetter(arr[i])&&Character.isLetter(arr[j])){
                char temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                i++;
                j--;
            }
            else if(!Character.isLetter(arr[i])){
                i++;
            }
            else j--;
     }
     return String.valueOf(arr);
	}
	}
  