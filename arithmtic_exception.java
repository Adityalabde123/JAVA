public class arithmtic_exception {
    public static void main(String aaa[])
    {
        try{
             int a=10;
             int b=a/0;
             System.out.println("DIVISION="+b);
        }
        catch(Exception e)
        {
             System.out.println("ERROR DOES NOT DIVIDE BY 0="+e);
        }
    }
}
