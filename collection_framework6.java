import java.util.*;
public class collection_framework6 {
    public static void main(String aaa[])
    {
         HashMap hm=new HashMap();
         hm.put("rno","101");
         hm.put("name","om");
         hm.put("java","99");
         hm.put("dbms","88");
         hm.put("dbms","77");
         //hm.clear();
         System.out.println(hm);
         System.out.println("value="+hm.get("name"));
         System.out.println("number of elements="+hm.size());
         if(hm.containsKey("java"))
         System.out.println("key found");
         else
         System.out.println("key not found");

         if(hm.containsValue("om"))
          System.out.println("value found");
        else 
           System.out.println("values not found");

    }
}
