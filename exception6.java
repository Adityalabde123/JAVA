//nullpointerexception..
public class exception6 {
    public static void main(String aaa[])
    {
        try{
             String s1=null;
             System.out.println("length="+s1.length());
        }
        catch(Exception e)
        {
             System.out.println("ERROR ="+e);
        }
    }
    
}
