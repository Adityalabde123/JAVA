import java.awt.*;
import java.awt.event.*;
 class mouse_event extends Frame implements MouseListener{
    TextField t1;
    mouse_event()
    {
         setVisible(true);
         setSize(500,600);
         setLayout(new FlowLayout());
         t1=new TextField(50);
         add(t1);
         addMouseListener(this);
    }
    public void mouseClicked(MouseEvent me)
    {
         int x=me.getX();
         int y=me.getY();
         t1.setText("x pos="+x+"\t y pos="+y);
    }
    public void mouseExited(MouseEvent me){}
    public void mouseEntered(MouseEvent me){}
    public void mousePressed(MouseEvent me){}
    public void mouseReleased(MouseEvent me){}
    
    public static void main(String arg[])
    {
         new mouse_event();
    }
}
