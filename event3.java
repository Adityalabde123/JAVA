import java.awt.*;
import java.awt.event.*;

class event3 extends Frame implements ActionListener {
Button b1,b2;
 event3()
 {
     setVisible(true);
     setSize(400,300);
     setLayout(new FlowLayout());
     b1=new Button("red");
     b2=new Button("blue");
     add(b1);
     add(b2);
     b1.addActionListener(this);
     b2.addActionListener(this);
 }    
 public void actionPerformed(ActionEvent ae)
 {
     if(ae.getSource()==b1)
     {
        setBackground(Color.red);
     }
     if(ae.getSource()==b2)
     {
        setBackground(Color.blue);
     }
 }
 public static void main(String arg[])
 {
     event3 ob=new event3();
 }
}
