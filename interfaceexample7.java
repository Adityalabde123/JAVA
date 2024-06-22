interface college{
    void acceptc(int cno,String cname);
}
interface teacher extends college{
    void acceptt(int tno,String tname);
    void dispct();
}
interface student{
    void accepts(int sno,String sname);
    void disps();
}
class university implements teacher,student{
    void acceptc(int cno,String cname)
    {
         this.cno=cno;
         this.cname=cname;
    }
    void acceptt(int tno,String tname)
    {
         this.tno=tno;
         this.tname=tname;
    }
    void dispct()
    {
         System.out.println("college no="+cno);
         System.out.println("college name="+cname);
         System.out.println("teacher  no="+tno);
         System.out.println("teacher name="+tname);
    }
    void accepts(int sno,String sname)
    {
         this.sno=sno;
         this.sname=sname;
    }
    void disps()
    {
         System.out.println("student no="+sno);
         System.out.println("student name="+sname);
    }
}
public class interfaceexample7 {
    public static void main(String aaa[])
    {
         university ob=new university();
         ob.acceptc(101,"cdj");
         ob.acceptt(10,"bothe");
         ob.dispct();
         ob.accepts(1,"aditya");
         ob.disps();
    }
}
