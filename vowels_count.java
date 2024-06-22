public class vowels_count {
    public static void main(String abc[])
    {
         String a="aditya";
         int c=0;
         for(int i=0;i<a.length();i++)
         {
           char ch=a.charAt(i);
         if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
           {
             c++;
           }
      
        }
        System.out.print("vowels count="+c);
    }
}
