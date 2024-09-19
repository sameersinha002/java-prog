import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
public class actionswing extends JFrame {
        
    public actionswing(){
   
    setSize(500,500);
    setTitle("Change Colour");
    setLayout(new FlowLayout());

    JButton btn=new JButton("Click Here");
    btn.setSize(50,25);
    btn.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            getContentPane().setBackground(new Color(
                (float)Math.random(),
                (float)Math.random(),
                (float)Math.random()
            ));
        }
        
    });
 add(btn);
    }

   public static void main(String[] args){
    actionswing as=new actionswing();
    as.setVisible(true);
   }

}

