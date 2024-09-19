import java.awt.BorderLayout;
import javax.swing.*;
public class swing1 extends  JFrame{
    public static void main(String[] args) {
        swing1 frm=new swing1();  
        frm.setDefaultCloseOperation(EXIT_ON_CLOSE);
         frm.setSize(500,500);
         frm.setTitle("Swing Frame");
         frm.setLayout(new BorderLayout());
         JLabel lbl=new JLabel("Enter Your Name");
         JTextField tf=new JTextField(10);
         JButton btn=new JButton("Submit");
         frm.add(lbl,BorderLayout.NORTH);
         frm.add(tf,BorderLayout.SOUTH);
         frm.add(btn,BorderLayout.CENTER);

         frm.setVisible(true);
    }
}
