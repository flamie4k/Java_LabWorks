package Lab_7;
import java.awt.GridBagLayout;
import java.awt.Frame;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class ClosableAwstFrame extends Frame implements WindowListener {

    public ClosableAwstFrame() {
        // Set layout and register window listener
        setLayout(new GridBagLayout());
        addWindowListener(this);
        setVisible(true);
        setSize(400, 400);
    }

    @Override
    public void windowOpened(WindowEvent we) {
        System.out.println("Window opened...");
    }

    @Override
    public void windowClosing(WindowEvent we) {
        System.out.println("Window closing...");
    }

    @Override
    public void windowActivated(WindowEvent we) {
        System.out.println("Window activated...");
    }

    @Override
    public void windowDeactivated(WindowEvent we) {
        System.out.println("Window deactivated...");
    }

    @Override
    public void windowIconified(WindowEvent we) {
        System.out.println("Window iconified...");
    }

    @Override
    public void windowDeiconified(WindowEvent we) {
        System.out.println("Window deiconified...");
    }

    @Override
    public void windowClosed(WindowEvent we) {
        System.out.println("Window closed...");
    }

    public static void main(String[] args) {
        new ClosableAwstFrame();
    }
}
