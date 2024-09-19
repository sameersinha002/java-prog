

import java.awt.*;

public class menusample extends Frame {
    public static void main(String[] args) {
        menusample frm=new menusample();
        MenuBar mb=new MenuBar();
        frm.setSize(500,300);
        frm.setTitle("Menu Bar");
        frm.setLayout(new FlowLayout());
        frm.setVisible(true);
        Menu file=new Menu("FIle");
        Menu help=new Menu("Help");
        Menu about= new Menu("About");
        file.add("New File");
        file.add("Open File");
        file.add("Save file");
        mb.add(file);
        mb.add(help);
        mb.add(about);
        frm.setMenuBar(mb);

        
    }
}