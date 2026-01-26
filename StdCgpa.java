import java.util.*;
class Student{
  int rollno;
  String sname;
  String branch;
  int total;
  double cgpa;
  //if formal parameters and class members are same to avoid ambiguity use this keyword
  Student(int rno,String name,String br,int tot,double per){
      rollno=rno;
      sname=name;
      branch=br;
      total=tot;
      cgpa=per;
  }
  public String toString() {
        return "Roll No: " + rollno + ", Name: " + sname + ", Branch: " + branch + ", Total: " + total + ", CGPA: " + cgpa + "\n";
    }
}
class SortByCgpa implements Comparator<Student>
{
  public int compare(Student s1,Student s2){
    if(s1.cgpa==s2.cgpa){
      return 0;
    }
    else if(s1.cgpa>s2.cgpa){
      return 1;
    }
    else{
      return -1;
    }
  }
}
public class StdCgpa{
  public static void main(String[] args){
    ArrayList<Student> al=new ArrayList<>();
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    for(int i=0;i<n;i++){
      int rollno=sc.nextInt();
      String name=sc.next();
      String branch=sc.next();
      int tot=sc.nextInt();
      double per=sc.nextDouble();
      Student s1=new Student(rollno,name,branch,tot,per);
      al.add(s1);
    }
    for(Student s1:al){
      System.out.print(s1);
    }
    Collections.sort(al,new SortByCgpa());
    for(Student s1:al){
      System.out.print(s1);
    }
  }
}