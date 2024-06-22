//default  constructor..
public class parametrised_constructor2 {
    static class emp{
         int eno;
         String ename;
         float sal;

         emp(int eno,String ename,float sal)
         {  
            this.eno=eno;
            this.ename=ename;
            this.sal=sal;
            
        }
        void disp(){
        System.out.println("emp no="+eno);
        System.out.println("emp name="+ename);
        System.out.println("emp sal="+sal);
    }
}    public static void main(String aa[])
    {
         emp ob=new emp(101,"aditya",400000);
         ob.disp();
    }
}
