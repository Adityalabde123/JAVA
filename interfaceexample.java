interface I1
{
     void add(int a,int b);
     void square(int n);

}
interface I2
{

     void cube(int n);

}
class demo implements I1,I2
{
    public void add(int a,int b)
    {
        int c=a+b;
        System.out.println("addition="+c);
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
public class interfaceexample{
    static public void main(String aaa[])
    {
         demo ob=new demo();
         ob.add(11,22);
         ob.square(3);
         ob.cube(2);
    }
}
