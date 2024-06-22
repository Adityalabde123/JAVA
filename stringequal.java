import java.util.*;
public class stringequal
 { 
    static public void main(string aaa[]){

 
    Scanner sc=new Scanner(System.in);
    System.out.println("enter string");
    String s1=sc.next();
    System.out.println("enter string");
    String s2=sc.next();
    
    if(s1.equals(s2))
    {
    System.out.print("string are same");
    }else{
    System.out.print("string areb  not same");
}
sc.close();
}
}