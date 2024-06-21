//accept employee information from user & display..
//assign global to local..
import java.util.*;
public class class_ob {
  static class emp{
    int eno;
    String ename;
    float sal;
    void accept(int eno1,String ename1,float sal1)
    {
       eno=eno1;
       ename=ename1;
       sal= sal1;
    }
    void disp()
    {
         System.out.println("emp no="+eno);
         System.out.println("emp name="+ename);
         System.out.println("emp sal="+sal);
    }

  } 
  static public void main(String aaa[])
  {
     emp ob=new emp();
     Scanner sc=new Scanner(System.in);
     System.out.println("enter employye no=");
     int eno=sc.nextInt();
     
    
     System.out.println("enter employye name=");
     String ename=sc.next();
     
     
     System.out.println("enter employye salary=");
     float sal=sc.nextFloat();
   
     ob.accept(eno,ename,sal);
     ob.disp();
  }
    
}
