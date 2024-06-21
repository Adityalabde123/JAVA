public class constructor_assigments2 {
    static class emp{
        static int cnt=0;
        int id;
         String ename,dept;
         float sal;
         emp()
         {
           cnt++;
           id=1;
           ename="sai";
           dept="computer";
           sal=1000000;
         }
         emp(int id,String ename,String dept,float sal)
         {
           cnt++;
           this.id=id;
           this.ename=ename;
           this.dept=dept;
           this.sal=sal;
           
         }
         void disp()
         {
             System.out.println("\n object count=" +cnt);
             System.out.println("\n emp id=" +id);
             System.out.println("\n emp name=" +ename);
             System.out.println("\n department=" +dept);
             System.out.println("\n salary=" +sal);
         }
    }
    public static void main(String aaa[])
    {
         emp ob=new emp();
         ob.disp();

         emp ob1=new emp(103,"aditya","It",500000);
         ob1.disp();
    }
}
