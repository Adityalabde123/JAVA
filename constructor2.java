//default  constructor..
public class constructor2 {
    static class emp{
         int eno;
         String ename;
         float sal;

         emp()
         {  
            eno=101;
            ename="aditya";
            sal=400000;
             System.out.println("emp no="+eno);
             System.out.println("emp name="+ename);
             System.out.println("emp sal="+sal);
         }
    }
    public static void main(String aa[])
    {
         emp ob=new emp();
    }
}
