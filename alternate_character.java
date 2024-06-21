import java.util.*;
public class alternate_character {
    static public void main(String aaa[]){

        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter first string:");
        String s1 = sc.next();
        for(int i=0;i<s1.length();i+=2)
        {
           System.out.println(s1.charAt(i));
        }
}
}