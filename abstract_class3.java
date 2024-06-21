abstract class shape{
    
    abstract void calc_area();
    abstract void calc_volume();
}
class sphere extends shape{
   float r;
   sphere(float r)
   {
     this.r=r;
   }
    void calc_area()
    {
        
        float a=4*3.14f*r*r;
        System.out.println("AREA OF SPHERE="+a);
    }
    void calc_volume()
    {
        
        float v=4/3*3.14f*r*r*r;
        System.out.println("VOLUME OF SPHERE="+v);
    }
}
class cone extends shape{
   float r,h;
   cone(float r,float h)
   {
     this.r=r;
     this.h=h;
   }
    void calc_area()
    {
        
        float a=4*3.14f*r*r*h;
        System.out.println("AREA OF CONE="+a);
    }
    void calc_volume()
    {
        
        float v=4/3*3.14f*r*r*r*h;
        System.out.println("VOLUME OF CONE="+v);
    }
}
public class abstract_class3 {
   public static void main(String aaa[])
   {
      sphere ob=new sphere(7.5f);
      ob.calc_area();
      ob.calc_volume();
      cone ob1=new cone(7.5f,3.5f);
      ob1.calc_area();
      ob1.calc_volume();
   } 
}
