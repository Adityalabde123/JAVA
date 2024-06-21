// ddefine a class Mynumber and declare function to check positive,zero,negetive,even,odd
public class constructor_assigments {
     static class Mynumber{
         private int n;
         Mynumber()
         {
             n=44;
         }
         Mynumber(int n)
         {
             this.n=n;
         }
         int isNegetive()
         {
             if(n<0)
             return 1;
             else
             return 0;
         }
         boolean isPositive()
         {
             if(n>0)
             return true;
             else
             return false;
         }
         boolean isZero()
         {
             if(n==0)
             return true;
             else
             return false;
         }
         boolean isOdd()
         {
             if(n%2==1)
             return true;
             else
             return false;
         }
         boolean isEven()
         {
             if(n%2==0)
             return true;
             else
             return false;
         }
     } 
     public static void main(String aaa[])
     {
         Mynumber ob=new Mynumber();
         if(ob.isNegetive()==1)
         System.out.println("number is negetive");
         if(ob.isPositive())
         System.out.println("number is positive");
         if(ob.isZero())
         System.out.println("number is Zero");
         if(ob.isOdd())
         System.out.println("number is odd");
         if(ob.isEven())
         System.out.println("number is even");
         
         System.out.println("Calling PC");
        
         Mynumber ob1=new Mynumber(5);
         if(ob1.isNegetive()==1)
         System.out.println("number is negetive");
         if(ob1.isPositive())
         System.out.println("number is positive");
         if(ob1.isZero())
         System.out.println("number is Zero");
         if(ob1.isOdd())
         System.out.println("number is odd");
         if(ob1.isEven())
         System.out.println("number is even");
         
         
     }
    
}