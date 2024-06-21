public class calculate_methodover {
      static class calculate{
             void volume(int s)
             {
                 int a=s*s*s;
                 System.out.println("volume of cube="+a);
             }
             void volume(float r,float h)
             {
                 float a=3.14f*r*r*h;
                 System.out.println("volume of cone="+a);
             }
             void volume(double r,double h)
             {
                 double a=3.14*r*r*h;
                 System.out.println("volume of cylinder="+a);
             }
           }    
        static public void main(String aaa[])
        { 
            calculate ob=new calculate();
            ob.volume(12);
            ob.volume(12.0f,12.10f);
            ob.volume(13.98f,30.98f);
        }
        
}
