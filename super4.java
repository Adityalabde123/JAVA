import java.util.*;

class cylinder{
    float r,h;
   Scanner sc=new Scanner(System.in);
   void area()
   {
    System.out.println("enter radius & height");
    r=sc.nextFloat();
    h=sc.nextFloat();
    double a=2*3.16*r*h*r*r;
    System.out.println("Area of circle="+a);
   }
}
class circle extends cylinder{
    float r; 
    void area()
     {
          super.area();
            System.out.println("enter radius");
            r=sc.nextFloat();
            float a=3.14f*r*r;
            System.out.println("area of circle="+a);
     }
}
public class super4 {
    public static void main(String aaa[])
    {
         circle ob=new circle();
         ob.area();
    }
}
