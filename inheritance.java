public class inheritance {
  
         static class A{
             A()
             {
                 System.out.println("I AM BASE CLASS ");
             }
         }
       static  class B extends A{
             B()
             {
                 System.out.println("I AM DERIVED CLASS ");
             }
         }
    
    public static void main(String aaa[])
    {
         B ob=new B();
    }
    
}