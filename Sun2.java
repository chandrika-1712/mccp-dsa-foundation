//Count of no of buildings facing sunlight using stack
import java.util.*;
class Sun2{
   public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    System.out.println("Enter elements");
    int arr[]=new int[n];
    for(int i=0;i<n;i++){
      arr[i]=sc.nextInt();
    }
    Stack<Integer> st=new Stack<>();
    st.push(arr[0]);
    for(int i=1;i<n;i++){
      if(arr[i]>st.peek())
        st.push(arr[i]);
    }
    System.out.println("count is "+st.size());
  }
}