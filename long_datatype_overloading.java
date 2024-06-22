//if we declare long and int type arguments,compiler only gets int type values
public class long_datatype_overloading {
     static class demo{
         void add(int a,long b)
         {
             long c=a+b;
             System.out.println("ADDITION="+c);
         }

     }   
     public static void main(String aaa[])
        {
             demo ob=new demo();
             ob.add(22,3333);
        }
    }
