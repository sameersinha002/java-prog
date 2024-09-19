import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Font;

class ShapePanel extends JPanel {
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        // Set color to blue and draw shapes
        g.setColor(Color.BLUE);
        
        // Draw a rectangle
        g.drawRect(50, 50, 100, 50);
        
        // Draw a circle (oval with equal width and height)
        g.drawOval(200, 50, 50, 50);
        
        // Draw a line
        g.drawLine(300, 50, 350, 100);

        // Set color to red and draw text
        g.setColor(Color.RED);
        g.setFont(new Font("Serif", Font.BOLD, 20));
        g.drawString("Rectangle", 50, 120);
        g.drawString("Circle", 200, 120);
        g.drawString("Line", 300, 120);
    }
}

public class ShapeDrawing {
    public static void main(String[] args) {
        // Create a JFrame
        JFrame frame = new JFrame("Geometric Shapes and Text");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 200);

        // Add the ShapePanel to the frame
        ShapePanel panel = new ShapePanel();
        frame.add(panel);

        // Make the frame visible
        frame.setVisible(true);
    }
}
