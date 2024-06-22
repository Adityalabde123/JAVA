public class this_keyword {
   static class demo{
     int a=10;
     void show()
     {
        int a=55;
        System.out.print("value of golbal a="+this.a);
        System.out.print("value of local a="+a);
     }

   } 
   public static void main(String aaa[])
   {
     demo ob=new demo();
     ob.show();
   }  
}
