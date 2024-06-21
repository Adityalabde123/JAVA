//calculate area of circle,rectangle,squre...
public class calculate_area {
  static class area{
    
    float a;
    void circle(float r)
    {
         a=3.14f*r*r;
         System.out.println("area of circle="+a);
    }
    void rectangle(float l,float b)
    {
        a=l*b;
        System.out.println("area of rectangle="+a);
    }
    void squre(float s)
    {
         a=s*s;
         System.out.println("area of square="+a);
    }
}
  public static void main(String aaa[])
  {
     area ob=new area();
     
     ob.circle(4.5f);
     ob.rectangle(5.5f,6.1f);
     ob.squre(5.8f);

  }
}
