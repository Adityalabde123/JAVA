      public class multilevel_inheritance4 {
        static class A{
            int x;
            A()
            {
                
                 x=20;
                 System.out.println("I AM BASE CLASS");
             
        }
    }
        static class B extends A{
            int y;
             B()
             {
                y=30;
                 System.out.println("I AM  Intermediate CLASS");
             }
        }
        static class C extends B{
            int z;
             C()
             {
                  z=20;
                 System.out.println("I AM DERIVED CLASS");
                 System.out.println("ADDDITION="+(x+y+z));
             }
        }
    
        public static void main(String aaa[])
        {
            C ob = new C();
        }
    
}
