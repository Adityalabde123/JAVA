//events using awt
import java.awt.*;
import java.awt.event.*;

class event extends Frame implements ActionListener {
    Label l1,l2,l3;
    TextField t1,t2,t3;
    Button b1,b2,b3,b4;
    event()
    {
        setVisible(true);
        setSize(500,300);
        setTitle("ADDITION PROGRAMME PAGE");
        setBackground(Color.pink);
        setLocation(100,300);
        setLayout(new GridLayout(5,2,10,35));

        l1=new Label("enter no1:");
        l2=new Label("enter no2:");
        l3=new Label("RESULT");

        t1=new TextField(10);
        t2=new TextField(10);
        t3=new TextField(10);
        
        b1=new Button("ADDITION");
        b2=new Button("SUBSTRACTION");
        b3=new Button("CLEAR");
        b4=new Button("EXIT");

        add(l1);
        add(t1);
        add(l2);
        add(t2);
        add(l3);
        add(t3);
        add(b1);add(b2);add(b3);add(b4);
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
    }
    public void actionPerformed(ActionEvent ae)
    {
        if(ae.getSource()==b1)
        {
            String s1=t1.getText();
            int a=Integer.parseInt(t1.getText());
            int b=Integer.parseInt(t2.getText());
            int c=a+b;
            t3.setText(""+c);
        }
        if(ae.getSource()==b2)
        {
            String s1=t1.getText();
            int a=Integer.parseInt(t1.getText());
            int b=Integer.parseInt(t2.getText());
            int c=a-b;
            t3.setText(""+c);
        }
        if(ae.getSource()==b3)
        {
            
            t1.setText("");
            t2.setText("");
            t3.setText("");
        }
        if(ae.getSource()==b4)
        {
            dispose();
        }
    }
    public static void main(String aaa[])
    { 
        event ob=new event();
    }
}
