//printing table in list accept from user..
import java.awt.*;
import java.awt.event.*;
 class event5 extends Frame implements ActionListener {
     Label l1,l2;
     TextField t1;
     List lst;
     Button b1,b2;
     event5()
     {
         setVisible(true);
         setSize(500,500);
         setLayout(new FlowLayout());
         l1=new Label("Enter number");
         l2=new Label("Table:");
         t1=new TextField(10);
         lst=new List(10);
         b1=new Button("OK");
         b2=new Button("CLEAR");
         add(l1);
         add(t1);
         add(l2);
         add(lst);
         add(b1);
         add(b2);
         b1.addActionListener(this);
         b2.addActionListener(this);
     } 
    
 public void actionPerformed(ActionEvent ae)
 {
     if(ae.getSource()==b1)
     {
        int n=Integer.parseInt(t1.getText());
        for(int i=1;i<=10;i++)
        {
        lst.add(""+n*i);
         }
    }
     if (ae.getSource()==b2)
      {
        lst.clear();
     }
 }
  public static void main(String arg[])
  {
      event5 ob=new event5();
  }
}
