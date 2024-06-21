//StringIndexOutOfBound..
public class exception4 {
    public static void main(String aaa[])
    {
        try{
             String s1="mauli";
             System.out.println("string="+s1);
             System.out.println("characters="+s1.charAt(7));
        }
        catch(Exception e)
        {
             System.out.println("ERROR ="+e);
        }
    }
}
