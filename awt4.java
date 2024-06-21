//getting checkboxes...
import java.awt.*;
 class awt4 extends Frame{
    Label l1;
    Checkbox c1,c2,c3,c4,c5;
    Button b1;
    awt4()
    {
         setVisible(true);
         setSize(500,500);

         setLayout(new GridLayout(7,1));
         c1=new Checkbox("JAVA");
         c2=new Checkbox("PHP");
         c3=new Checkbox("Python");
         c4=new Checkbox("DS");
         c5=new Checkbox("TCS");
         
         l1=new Label("SELECT SUBJECt:");
         b1=new Button("SUBMIT");
         add(l1);
         add(c1);
         add(c2);
         add(c3);
         add(c4);
         add(c5);
         add(b1);
         
        }
        public static void main(String aaa[])
        {
            awt4 ob= new awt4();
        }
}
