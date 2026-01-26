import java.util.*;
class SpiralMatrix{
 public static void main(String[] args){
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter array size:");
  int n=sc.nextInt();
  int arr[][]=new int[n][n];
  System.out.println("Enter array elements:");
  for(int i=0;i<n;i++){
   for(int j=0;j<n;j++){
    arr[i][j]=sc.nextInt();
   }
  }
  System.out.println(spiral(arr));
 }
 static String spiral(int[][] mat){
   int top=0;
   int bottom=mat.length-1;
   int left=0;
   int right=mat[0].length-1;
   StringBuilder sb=new StringBuilder();
   while(top<=bottom&&left<=right){
     for(int i=left;i<=right;i++){
	  sb.append(mat[top][i]+" ");
	 }
	 top++;
	 for(int i=top;i<=bottom;i++){
	  sb.append(mat[i][right]+" ");
	 }
	 right--;
	 if(top<=bottom){
	  for(int i=right;i>=left;i--){
	   sb.append(mat[bottom][i]+" ");
	  }
	  bottom--;
	 }
	 if(left<=right){
	  for(int i=bottom;i>=top;i--){
	   sb.append(mat[i][left]+" ");
	  }
	  left++;
	 }
	}
	return sb.toString();
  }
 }