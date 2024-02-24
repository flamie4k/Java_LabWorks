package Lab_8;
import javax.swing.JPanel;
import javax.swing.JFrame;
import java.awt.Graphics;

class Star extends JPanel {
    Star() {
        setSize(300, 300);
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        int[] x = {50, 110, 130, 150, 210, 150, 130, 10};
        int[] y = {200, 180, 120, 180, 200, 220, 280, 220};
        g.drawPolygon(x, y, 8);
    }
}

public class StarShapes {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(300, 300);
        frame.add(new Star());
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setLayout(null);
        frame.setVisible(true);
    }
}

