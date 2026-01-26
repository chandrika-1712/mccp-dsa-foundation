import java.util.*;
class Spiral{
 public static void main(String[] args){
  Scanner sc=new Scanner(System.in);
  int n=sc.nextInt();
  int arr[][]=new int[n][n];
  for(int i=0;i<n;i++){
   for(int j=0;j<n;j++){
    arr[i][j]=sc.nextInt();
   }
  }
  System.out.println(spiral(arr)
 }
 static String spriral(int[][] mat){
   int top=0;
   int bottom=mat.length;
   int left=0;
   int right=mat[0].length;
   StringBuilder sb=new StringBuilder();
   while(top<=bottom&&left<=right){
     for(int i=top;i<=right;i++){
	  sb.append(mat[top][i]+" ");
	 }
	 top--;
	 for(int i=top;i<=bottom;i++){
	  sb.append(mat[i][right]+" ");
	 }
	 right--;
	 if(top<=buttom){
	  for(int i=right;i>=left;i--){
	   sb.append(mat[bottom][i]+" ");
	  }
	  bottom--;
	 }
	 if(left<=right){
	  for(int i=buttom;i>=top;i--){
	   sb.append(mat[i][left]+" ");
	  }
	  left++;
	 }
	}
	return sb.toString();
  }
 }