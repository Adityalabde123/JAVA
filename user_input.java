import java.util.*;
public class user_input {
  public static void main(String[] abc)
  {
     Scanner sc=new Scanner(System.in);
     System.out.println("enter radius");
     float a=sc.nextFloat();
     float r=3.14f*a*a;
     System.out.println("area of circle="+r);
  }
}
