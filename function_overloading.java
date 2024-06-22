public class function_overloading {
    static class addition{
    void add(int a,int b)
    {
         int c=a+b;
        System.out.println("ADDITION1="+c);
    }
    void add(int a,int b,int c)   //by increasing argument list...
    {
         int d=a+b+c;
        System.out.println("ADDITION2="+d);
    }
    void add(int a,float b)     //by changing datatype
     {
         float c=a+b;
        System.out.println("ADDITION3="+c);
    }
    }
   static public void main(String aaa[])
   {
       addition ob=new addition();
       ob.add(11,22);
       ob.add(11,22,33);
       ob.add(11,22.33f);
       ob.add(111,333);
   }

}
