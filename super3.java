//parameterised constructor..
class A{
     A(int x,int y)
     {
         int c=x+y;
         System.out.println("ADDITION A="+c);
     }
}
class B extends A{
    B(int x,int y)
    {
        super(x,y);
        int c=x+y;
        System.out.println("ADDITION B="+c);
}
}
public class super3 {
    public static void main(String aaa[])
    {
         B ob=new B(11,33);

    }
}
