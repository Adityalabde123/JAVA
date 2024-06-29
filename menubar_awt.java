//creating an notepad with simple awt...
import java.awt.*;
class menubar_awt extends Frame{
     MenuBar mb;
     Menu file,edit,format,help;
     MenuItem ne,open,save,exit,saveas,copy,paste;
     TextArea ta;
     menubar_awt(){
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
         

     }
   public static void main(String arg[])
   {
      new menubar_awt();
   }

}