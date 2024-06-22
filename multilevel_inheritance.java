public class multilevel_inheritance {
    static class A{
         A()
         {
             System.out.println("I AM BASE CLASS");
         }
    }
    static class B extends A{
         B()
         {
             System.out.println("I AM  Intermediate CLASS");
         }
    }
    static class C extends B{
         C()
         {
             System.out.println("I AM DERIVED CLASS");
         }
    }
    public static void main(String aaa[])
    {
         C ob=new C();
    }
}
