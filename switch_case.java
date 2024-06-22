import java.util.*;
public class switch_case {
  static class demo{
    void volume(float r,float h)
    {
         float v=3.14f*r*r*h;
         System.out.println("volume of cylinder:" +v);
    }
    void factorail(int n)
    {
         int f=1;
         for(int i=1;i<=n;i++)
         {
             f=f*i;
         }
         System.out.println("FACTIORAIL:" +f);
    }
    void armstrong(int n)
    {
        int n1=n;
        int s=0;
        while(n>0)
        {
             int d=n%10;
             s=s+(d*d*d);
             n=n/10;
        }
        if(s==n1)
        System.out.println("number is Armstrong");
        else
        System.out.println("number is not armstrong");

    }

  } 
  public static void main(String aaa[])
  {
     demo ob=new demo();
     Scanner sc=new Scanner(System.in);
     int ch;
     do{
     System.out.print("1-volume of cylinder \n2-factorail \n3-armstrong");
     System.out.println("enter choice");
      ch=sc.nextInt();
     switch(ch)
     {
        case 1:System.out.println("enter radius:");
               float r=sc.nextFloat();
               System.out.println("enter height:");
               float h=sc.nextFloat();
               ob.volume(r,h);
               break;
        case 2:System.out.println("enter number:");
               int n=sc.nextInt();
               ob.factorail(n);
               break;
        case 3:System.out.println("enter number");
               n=sc.nextInt();
               ob.armstrong(n);
               break;
     }
    }while(ch<4);
  }
}
