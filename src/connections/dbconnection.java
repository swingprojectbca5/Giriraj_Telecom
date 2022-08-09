package connections;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

public class dbconnection {

    private static Connection con;

    public static Connection isconnected() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/giriraj_telecom", "root", "");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Connection Failed");
            return con;
        }
        return con;
    }
}
