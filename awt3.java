//taking label,textfeild,button
import java.awt.*;
class awt3 extends Frame {
    Label l1,l2,l3;
    TextField t1,t2,t3;
    Button b1,b2,b3,b4;
    awt3()
    {
        setVisible(true);
        setSize(500,300);
        setTitle("ADDITION PROGRAMME PAGE");
        setBackground(Color.pink);
        setLocation(100,300);
        setLayout(new GridLayout(5,2));

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
    }
    public static void main(String aaa[])
    { 
        awt3 ob=new awt3();
    }
}
