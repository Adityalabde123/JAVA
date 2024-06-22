public class static_variable {
        static class demo{
             static int a;
             void show()
             {
                a++;
                System.out.println("value of a="+a);
             }
        }
        public static void main(String aaa[])
        {
             demo ob=new demo();
             ob.show();
             demo ob1=new demo();
             ob1.show();
             demo ob2=new demo();
             ob2.show();
        }
}
