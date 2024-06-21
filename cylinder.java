import java.util.*;
interface operation{
    final float PI=3.14;
     void cylinder_area(float r,float h);
     void cylinder_volume(float r,float h);
}

public class cylinder{
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


