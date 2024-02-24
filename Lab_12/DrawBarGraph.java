package Lab_12;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;

class Bars {
    Color color;
    int value;

    Bars(Color color, int value) {
        this.color = color;
        this.value = value;
    }
}

class BarGraph extends JPanel {
    Bars[] bars = {new Bars(Color.red, 66), new Bars(Color.blue, 250), new Bars(Color.green, 140)};

    BarGraph() {
        setSize(400, 400);
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        g.drawLine(80, 80, 80, 300);
        g.drawLine(80, 300, 300, 300);

        int x1 = 80;

        for (int i = 0; i < bars.length; i++) {
            int y1 = 300 - bars[i].value;

            g.setColor(bars[i].color);
            g.fillRect(x1, y1, 20, bars[i].value);
            x1 = x1 + 120;
        }
    }
}

public class DrawBarGraph {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        BarGraph bg = new BarGraph();

        frame.setSize(400, 400);
        frame.setTitle("Drawing Bar graphs");
        frame.setLayout(null);
        frame.add(bg);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }
}

