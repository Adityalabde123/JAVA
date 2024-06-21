public class exception_getmsg2 {
    //get messege method.

    public static void main(String aaa[])
    {
        try{
           
           String s1="10r";
           int n=Integer.parseInt(s1);
           System.out.println("Value="+n);

           int a=5;
           int b=a*a;
           System.out.println("SQUARE="+b);
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
        try{
            int a=5;
            int b=a*a;
            System.out.println("SQUARE="+b);
  
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
   
}