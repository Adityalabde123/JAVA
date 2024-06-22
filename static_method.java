public class static_method {
    static class demo
    {
         static void add(int a,int b)
         {
             int c=a+b;
             System.out.print("addition of a="+c);
         }
         
    }
    public static void main(String aaa[])
    {
        
         demo ob=new demo();
         ob.add(11,22);
    
         demo.add(11,53);
    }
}
