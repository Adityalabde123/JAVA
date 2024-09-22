import java.awt.*;
import java.awt.event.*;
class awt_event_slips6 extends Frame implements MouseListener
{
   TextField t1,t2;
  
   awt_event_slips6()
   {
     setVisible(true);
     setSize(500,500);
FlowLayout f=new FlowLayout();
     setLayout(f);
     
     t1=new TextField(10);
     t2=new TextField(10);
  add(t1); add(t2);
addMouseListener(this);   
}
    public void mouseClicked(MouseEvent me)
    {
       t2.setText("Mouse Click");
    }
    public void mousePressed(MouseEvent me){}
    public void mouseReleased(MouseEvent me){}
    public void mouseEntered(MouseEvent me)
   {
     t2.setText("Mouse Enter t1");
   }
    public void mouseExited(MouseEvent me){}

     public static void main(String arg[])
   {
      new awt_event_slips6();
   }
  }