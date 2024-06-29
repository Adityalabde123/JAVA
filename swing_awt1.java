//choose the file from files and display (MENUBAR)...
import java.io.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

 class  swing_awt1 extends Frame implements ActionListener 
 {
    MenuBar mb;
     Menu file,edit,format,help;
     MenuItem ne,open,save,exit,saveas,copy,paste;
     TextArea ta;
     swing_awt1()
     {
        setVisible(true);
        setSize(500,500);

        ta=new TextArea();
        add(ta);

        mb=new MenuBar();
        file=new Menu("FILE");
        edit=new Menu("EDIT");
        format=new Menu("FORMAT");
        help=new Menu("HELP");
        mb.add(file);
        mb.add(edit);
        mb.add(format);
        mb.add(help);
        ne=new MenuItem("NEW");
        open=new MenuItem("OPEN");
        save=new MenuItem("SAVE");
        exit=new MenuItem("EXIT");
        saveas=new MenuItem("SAVEAS");
        copy=new MenuItem("COPY");
        paste=new MenuItem("PASTE");
        file.add(ne);
        file.add(open);
        file.add(save);
        file.add(exit);
        file.add(saveas);
        edit.add(copy);
        edit.add(paste);
        setMenuBar(mb);
        exit.addActionListener(this);
        open.addActionListener(this); 

     }
     public void actionPerformed(ActionEvent ae)
     {
         if(ae.getSource()==open)
         {
             try{
                JFileChooser jf=new JFileChooser();
                jf.showOpenDialog(this);
                File f1=jf.getSelectedFile();
                String s1=f1.getName();
                FileReader f2=new FileReader(s1);
                BufferedReader br=new BufferedReader(f2);
                while ((s1=br.readLine())!=null) {
                    ta.append(s1+"\n");

                }
             }catch(Exception e)
             {}
         }
         if(ae.getSource()==exit)
         {
             dispose();
         }
     }
     public static void main(String arg[])
     {
         new swing_awt1();
     }
}
