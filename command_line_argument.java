public class command_line_argument{
     public static void main(String arg[])
     {
         int eno=Integer.parseInt(arg[0]);
         String name=arg[1];
         float sal=Float.parseFloat(arg[2]);
         
         System.out.println("emp no="+eno);
         System.out.println("emp name="+name);
         System.out.println("emp sal="+sal);
     }
}


//for giving value to the runtime here are adjusable code..
/*class emp{
    public static void main(String arg[])
    {
        int eno=Integer.parseInt(arg[0]);
        String name=arg[1];
        float sal=Float.parseFloat(arg[2]);
        
        System.out.println("emp no="+eno);
        System.out.println("emp name="+name);
        System.out.println("emp sal="+sal);
    }
}
*/