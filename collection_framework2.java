import java.util.*;
public class collection_framework2 {
     public static void main(String aaa[])
     {
        ArrayList a1=new ArrayList();
        a1.add(100);
        a1.add("PHP");
        a1.add("20.55");
        a1.add("10");
        a1.add(44);
        System.out.println(a1);

        ArrayList a2=new ArrayList(a1);//we can add first arraylist to second arraylist..
        a2.add("cpp");
        a2.add("python");
        System.out.println(a2);
     }
}
