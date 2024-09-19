import java.awt.Frame;
import java.awt.event.*;
public class EventListener extends Frame implements WindowListener {
    public static void main(String[] args) {
        EventListener evt=new EventListener();
        evt.setVisible(true);
        evt.setSize(500,500);
        evt.setTitle("First Frame");
        evt.addWindowListener(evt);
    }

    @Override
    public void windowOpened(WindowEvent e) {
        throw new UnsupportedOperationException("Unimplemented method 'windowOpened'");
    }

    @Override
    public void windowClosing(WindowEvent e) {
        System.exit(ABORT);
        throw new UnsupportedOperationException("Unimplemented method 'windowClosing'");
    }

    @Override
    public void windowClosed(WindowEvent e) {
        throw new UnsupportedOperationException("Unimplemented method 'windowClosed'");
    }

    @Override
    public void windowIconified(WindowEvent e) {
        
        throw new UnsupportedOperationException("Unimplemented method 'windowIconified'");
    }

    @Override
    public void windowDeiconified(WindowEvent e) {
        
        throw new UnsupportedOperationException("Unimplemented method 'windowDeiconified'");
    }

    @Override
    public void windowActivated(WindowEvent e) {
       
        throw new UnsupportedOperationException("Unimplemented method 'windowActivated'");
    }

    @Override
    public void windowDeactivated(WindowEvent e) {
       
        throw new UnsupportedOperationException("Unimplemented method 'windowDeactivated'");
    }
    
}
