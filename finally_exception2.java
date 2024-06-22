
    public class finally_exception2 {
        public static void main(String aaa[])
        {
         int b=0,c=0,d=0,e1=0;
        
    try{
        int a=10;
          b=a+5;
          c=a-5;
          d=a/0;
          e1=a*5;
     
       }         
         finally{
                    System.out.println("ADDITION="+b);
                    System.out.println("SUBSTRACTION="+c);
                    System.out.println("DIv="+d);
                    System.out.println("MULTI="+e1);
                }
            }
           
        }
       
