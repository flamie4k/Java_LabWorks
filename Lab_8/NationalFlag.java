package Lab_8;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Color;
import java.awt.Font;

class NepalFlag extends JPanel {
    NepalFlag() {
        setSize(700, 720);
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.green);
        g.drawRect(10, 10, 600, 680);
        g.setColor(Color.black);
        g.fillRect(40, 20, 10, 660);

        int[] xPoints = {50, 300, 90, 340, 50, 50};
        int[] yPoints = {20, 249, 240, 500, 500, 2};
        g.setColor(Color.blue);
        g.fillPolygon(xPoints, yPoints, 5);

        int[] xP = {60, 280, 70, 370, 60, 60};
        int[] yP = {40, 230, 230, 490, 490, 403};
        g.setColor(Color.red);
        g.fillPolygon(xP, yP, 6);

        g.setColor(Color.white);
        g.fillArc(100, 160, 60, 34, 0, 180);
        g.fillArc(100, 360, 60, 60, 0, 360);

        g.setColor(Color.black);
        g.setFont(new Font("serif", Font.BOLD, 30));
        g.drawString("National Flag", 200, 660);
    }
}

public class NationalFlag {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.add(new NepalFlag());
        frame.setSize(700, 720);
        frame.setTitle("National Flag");
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
