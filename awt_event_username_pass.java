//accept the username & password display it's valid or not...
import java.awt.*;
import java.awt.event.*;
class InvalidUserPassException extends Exception{
    public String toString()
    {
         return "INVALID USER PASS NOT SAME";
    }
}
public class awt_event_username_pass extends Frame implements ActionListener{
    static int cnt=0;
    Label l1,l2,l3;
    TextField t1,t2,t3;
    Button b1,b2;
    awt_event_username_pass()
    {
         setVisible(true);
         setSize(500,500);
         setLayout(new FlowLayout());

         l1=new Label("Username:");
         l2=new Label("Password:");
         l3=new Label("RESULT:");
         t1=new TextField(20);
         t2=new TextField(20);
         t2.setEchoChar('*');
         t3=new TextField(20);
         t3.setEditable(false);
         b1=new Button("LOGIN");
         b2=new Button("CLEAR");
         add(l1);add(t1);
         add(l2);add(t2);
         add(l3);add(t3);
         add(b1);add(b2);
         b1.addActionListener(this);
         b2.addActionListener(this);
    }
    public void actionPerformed(ActionEvent ae)
    {
         if(ae.getSource()==b1)
         {
             try{
                 String s1=t1.getText();
                 String s2=t2.getText();
                if(s1.equals(s2))
                {
                     t3.setText("LOGIN SUCCESSFULLY");

                }
                else{
                     cnt++;
                     if(cnt==4)
                     b1.setVisible(false);
                     throw new InvalidUserPassException();
                }
             }catch(Exception e)
             {
                 t3.setText("ERROR="+e);
             }
         }
         if(ae.getSource()==b2){
             t1.setText("");
             t2.setText("");
         }
    }
    public static void main(String arg[])
    {
         new awt_event_username_pass();
    }
}
