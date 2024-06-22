import java.util.*;
interface operation{
    final float PI=3.14f;
     void cylinder_area(float r,float h);
     void cylinder_volume(float r,float h);
}

 class cylinder implements operation{
    public void cylinder_area(float r,float h)
    {
         float a=2*(r+h);
         System.out.println("area of cylinder="+a);
    }
    public void cylinder_volume(float r,float h)
    {
         float v=PI*r*r*h;
         System.out.println("volume of cylinder="+v);
    }
}
public class interfaceexample5{
    public static void main(String aaa[])
    {
         Scanner sc=new Scanner(System.in);
         System.out.println("enter radius");
         float r=sc.nextFloat();
         System.out.println("enter height");
         float h=sc.nextFloat();
         cylinder ob=new cylinder();
         ob.cylinder_area(r,h);
         ob.cylinder_volume(r,h);
    }
}

