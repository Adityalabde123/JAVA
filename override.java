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
         int c=a+b;
         System.out.println("ADDITION2="+c);
    }
}

public class override {
    
    public static void main(String aaa[])
    {
         B ob=new B();
         ob.add(11,22);
         ob.add(111,222);
         ob.add(110,220);
    }
}
//in override base class are hide and call only derived class..
