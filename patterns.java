//1
//01
//010....
public class patterns {
    public static void main(String aaa[])
    {
         int k=1;
         for(int i=1;i<=4;i++)
         {
             for(int j=1;j<=i;j++)
             {
                System.out.print(k++%2);
             }
           System.out.println("");
         }
         
    }    
}
