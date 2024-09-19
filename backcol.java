
import java.awt.Color;
import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class backcol extends JFrame {
 public static void main(String[] args) {
    JFrame fr=new JFrame();
    fr.setDefaultCloseOperation(EXIT_ON_CLOSE);
    fr.setSize(600,600);
    fr.setLayout(new FlowLayout());
    fr.setTitle("Java color");
    fr.getContentPane().setBackground(Color.BLUE);
    JLabel lb=new JLabel("Welcome");
     fr.add(lb);
     fr.setVisible(true);
 }   
}
