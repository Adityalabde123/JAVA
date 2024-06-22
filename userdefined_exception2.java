//voting eligability or not...
import java.util.*;

    class voting extends Exception{
        public String toString()
        {
            return "candidate not eligible";
        }
    }
    public class userdefined_exception2 {
        public  static  void main(String aaa[])
        { 
             try{
                 Scanner sc=new Scanner(System.in);
                 System.out.println("enter age");
                 int age=sc.nextInt();
                 if(age<18)
                 {
                    throw new voting();
                 }
                 System.out.println("you are eligible for voting="+age);
                }
                 catch(voting e)
                 {
                    System.out.println(e);
                 }
                 catch(Exception e1)
                 {
                    System.out.println("SYSTEM ERROR="+e1);
                 }
             
        }   
    }
        



