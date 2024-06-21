//default  constructor..
public class constructor1 {
    static class add{
         int a,b,c;
         add()
         {  
            a=11;
            b=22;
            c=a+b;
             System.out.println("ADDITION="+c);
         }
    }
    public static void main(String aa[])
    {
         add ob=new add();
    }
}
