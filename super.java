class A{
    int x=55;   //local class member..
}
class B extends A{
    int x=66;   //global variable
    void disp()
    {
        int x=77;
        System.out.println("value 1="+x);
        System.out.println("value 2="+this.x);
        System.out.println("value 3="+super.x);
    }
}
  public class super{
    public static void main(String aaa[])
    {
         B ob=new B();
         ob.disp();
    }
}

