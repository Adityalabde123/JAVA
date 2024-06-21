//accept username and greet..
import java.awt.*;
import java.awt.event.*;
class event4 extends Frame implements ActionListener{
  Label l1,l2;
  TextField t1,t2;
  Button b1;
  event4() 
  {
     setVisible(true);
     setSize(400,300);
     setLayout(new GridLayout(3,2,20,20));
     l1=new Label("Enter username");
     l2=new Label("Messege");
     t1=new TextField(10);
     t2=new TextField(10);
     b1=new Button("GREET");
     add(l1);
     add(t1);
     add(l2);
     add(t2);
     add(b1);
     b1.addActionListener(this);

  }   
  public void actionPerformed(ActionEvent ae)
  {
     if(ae.getSource()==b1)
     {
        String u=t1.getText();
        t2.setText("HELLO, "+u+ "!!!nice to meet you");
     }

  }
     public static void main(String arg[])
     {
        event4 ob=new event4(); 
     }
}
