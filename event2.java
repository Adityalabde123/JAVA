//square and cube of number using awt and event..

import java.awt.*;
import java.awt.event.*;



class event2 extends Frame implements ActionListener{
Label l1,l2;
TextField t1,t2;
Button b1,b2;
event2()
{
     setVisible(true);
     setSize(400,300);
     setLayout(new GridLayout(3,2,20,50));
     l1=new Label("Enter no");
     l2=new Label("result");
     t1=new TextField(10);
     t2=new TextField(10);
     b1=new Button("SQUARE");
     b2=new Button("CUBE");
     add(l1);
     add(t1);
     add(l2);
     add(t2);
     add(b1);
     add(b2);
     b1.addActionListener(this);
     b2.addActionListener(this);

}
     public void actionPerformed(ActionEvent ae)
     {
        if(ae.getSource()==b1)
        {
        int a=Integer.parseInt(t1.getText());
        int b=a*a;
        t2.setText(""+b);
     }
        if(ae.getSource()==b2)
        {




            
        int a=Integer.parseInt(t2.getText());
        int b=a*a*a;
        t2.setText(""+b);
     }
}

public static void main(String aaa[])
{
     event2 ob=new event2();
}
}