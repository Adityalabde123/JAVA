public class calculate_method_overloading {
     static class area
     {
         void area(float r)
         { 
            float a=3.14f*r*r;
            System.out.print("area of circle="+a);
         }
     
         void area(float l,float b)
         { 
            float a=l*b;
            System.out.print("area of rectangle="+a);
         }
     
         void area(double b,double h)
         { 
            double a=0.5*b*h;
            System.out.print("area of traingle="+a);
         }
     }    
     public static void main(String aaa[])
     {
         area ob=new area();
         ob.area(12);
         ob.area(12.3f,5.4f);
         ob.area(12.10f,23.20f);
     }
}
