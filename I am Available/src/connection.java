
import java.sql.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class connection {

    private Connection conn;
    private Statement stmt;
    private ResultSet rs, rs1, rs2, rs4;
    private String username = "root";
    private String dbName = "proj1";
    private String password = "";
    String driverName = "com.mysql.jdbc.Driver";
    String a, b, c;
    private String dbURL = "jdbc:mysql://localhost:3306/" + dbName;

    public connection() {

        try {
            conn = DriverManager.getConnection(dbURL, username, password);
            stmt = conn.createStatement();
        } catch (SQLException ex) {
            //Logger.getLogger(studentlogic.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Exception " + ex);
        }
    }



    public boolean addSignup(String name, String rollno, String email_id, String gender, int age, long contactno, String uMOT, String vehicle_no, String residence, String password, String c_password) {
        int id = 0;
        boolean flag = false;
        try {
            // String executeQuery="SELECT 'email_id','password' FROM 'signup' WHERE email_id = '"+email_id+" AND 'password='"+pass+"'";
            String executeQuery = "SELECT 'email_id' FROM `signup` WHERE `email_id` LIKE '" + email_id + "'";
            rs2 = stmt.executeQuery(executeQuery);

            int cnt = 0;
            while (rs2.next()) {
                cnt = cnt + 1;
            }
            if (cnt == 1) {
                JOptionPane.showMessageDialog(null, "User already exist");
            } else {
                String insertQuery = "INSERT INTO `signup`(`name`, `rollno`, `email_id`, `gender`, `age`, `contactno`, `uMOT`, `vehicle_no`, `residence`, `password`, `c_password`) VALUES ('" + name + "','" + rollno + "','" + email_id + "','" + gender + "'," + age + "," + contactno + ",'" + uMOT + "','" + vehicle_no + "','" + residence + "','" + password + "','" + c_password + "')";
                // ="INSERT INTO `login`" + "VALUES ('" + email_id + "'," +pass+")";
                System.out.println("insertQuery= " + insertQuery);
                try {
                    int result = stmt.executeUpdate(insertQuery);
                    if (result == 1) {
                        flag = true;
                    }

                } catch (SQLException ex) {
                    // Logger.getLogger(studentlogic.class.getName()).log(Level.SEVERE, null, ex);
                    System.out.println("Exception " + ex);
                }

            }
            try {
                String eQ = "SELECT ID FROM `signup` WHERE `email_id` LIKE '" + email_id + "'";
                rs4 = stmt.executeQuery(eQ);
                while (rs4.next()) {
                    id = rs4.getInt(1);
                }
                System.out.println(id);
            } catch (Exception e) {
                System.out.println(e);
            }

        } catch (SQLException ex) {
            // Logger.getLogger(studentlogic.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Exception " + ex);
        }
        return flag;
    }

}