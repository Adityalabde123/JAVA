import java.awt.*;
import java.awt.event.*;;
class awt_event_slips5 extends Frame implements KeyListener{
    TextField t1,t2;

    awt_event_slips5()
    {
        setVisible(true);
        setSize(500,500);
    FlowLayout f=new FlowLayout();
    setLayout(f);

     t1=new TextField(10);
     t2=new TextField(10);
     add(t1);add(t2);
     t1.addKeyListener(this);
    }
    public void keyTyped(KeyEvent ke)
    {
        char ch=ke.getKeyChar();
        if(Character.isUpperCase(ch))
        t2.setText("uppercase");
        else if(Character.isLowerCase(ch))
        t2.setText("lowercase");
    }
    public void keyPressed(KeyEvent ke)
    {}
    public void keyReleased(KeyEvent ke)
    {}

public static void main(String aaa[])
{
    new awt_event_slips5();
}
}
