//default  constructor..
public class parametrised_constructor {
    static class add{
         int a,b,c;
         add(int a,int b)
         {  
           this.a=a;
           this.b=b;
           this.c=c;
           c=a+b;
          System.out.println("ADDITION="+c);
         }
    }
    public static void main(String aa[])
    {
         add ob=new add(10,20);
    }
}
