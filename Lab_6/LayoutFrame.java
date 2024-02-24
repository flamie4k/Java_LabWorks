package Lab_6;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LayoutFrame extends JFrame implements ActionListener {
    JButton addBtn, subBtn;
    JTextField firstTxt, secondTxt, resultTxt;
    JPanel panel1;
    public void createFrame() {
        System.out.println("Creating frame...");
    }

    LayoutFrame() {
        // Frame setup
        setTitle("Custom Layout");
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        // Panel setup
        panel1 = new JPanel();
        panel1.setLayout(new BorderLayout());
        panel1.setBackground(Color.RED);

        // TextFields
        firstTxt = new JTextField("First Number");
        panel1.add(firstTxt, BorderLayout.NORTH);

        secondTxt = new JTextField("Second Number");
        panel1.add(secondTxt, BorderLayout.SOUTH);

        resultTxt = new JTextField("Output");
        resultTxt.setEditable(false);
        panel1.add(resultTxt, BorderLayout.CENTER);

        // Buttons
        addBtn = new JButton("Addition");
        addBtn.addActionListener(this);
        panel1.add(addBtn, BorderLayout.WEST);

        subBtn = new JButton("Subtraction");
        subBtn.addActionListener(this);
        panel1.add(subBtn, BorderLayout.EAST);

        // Add panel to frame
        add(panel1);
        setVisible(true);
    }

    // ActionListener implementation
    public void actionPerformed(ActionEvent ae) {
        int num1 = Integer.parseInt(firstTxt.getText());
        int num2 = Integer.parseInt(secondTxt.getText());
        if (ae.getSource() == addBtn) {
            int sum = num1 + num2;
            resultTxt.setText(String.valueOf(sum));
        } else if (ae.getSource() == subBtn) {
            int diff = num1 - num2;
            resultTxt.setText(String.valueOf(diff));
        }
    }

    public static void main(String[] args) {
        new LayoutFrame();
    }
}
