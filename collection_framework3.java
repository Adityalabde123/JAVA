import java.util.*;
public class collection_framework3 {
    public static void main(String aaa[])
    {
        ArrayList a1=new ArrayList();
        a1.add(100);
        a1.add("PHP");
        a1.add("20.55");
        System.out.println("number of elements="+a1.size());//size operator is used to map the size of list
        System.out.println(a1);

        ArrayList a2=new ArrayList();
        a2.add(100);
        a2.addAll(a1);
        a2.add(200);
        System.out.println(a2);
        if(a2.containsAll(a1))
           System.out.println("a1 collection exists in the a2 collection ");
        else
           System.out.println("a1 collection is not exists in the a2 collection");
        }
}
