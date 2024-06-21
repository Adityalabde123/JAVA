//arithmatic exception..
public class exception1 {
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
