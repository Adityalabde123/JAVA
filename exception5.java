//numberFormatException..
public class exception5 {
    public static void main(String aaa[])
    {
        try{
             String s1="10r";
             int n=Integer.parseInt(s1);
             System.out.println("value="+n);
        }
        catch(Exception e)
        {
             System.out.println("ERROR ="+e);
        }
    }
    
}
