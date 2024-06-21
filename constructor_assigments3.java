//accept full name from user and dislay in formal format..

public class constructor_assigments3 {
   public static void main(String aaa[])
   {
    String s1="aditya rajendra labde";
     String s2[]=s1.split(" ");
     for(int i=0;i<s2.length;i++)
     {
       System.out.println(s2[2]+" "+s2[0]+" "+s2[1]);
     }
   String m=s2[0];
   for(int i=0;i<m.length();i++)
   {
       if(i==0)
       System.out.println(Character.toUpperCase(m.charAt(i)));
       else
       System.out.println(m.charAt(i));
   }
   for(int i=0;i<s2.length;i++)
   {
      
      System.out.println(s2[2]+" "+s2[0]+" "+s2[1]);
   }
}
}