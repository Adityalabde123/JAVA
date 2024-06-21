//split the string line by line...
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;  
class awt_event_slips extends Frame implements ActionListener{
    Label l1,l2;
    TextField t1;
    TextArea ta;
    Button b1;
    awt_event_slips()
    {
         setVisible(true);
         setSize(500,500);
         setLayout(new FlowLayout());
         l1=new Label("Enter string");
         l2=new Label("result string");
         
         t1=new TextField(10);
         ta=new TextArea(5,30);
         
         b1=new Button("ok");
         add(l1);add(t1);
         add(l2);add(ta);
         add(b1);
         b1.addActionListener(this);

         
    }
    public void actionPerformed(ActionEvent ae)
    {
         if(ae.getSource()==b1)
         {
            String s=t1.getText();
            String s1[]=s.split(" ");
            for(int i=0;i<s1.length;i++)
            {
                 ta.append(s1[i]+"\n");
            }

         }
    }
    public static void main(String arg[])
    {
         awt_event_slips ob=new awt_event_slips();
    }
}
