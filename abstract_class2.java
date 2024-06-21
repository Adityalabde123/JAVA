import java.util.*;
abstract class shape{
    Scanner sc=new Scanner(System.in);
    abstract void area();
}
class rectangle extends shape{
    void area()
    {
        System.out.println("enter length & breadth");
        int l=sc.nextInt();
        int b=sc.nextInt();
        int a=l*b;
        System.out.println("AREA OF RECTANGLE="+a);
    }
}
class triangle extends shape{
    void area()
    {
        System.out.println("enter height & breadth");
        int h=sc.nextInt();
        int b=sc.nextInt();
        float a=0.5f*h*b;
        System.out.println("AREA OF RECTANGLE="+a);
    }
}
public class abstract_class2 {
    public static void main(String aaa[])
    {
    rectangle ob=new rectangle();
    ob.area();   

    triangle ob1=new triangle();
    ob1.area();    
}

}