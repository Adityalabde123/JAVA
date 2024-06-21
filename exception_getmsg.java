//get messege method.
public class exception_getmsg {
     public static void main(String aaa[])
     {
         try{
            int a=4/0;
            String s1="10r";
            int n=Integer.parseInt(s1);
            System.out.println("Value="+n);
         }
         catch(Exception e)
         {
             System.out.println(e.getMessage());
         }
     }
    
}
