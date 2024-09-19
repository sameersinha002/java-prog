import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;

class shape1 extends JPanel{
     protected void paintComponent(Graphics g){
        super.paintComponent(g);
        g.setColor(Color.BLUE);
        g.drawRect(50,50,30,50);
        g.drawOval(150,50,55,55);
        g.drawLine(250, 50,300  ,100);

        g.setColor(Color.red);
        g.drawString("rectangle", 50, 120);
        g.drawString("circle", 160, 120);
        g.drawString("line", 260, 120);
     }
}
public class shape2 extends JFrame
 {
    public static void main(String[] args) {
        JFrame fr=new JFrame();
        fr.setSize(700,700);
        fr.setDefaultCloseOperation(EXIT_ON_CLOSE);
        fr.setTitle("Shape");
        fr.getContentPane().setBackground(Color.cyan);
        fr.add(new shape1());
       fr.setVisible(true);
    }
}
