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
class Square extends rectangle {
    void area_s() {
        System.out.println("Enter the side of the square:");
        int side = sc.nextInt();
        int a = side * side;
        System.out.println("AREA OF SQUARE = " + a);
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
public class abstract_class7 {
    public static void main(String aaa[])
    {
    rectangle ob=new rectangle();
    ob.area();   
    ob.area_s();   
    

    triangle ob2=new triangle();
    ob2.area();    
}

}