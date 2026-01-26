//Moves zeroes to left
import java.util.*;
class LeftZeroes{
 public static void main(String[] args){
  Scanner sc=new Scanner(System.in);
   System.out.println("Enter array  size:");
	  int m=sc.nextInt();
	  int[] arr=new int[m];
	  System.out.println("Enter elements:");
	  for(int i=0;i<m;i++){
		  arr[i]=sc.nextInt();
	  }
	  move(arr,m);
	  System.out.println(Arrays.toString(arr));
	}
	static void move(int[] arr,int n){
	  int j = n - 1;
    for(int i = n - 1; i >= 0; i--){
     if(arr[i] != 0){
        arr[j] = arr[i];
        if(i != j) 
		arr[i] = 0;
        j--;
     }
    }
	 }
}