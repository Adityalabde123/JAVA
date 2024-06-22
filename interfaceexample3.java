interface shape
{
    final float PI=3.14f; 
    void area_circle(float r);
    void area_sphere(float r);
    
    
}
class area implements shape{
     public void area_circle(float r)
     {
         float a=PI*r*r;
         System.out.println("area of circle="+a);
     }

     public void area_sphere(float r)
     {
         float a=4*PI*r*r;
         System.out.println("area of sphere="+a);
     }
}

public class interfaceexample3 {
    public static void main(String aaa[])
    {
         area ob=new area();
         ob.area_circle(5.7f);
         ob.area_sphere(5.7f);

    }
}