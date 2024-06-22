public class print_shortcut_name {
    public static void main(String aaa[])
    {
         String s1="Aditya Rajendra Labde";
         String s2[]=s1.split(" ");
         for(int i=0;i<s2.length;i++)
         {
             System.out.println(s2[2]+" "+s2[0].charAt(0)+"."+s2[1].charAt(0)+".");
         }
    }
}
