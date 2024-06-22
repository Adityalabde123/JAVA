//age less than zero..

import java.util.Scanner;
class NegetiveException extends Exception{
    public String toString()
    {
        return "negetive ARRAY ERROR";
    }
}
public class userdefined_exception1 {
    public  static  void main(String aaa[])
    { 
         try{
             Scanner sc=new Scanner(System.in);
             System.out.println("enter age");
             int age=sc.nextInt();
             if(age<=0)
             {
                throw new NegetiveException();
             }
            }
             catch(Exception e)
             {
                System.out.println(e);
             }
         
    }   
}
