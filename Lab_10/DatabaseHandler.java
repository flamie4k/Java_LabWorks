package Lab_10;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class DatabaseHandler implements ActionListener {
    Connection connect;
    Statement stm;
    ResultSet rst;
    ApplicationFrame af;

    public DatabaseHandler(ApplicationFrame af) {
        this.af = af;
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        connectDatabase();
        int getId;
        try {
            String name = af.nameField.getText();
            String address = af.addressField.getText();
            String email = af.emailField.getText();
            String query;
            if (ae.getSource().equals(af.insert)) {
                query = "INSERT INTO it_4th_student (name, address, email) VALUES ('" + name + "','" + address + "','" + email + "')";
                stm.executeUpdate(query);
                af.result.setText("One record inserted");
            } else if (ae.getSource().equals(af.read)) {
                getId = Integer.parseInt(af.idField.getText());
                query = "SELECT * FROM it_4th_student WHERE id = " + getId;
                rst = stm.executeQuery(query);
                while (rst.next()) {
                    String sname = rst.getString("name");
                    String saddress = rst.getString("address");
                    String semail = rst.getString("email");
                    String record = "Name: " + sname + "\nAddress: " + saddress + "\nEmail: " + semail;
                    af.result.setText(record);
                }
            } else if (ae.getSource().equals(af.update)) {
                getId = Integer.parseInt(af.idField.getText());
                String upName = JOptionPane.showInputDialog("Updated Name:");
                String upAddress = JOptionPane.showInputDialog("Updated Address:");
                String upEmail = JOptionPane.showInputDialog("Updated Email:");
                query = "UPDATE it_4th_student SET name='" + upName + "', address='" + upAddress + "', email='" + upEmail + "' WHERE id=" + getId;
                stm.executeUpdate(query);
                af.result.setText("Updated with name: " + upName);
            } else if (ae.getSource().equals(af.delete)) {
                getId = Integer.parseInt(af.idField.getText());
                query = "DELETE FROM it_4th_student WHERE id=" + getId;
                stm.executeUpdate(query);
                af.result.setText("Record with id: " + getId + " deleted.");
            }
            connect.close();
        } catch (Exception e) {
            System.out.println(e);
            e.printStackTrace();
        }
    }

    public void connectDatabase() {
        try {
            String url = "jdbc:mysql://localhost:3306/it_4th";
            String user = "root";
            String password = "your_password"; // Replace with your database password
            Class.forName("com.mysql.cj.jdbc.Driver");
            connect = DriverManager.getConnection(url, user, password);
            if (connect != null) {
                System.out.println("Connection successful");
            }
            stm = connect.createStatement();
        } catch (Exception e) {
            System.out.println(e);
            e.printStackTrace();
        }
    }
}

