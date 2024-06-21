//checkboxgroup 
import java.awt.*;
class awt5 extends Frame {
    Label l1;
    Checkbox c1,c2;
    CheckboxGroup cg;
   awt5()
   {
         setVisible(true);
         setSize(500,500);
         setLayout(new FlowLayout());
         
         l1=new Label("SELECT GENDER:");
         cg=new CheckboxGroup();
         c1=new Checkbox("MALE",cg,true);
         c2=new Checkbox("FEMALE",cg,false);
         
        
         add(l1);
         add(c1);
         add(c2);
        
         
        }
        public static void main(String aaa[])
        {
            awt5 ob= new awt5();
        }

    }