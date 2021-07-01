
import java.awt.Dimension;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;


public class logins extends javax.swing.JFrame {

    int sid;
    private Connection conn;
    private Statement stmt;
    private ResultSet rs, rs1, rs2, rs4;
    private String username = "root";
    private String dbName = "proj1";
    private String password = "";
    String driverName = "com.mysql.jdbc.Driver";
    String a, b, c;
    private String dbURL = "jdbc:mysql://localhost:3306/" + dbName;

    
    public logins() {
        initComponents();
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
this.setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);
        try {
            conn = DriverManager.getConnection(dbURL, username, password);
            stmt = conn.createStatement();
        } catch (SQLException ex) {
            //Logger.getLogger(studentlogic.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Exception " + ex);
        }
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        username_field = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        pass_field = new javax.swing.JPasswordField();
        jLabel3 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(102, 102, 255));
        jPanel1.setLayout(null);

        jButton2.setBackground(new java.awt.Color(255, 255, 255));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/right1.jpg"))); // NOI18N
        jButton2.setText("Done");
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(10, 230, 100, 40);

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/right.jpg"))); // NOI18N
        jButton1.setText("Back");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(123, 230, 100, 40);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(null);

        username_field.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        username_field.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                username_fieldActionPerformed(evt);
            }
        });
        jPanel3.add(username_field);
        username_field.setBounds(30, 40, 140, 16);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setText("Email ID");
        jPanel3.add(jLabel2);
        jLabel2.setBounds(30, 20, 90, 15);

        pass_field.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        pass_field.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pass_fieldActionPerformed(evt);
            }
        });
        jPanel3.add(pass_field);
        pass_field.setBounds(30, 100, 140, 16);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setText("Password");
        jPanel3.add(jLabel3);
        jLabel3.setBounds(30, 80, 80, 15);
        jPanel3.add(jSeparator1);
        jSeparator1.setBounds(30, 60, 140, 2);
        jPanel3.add(jSeparator2);
        jSeparator2.setBounds(30, 120, 140, 2);

        jPanel1.add(jPanel3);
        jPanel3.setBounds(10, 70, 200, 140);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Algerian", 0, 48)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Login");
        jPanel2.add(jLabel1);
        jLabel1.setBounds(50, 180, 160, 64);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/login.png"))); // NOI18N
        jPanel2.add(jLabel4);
        jLabel4.setBounds(90, 80, 80, 80);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 252, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void pass_fieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pass_fieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pass_fieldActionPerformed

    private void username_fieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_username_fieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_username_fieldActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

       
        String email_id = username_field.getText().trim();
        String pass = pass_field.getText().trim();

        try {
            if (addLogin(email_id, pass)) {
                int dialogType = JOptionPane.INFORMATION_MESSAGE;
                try {
                    String eQ = "SELECT ID FROM `signup` WHERE `email_id` LIKE '" + email_id + "'";
                    rs4 = stmt.executeQuery(eQ);
                    while (rs4.next()) {
                        sid = rs4.getInt(1);
                    }
                    System.out.println(sid);
                    // String iQ = "INSERT INTO `login`(`ID`) VALUES (" + sid + ")";
                } catch (Exception e) {
                    System.out.println(e);
                }
                user u = new user(sid);
                u.setVisible(true);
                
                u.pack();
                u.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                this.dispose();
            } else {
                int dialogType = JOptionPane.ERROR_MESSAGE;
                
            }
        } catch (SQLException ex) {
            Logger.getLogger(logins.class.getName()).log(Level.SEVERE, null, ex);
        }


        
    }//GEN-LAST:event_jButton2ActionPerformed

     public boolean addLogin(String email_id, String pass) throws SQLException {
        boolean flag = false;

        try {
            String executeQuery = "SELECT 'email_id','password' FROM `signup` WHERE `email_id` LIKE '" + email_id + "' AND `password` LIKE '" + pass + "'";
            rs1 = stmt.executeQuery(executeQuery);

            int cnt = 0;
            while (rs1.next()) {
                cnt = cnt + 1;
            }
            if (cnt == 1) {
                JOptionPane.showMessageDialog(null, "User found");
                
flag = true;
                 
               

              
            } 
            else {
                JOptionPane.showMessageDialog(null, "not found");

            }
        } catch (SQLException ex) {
            
            System.out.println("Exception " + ex);
        }
       
        return flag;
    }
    
    
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        main_menu mm = new main_menu();
        mm.setVisible(true);
        mm.pack();
        mm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();           // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(logins.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(logins.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(logins.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(logins.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new logins().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JPasswordField pass_field;
    private javax.swing.JTextField username_field;
    // End of variables declaration//GEN-END:variables
}
