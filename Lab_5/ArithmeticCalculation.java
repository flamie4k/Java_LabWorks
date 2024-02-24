package Lab_5;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ArithmeticCalculation extends JFrame implements ActionListener {
    JLabel lblReadNum1, lblReadNum2, lblResult;
    JTextField txtNum1, txtNum2, txtResult;
    JButton btnAdd, btnSubtract;

    ArithmeticCalculation() {
        // Frame setup
        setTitle("Arithmetic Calculation");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        // Labels
        lblReadNum1 = new JLabel("Enter first number:");
        lblReadNum1.setBounds(20, 20, 150, 20);
        add(lblReadNum1);

        lblReadNum2 = new JLabel("Enter second number:");
        lblReadNum2.setBounds(20, 50, 150, 20);
        add(lblReadNum2);

        lblResult = new JLabel("Result:");
        lblResult.setBounds(20, 80, 150, 20);
        add(lblResult);

        // TextFields
        txtNum1 = new JTextField();
        txtNum1.setBounds(180, 20, 150, 20);
        add(txtNum1);

        txtNum2 = new JTextField();
        txtNum2.setBounds(180, 50, 150, 20);
        add(txtNum2);

        txtResult = new JTextField();
        txtResult.setBounds(180, 80, 150, 20);
        txtResult.setEditable(false); // Make result field read-only
        add(txtResult);

        // Buttons
        btnAdd = new JButton("Add");
        btnAdd.setBounds(50, 120, 100, 30);
        btnAdd.addActionListener(this); // Register ActionListener
        add(btnAdd);

        btnSubtract = new JButton("Subtract");
        btnSubtract.setBounds(220, 120, 100, 30);
        btnSubtract.addActionListener(this); // Register ActionListener
        add(btnSubtract);

        setVisible(true);
    }

    // ActionListener implementation
    public void actionPerformed(ActionEvent e) {
        int num1 = Integer.parseInt(txtNum1.getText());
        int num2 = Integer.parseInt(txtNum2.getText());
        int result = 0;
        if (e.getSource() == btnAdd) {
            result = num1 + num2;
        } else if (e.getSource() == btnSubtract) {
            result = num1 - num2;
        }
        txtResult.setText(String.valueOf(result));
    }

    public static void main(String[] args) {
        new ArithmeticCalculation();
    }
}
