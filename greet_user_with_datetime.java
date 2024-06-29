//greet the user with date & time....
import java.util.*;
import java.awt.*;
import java.awt.event.*;
class greet_user_with_datetime extends Frame implements ActionListener{
  TextField t1;
  Label l1,l2,l3;
  Button b1;
  greet_user_with_datetime()
  {
    setVisible(true);
    setSize(500,500);
    setLayout(new GridLayout(5,1));
    l1=new Label("ENTER USER NAME:");
    l2=new Label("GREET MSG:");
    l3=new Label("DATE & TIME:");
    t1=new TextField(10);
    b1=new Button("OK");
    add(l1);add(t1);
    add(l2);add(l3);add(b1);
    b1.addActionListener(this);
  }
  public void actionPerformed(ActionEvent ae)
  {
     if(ae.getSource()==b1)
     {
         String s1=t1.getText();
         Date d1=new Date();
         int hr=d1.getHours();
         if(hr>=12&& hr<=17)
         l2.setText("Greet Msg=GOOD AFTERNOON:"+s1);
         else if(hr>17&&hr<=20)
         l2.setText("Greet Msg=GOOD EVINING:"+s1);
         else if(hr>20&& hr<=24)
         l2.setText("Greet Msg=GOOD NIGHT:"+s1);
         else
         l2.setText("Greet Msg=GOOD MORNING:"+s1);

         l3.setText("DATE & TIME:"+d1);
     }
  }
  public static void main(String arg[])
  {
     new greet_user_with_datetime();
  }
}

