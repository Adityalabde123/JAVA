public class multiple_catch_block {
    public static void main(String aaa[])
    {
         try{
             int a[]=new int[5];
             a[7]=44;
             System.out.println("ARRAY CREATE");
         }
         catch(ArithmeticException e)
         {
            System.out.println("ERROR1="+e);
         }
         catch(ArrayIndexOutOfBoundsException e1)
         {
            System.out.println("ERROR2="+e1);
         }
         catch(StringIndexOutOfBoundsException e2)
         {
            System.out.println("ERROR3="+e2);
         }
         catch(Exception e3) 
         {
            System.out.println("ERROR4="+ e3);
         }
    }
}
