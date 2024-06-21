import java.util.*;
public class array_of_object5 {
    static class cricket{
        String sname;
        int innings,notout,totalruns;
        float batavg;
    
    void accept()
    {
         Scanner sc=new Scanner(System.in);
         System.out.println("enter name");
         sname=sc.next();
         
         System.out.println("enter no of innings");
         innings=sc.nextInt();
      
         System.out.println("enter no of notout");
         notout=sc.nextInt();
        
         System.out.println("enter total runs");
         totalruns=sc.nextInt();
        
         batavg=avg(innings, totalruns, notout);
    }
    static float avg(int innings,int totalruns,int notout)
    {
        if (innings - notout > 0) {
            return (float) totalruns / (innings - notout);
        } else {
            return 0.0f;
        }

    }
    static void sort(cricket[] ob,int n)
    {
         int i,pass;
         for(pass=1;pass<n;pass++)
         {
             for(i=0;i<n-pass;i++)
             {
                 if(ob[i].batavg<ob[i+1].batavg)
                 {
                     cricket t=ob[i];
                     ob[i]=ob[i+1];
                     ob[i+1]=t;
                 }
             }
         }
         for(i=0;i<n;i++)
         {
             System.out.println(ob[i].sname+"\t"+ob[i].innings+"\t"+ob[i].innings+"\t"+ob[i].notout+"\t"+ob[i].totalruns+"\t"+ob[i].batavg);

         }
    }
}
    
  public static void main(String aaaa[])
  {
     Scanner sc=new Scanner(System.in);
     System.out.println("enter limit");
     int n=sc.nextInt();
     cricket ob[]=new cricket[n];
     for(int i=0;i<n;i++)
     {
         ob[i]=new cricket();
         ob[i].accept();
        }
        
        sort(ob, n);
  }
}
      

