import java.util.*;
public class compare   
 { 
    static public void main(String aaa[]){

        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter first string:");
        String s1 = sc.next();
        System.out.println("Enter secondstring:");
        String s2 = sc.next();
        
       int k=s1.compareTo(s2);

       if(k==0)
       System.out.print("string are same");
       if (k>0)
       System.out.print("first string are greater");
       if(k<0)
       System.out.print("second string are greater");


}
}