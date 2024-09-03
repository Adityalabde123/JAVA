//hashmap()....
import java.util.*;
public class collection_framework5 {
    public static void main(String aaa[])
    {
         HashMap hm=new HashMap();
         hm.put("rno","101");
         hm.put("name","om");
         hm.put("java","99");
         hm.put("dbms","88");
         hm.put("dbms","77");//here we accept same key,but output shows recent values..
         
         System.out.println(hm);
    }
}
