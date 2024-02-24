package Lab_10;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.DriverManager;

public class DbConnect {
    Connection con;
    Statement stm;
    ResultSet rst;

    public DbConnect() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test-db", "root", "");
            stm = con.createStatement();
        } catch (ClassNotFoundException cnfe) {
            System.out.println(cnfe.getMessage());
        } catch (SQLException se) {
            System.out.println(se.getMessage());
        }
    }

    void testQuery() {
        try {
            String createDb = "CREATE DATABASE IF NOT EXISTS test-db";
            String createTbl = "CREATE TABLE IF NOT EXISTS test-tbl (tid int(4) primary key auto_increment, name varchar(20), address varchar(20))";
            String insertRecord = "INSERT INTO test-tbl (name, address) VALUES ('Gita', 'KTM')";
            String fetchRecord = "SELECT * FROM test-tbl";
            rst = stm.executeQuery(fetchRecord);
            
            System.out.println("Id\t\tName\t\tAddress");
            while (rst.next()) {
                int id = rst.getInt("tid");
                String name = rst.getString("name");
                String address = rst.getString("address");
                System.out.println(id + "\t\t" + name + "\t\t" + address);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static void main(String[] args) {
        DbConnect db = new DbConnect();
        db.testQuery();
    }
}
