//create an gui of compound intrest calculator..
import java.awt.*;  
class awt_slips extends Frame{
    Label l1,l2,l3,l4,l5,l6;
    TextField t1,t2,t3,t4,t5;
    Button b1,b2,b3;
    awt_slips()
    {
         setVisible(true);
         setSize(500,500);
         setLayout(null);
         l1=new Label("Compound Intrest Calculator");
         l2=new Label("Principle Amount");
         l3=new Label("Intrest rate(%)");
         l4=new Label("Time(yrs)");
         l5=new Label("total amount");
         l6=new Label("intrest amount");
         t1=new TextField(10);
         t2=new TextField(10);
         t3=new TextField(10);
         t4=new TextField(10);
         t5=new TextField(10);
         b1=new Button("Calculate");
         b2=new Button("Clear");
         b3=new Button("Close");
         l1.setBounds(150,50,200,50);
         add(l1);
         l2.setBounds(50,100,100,50);
         add(l2);
         l3.setBounds(50,150,100,50);
         add(l3);
         l4.setBounds(250,150,100,50);
         add(l4);
         l5.setBounds(50,200,100,50);
         add(l5);
         l6.setBounds(50,250,100,50);
         add(l6);
         
         t1.setBounds(150,100,200,25);
         add(t1);
         t2.setBounds(150,150,50,25);
         add(t2);
         t3.setBounds(350,150,100,25);
         add(t3);
         t4.setBounds(150,200,200,25);
         add(t4);
         t5.setBounds(150,250,200,25);
         add(t5);

         b1.setBounds(150,300,100,50);
         add(b1);
         b2.setBounds(260,300,100,50);
         add(b2);
         b3.setBounds(370,300,100,50);
         add(b3);
         
    }
    public static void main(String arg[])
    {
         awt_slips ob=new awt_slips();
    }
}
