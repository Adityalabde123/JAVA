//print even numbers..
public class command_line_argument3 {
    public static void main(String aaa[])
{
     System.out.println("even nos");
     for(int i=0;i<aaa.length;i++)
     {
         int n=Integer.parseInt(aaa[i]);
         if(n%2==0)
         {
             System.out.println(n+" ");
         }
     }
}
}
/*here are adjustable code
 //print even numbers..
 class even{
    public static void main(String aaa[])
{
     System.out.println("even nos");
     for(int i=0;i<aaa.length;i++)
     {
         int n=Integer.parseInt(aaa[i]);
         if(n%2==0)
         {
             System.out.println(n+" ");
         }
     }
}
}

 */