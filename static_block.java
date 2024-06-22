public class static_block {
     static class demo
     {
         static int a;
         void show()
         {
             System.out.println("I AM SHOW");
         }
         static{
             a=22;
             System.out.println("I AM STATIC BLOCK");
             System.out.println("value of a="+a);
         }
     }   
     public static void main(String aaa[])
     {
        System.out.println("I AM MAIN");
        demo ob=new demo();
        ob.show();
     }
}