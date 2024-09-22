import java.awt.*;
import java.awt.event.*;
class awt_event_slips4 extends Frame implements KeyListener{
    TextField t1,t2;
    awt_event_slips4()
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
    {}
    
    public void keyPressed(KeyEvent ke)
    {}
    public void keyReleased(KeyEvent ke)
    {
        if(t1.getText().length()==0)
        t2.setText("");
        else
        t2.setText("typing");

    }
    public static void main(String[] args) {
        new awt_event_slips4();
    }
}
