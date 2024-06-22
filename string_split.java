public class string_split {
   
    public static void main(String aaa[])
    {
        String s1="java,python,c,cpp";
        String s2[]=s1.split(",");
        for(int i=0;i<s2.length;i++)     
        System.out.print(s2[i]);
    }
}
 
