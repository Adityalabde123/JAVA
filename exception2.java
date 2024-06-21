//NegetiveArraySizeException
public class exception2 {
    public static void main(String aaa[])
    {
        try{
             int a[]=new int[-5];
             System.out.println("ARRAY CREATE SUCCCESFULLY");
             a[0]=10;
             a[1]=20;
             a[2]=30;
             System.out.println("VALUE INSERT SUCCESSFULLY");
             System.out.println("VALUE ="+a[1]);

        }
        catch(Exception e)
        {
             System.out.println("ERROR ="+e);
        }
    }
}
