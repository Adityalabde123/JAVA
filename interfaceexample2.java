interface I2
{
     void add(int a,int b);
     void square(int n);

}
interface I3 extends I2{
    void sub(int a,int b);
}
interface I4
{

     void cube(int n);

}
class demo1 implements I3,I4
{
    public void add(int a,int b)
    {
        int c=a+b;
        System.out.println("addition="+c);
    }
    public void sub(int a,int b)
    {
        int c=a-b;
        System.out.println("substraction="+c);
    }
    
    public void square(int n)
    {
        int c=n*n;
        System.out.println("sqaure="+c);
    }
    public void cube(int n)
    {
        int c=n*n*n;
        System.out.println("cube="+c);
    }

}
public class interfaceexample2{
    static public void main(String aaa[])
    {
         demo1 ob=new demo1();
         ob.add(11,22);
         ob.sub(11,22);
         ob.square(3);
         ob.cube(2);
    }
}

