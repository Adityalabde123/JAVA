// In this  example base & derived class method name are same then (override) so, we can call base class method using super
class A{
     void add(int a,int b)
     {
         int c=a+b;
         System.out.println("ADDITION1="+c);
     }
}
class B extends A{
    void add(int a,int b)
    {
        super.add(a,b);
        int c=a+b;
        System.out.println("ADDITION2="+c);
     }
}
public class super2 {
    public static void main(String aaa[])
    {
         B ob=new B();
         ob.add(11,22);
    }
}
