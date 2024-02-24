package Lab_10;
import javax.swing.*;
import java.awt.Color;
import java.awt.GridLayout;

public class ApplicationFrame extends JFrame {
    JPanel insertPanel, updatePanel;
    JLabel nameLabel, addressLabel, emailLabel, idLabel;
    JTextArea result;
    JTextField nameField, addressField, emailField, idField;
    JButton insert, delete, update, read;

    public ApplicationFrame() {
        // Insert Panel
        insertPanel = new JPanel();
        nameLabel = new JLabel("Name");
        nameLabel.setBounds(20, 50, 160, 30);
        insertPanel.add(nameLabel);
        nameField = new JTextField();
        nameField.setBounds(180, 50, 160, 30);
        insertPanel.add(nameField);

        addressLabel = new JLabel("Address");
        addressLabel.setBounds(20, 90, 160, 30);
        insertPanel.add(addressLabel);
        addressField = new JTextField();
        addressField.setBounds(180, 90, 160, 30);
        insertPanel.add(addressField);

        emailLabel = new JLabel("Email");
        emailLabel.setBounds(20, 130, 160, 30);
        insertPanel.add(emailLabel);
        emailField = new JTextField();
        emailField.setBounds(180, 130, 160, 30);
        insertPanel.add(emailField);

        insert = new JButton("SAVE");
        insert.setBounds(120, 170, 80, 30);
        insertPanel.add(insert);

        insertPanel.setBackground(Color.ORANGE);
        insertPanel.setLayout(null);
        add(insertPanel);

        // Update Panel
        updatePanel = new JPanel();
        idLabel = new JLabel("Records to be updated");
        idLabel.setBounds(20, 50, 180, 30);
        updatePanel.add(idLabel);
        idField = new JTextField();
        idField.setBounds(210, 50, 80, 30);
        updatePanel.add(idField);

        read = new JButton("READ");
        read.setBounds(20, 90, 80, 30);
        updatePanel.add(read);

        update = new JButton("Update");
        update.setBounds(110, 90, 80, 30);
        updatePanel.add(update);

        delete = new JButton("DELETE");
        delete.setBounds(200, 90, 80, 30);
        updatePanel.add(delete);

        updatePanel.setBackground(Color.PINK);
        updatePanel.setLayout(null);
        add(updatePanel);

        result = new JTextArea("Result Here...");
        result.setBounds(20, 130, 300, 50);
        result.setEditable(false);
        updatePanel.add(result);

        // Database Handler
        DatabaseHandler handler = new DatabaseHandler(insert, read, update, delete);
        setTitle("CRUD operation Frame");
        setSize(800, 360);
        setLayout(new GridLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new ApplicationFrame();
    }
}
