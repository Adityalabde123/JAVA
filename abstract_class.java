abstract  class A{
     A()
     {
         System.out.println("I AM ABSTRACT A");
     }
     abstract void add(int a,int b);
     void square(int n)
     {
         int s=n*n;
         System.out.println("SQUARE OF NUMBER="+s);
     }
}
class B extends A
{
     void add(int a,int b)
     {
         int c=a+b;
         System.out.println("ADDITION="+c);
     }
}
public class abstract_class {
    public static void main(String aaa[])
    { 
          B ob=new B();
          ob.add(11,22);
          ob.square(5);
    }
}
