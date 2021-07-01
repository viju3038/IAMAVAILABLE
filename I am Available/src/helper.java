
import java.awt.Dimension;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalTime;
import javax.swing.JFrame;
import javax.swing.JOptionPane;


public class helper extends javax.swing.JFrame {
private int sid;
private Connection conn;  
    private Statement stmt;
    private ResultSet rs,rs1,rs2,rs4;
    private String username="root";
    private String dbName="proj1";
    private String password="";
     String driverName="com.mysql.jdbc.Driver";
     String a,b,c;
private String dbURL="jdbc:mysql://localhost:3306/"+dbName;

       

    
    public helper(int sid) {
        initComponents();
        this.sid=sid;
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
this.setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);
        try {
            conn=DriverManager.getConnection(dbURL,username,password);
            stmt=conn.createStatement();
            System.out.println(sid);
        } catch (SQLException ex) {
            //Logger.getLogger(studentlogic.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Exception "+ex);
        }
        
    }
    public helper(){
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jRadioButton3 = new javax.swing.JRadioButton();
        bg = new javax.swing.ButtonGroup();
        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        destination_field = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        MOT_field = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        hour_field = new javax.swing.JComboBox<>();
        minute_field = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        seatAvailable_field = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        male_field = new javax.swing.JRadioButton();
        female_field = new javax.swing.JRadioButton();
        any_field = new javax.swing.JRadioButton();
        jLabel5 = new javax.swing.JLabel();
        vehicleno_field = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        free_field = new javax.swing.JRadioButton();
        sharing_field = new javax.swing.JRadioButton();
        jLabel11 = new javax.swing.JLabel();
        price_field = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jTextField2 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();

        jRadioButton3.setText("jRadioButton3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(102, 102, 255));
        jPanel1.setForeground(new java.awt.Color(153, 255, 153));
        jPanel1.setLayout(null);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel1.setText("Enter your Destination");
        jPanel3.add(jLabel1);
        jLabel1.setBounds(10, 10, 123, 20);

        destination_field.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ghuma Gam", "Iskon Cross Road", "Shivranjani", "Nehrunagar", "Anjai", "Vasna", "Narol", "Maninagar", "Hatkeshwar", "S.P. Ring Road", "Kalupur Railway Station", "Commerce Six Road", "M.J. Library", "RTO Circle", "Zundal Circle", "Sola Bhagwat", "Science City Approach" }));
        jPanel3.add(destination_field);
        destination_field.setBounds(240, 10, 138, 20);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setText("Mode of Transportation");
        jPanel3.add(jLabel2);
        jLabel2.setBounds(10, 50, 129, 15);

        MOT_field.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2 - wheeler", "3 - wheeler", "4 - wheeler", "BRTS", "AMTS" }));
        MOT_field.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MOT_fieldActionPerformed(evt);
            }
        });
        jPanel3.add(MOT_field);
        MOT_field.setBounds(240, 50, 140, 20);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setText("Departure Time");
        jPanel3.add(jLabel3);
        jLabel3.setBounds(10, 90, 86, 15);

        jLabel7.setText("Hours");
        jPanel3.add(jLabel7);
        jLabel7.setBounds(240, 90, 50, 14);

        jLabel8.setText("Minutes");
        jPanel3.add(jLabel8);
        jLabel8.setBounds(320, 90, 60, 14);

        hour_field.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23" }));
        hour_field.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hour_fieldActionPerformed(evt);
            }
        });
        jPanel3.add(hour_field);
        hour_field.setBounds(240, 110, 50, 20);

        minute_field.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "00", "05", "10", "15", "20", "25", "30", "35", "40", "45", "50", "55", "60" }));
        jPanel3.add(minute_field);
        minute_field.setBounds(320, 110, 50, 20);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel4.setText("Number of Seat Available");
        jPanel3.add(jLabel4);
        jLabel4.setBounds(10, 150, 137, 15);

        seatAvailable_field.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "more" }));
        seatAvailable_field.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seatAvailable_fieldActionPerformed(evt);
            }
        });
        jPanel3.add(seatAvailable_field);
        seatAvailable_field.setBounds(240, 150, 110, 20);

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel6.setText("Gender Preference");
        jPanel3.add(jLabel6);
        jLabel6.setBounds(10, 190, 104, 23);

        bg.add(male_field);
        male_field.setText("Male");
        male_field.setOpaque(false);
        jPanel3.add(male_field);
        male_field.setBounds(240, 190, 70, 23);

        bg.add(female_field);
        female_field.setText("Female");
        female_field.setOpaque(false);
        jPanel3.add(female_field);
        female_field.setBounds(240, 210, 80, 23);

        bg.add(any_field);
        any_field.setText("Any");
        any_field.setOpaque(false);
        any_field.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                any_fieldActionPerformed(evt);
            }
        });
        jPanel3.add(any_field);
        any_field.setBounds(240, 230, 60, 23);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel5.setText("Vehical number");
        jLabel5.setEnabled(false);
        jLabel5.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jLabel5FocusLost(evt);
            }
        });
        jPanel3.add(jLabel5);
        jLabel5.setBounds(10, 270, 84, 15);

        vehicleno_field.setEnabled(false);
        vehicleno_field.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vehicleno_fieldActionPerformed(evt);
            }
        });
        jPanel3.add(vehicleno_field);
        vehicleno_field.setBounds(240, 260, 160, 30);

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel10.setText("How would you like to share the ride?");
        jPanel3.add(jLabel10);
        jLabel10.setBounds(10, 300, 220, 15);

        buttonGroup1.add(free_field);
        free_field.setSelected(true);
        free_field.setText("Free");
        free_field.setContentAreaFilled(false);
        free_field.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                free_fieldActionPerformed(evt);
            }
        });
        jPanel3.add(free_field);
        free_field.setBounds(240, 300, 110, 23);

        buttonGroup1.add(sharing_field);
        sharing_field.setText("Sharing");
        sharing_field.setContentAreaFilled(false);
        sharing_field.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sharing_fieldActionPerformed(evt);
            }
        });
        jPanel3.add(sharing_field);
        sharing_field.setBounds(350, 300, 80, 23);

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel11.setText("Price");
        jLabel11.setEnabled(false);
        jPanel3.add(jLabel11);
        jLabel11.setBounds(10, 330, 80, 15);

        price_field.setEnabled(false);
        price_field.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                price_fieldActionPerformed(evt);
            }
        });
        jPanel3.add(price_field);
        price_field.setBounds(240, 330, 150, 30);

        jPanel1.add(jPanel3);
        jPanel3.setBounds(50, 30, 440, 360);

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Confirm");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(130, 400, 130, 30);

        jButton2.setBackground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Back");
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(310, 400, 120, 30);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(null);

        jTextField2.setEditable(false);
        jTextField2.setBackground(new java.awt.Color(255, 255, 255));
        jTextField2.setFont(new java.awt.Font("Algerian", 0, 48)); // NOI18N
        jTextField2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField2.setText("Helper");
        jTextField2.setBorder(null);
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        jPanel2.add(jTextField2);
        jTextField2.setBounds(20, 80, 207, 73);

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/helper2.png"))); // NOI18N
        jPanel2.add(jLabel9);
        jLabel9.setBounds(50, 190, 150, 66);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 541, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 433, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void seatAvailable_fieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seatAvailable_fieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_seatAvailable_fieldActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void any_fieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_any_fieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_any_fieldActionPerformed

    private void MOT_fieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MOT_fieldActionPerformed
String a=MOT_field.getSelectedItem().toString();
if(a.equals("2 - wheeler") ||a.equals("4 - wheeler")){
    jLabel5.setEnabled(true);
    vehicleno_field.setEnabled(true);
}else{
    jLabel5.setEnabled(false);
    vehicleno_field.setEnabled(false);
}        // TODO add your handling code here:
    }//GEN-LAST:event_MOT_fieldActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

String destination=destination_field.getSelectedItem().toString();
String hours=hour_field.getSelectedItem().toString();
String minutes=minute_field.getSelectedItem().toString();
//String second="00";
String time=hours+":"+minutes;
LocalTime lt=LocalTime.parse(time);
String MOT=MOT_field.getSelectedItem().toString();
String seatAvailable=(String) seatAvailable_field.getSelectedItem() ;
String vehicleNo=vehicleno_field.getText();
String genderP = null;
if(male_field.isSelected()){
    genderP=male_field.getText();
}
else if(female_field.isSelected()){
    genderP=female_field.getText();
}
else if(any_field.isSelected()){
    genderP=any_field.getText();
}
else{
    genderP="";
}
String share = null;
if(free_field.isSelected()){
    share=free_field.getText();
}
else if(sharing_field.isSelected()){
    share=sharing_field.getText();


}


else{
    share="";
}

String price=price_field.getText();

if(destination.equals("")|| MOT.equals("")|| seatAvailable.equals("")||vehicleNo.equals("")|| genderP.equals("")||share.equals("")){
      
  JOptionPane.showMessageDialog(null, "Some fileds might be empty");
}else{

        String insertQuery = "INSERT INTO `helper`(`sid`,`destination`, `MOT`,`time`, `seatAvailable`, `vehicleNo`, `genderP`,`share`,`price`) VALUES ("+sid+",'" + destination + "','" + MOT + "','"+ lt+"','" + seatAvailable + "','" + vehicleNo + "','" + genderP + "','"+share+"','"+price+"')";

        System.out.println("insertQuery= " + insertQuery);
        try {
            int result = stmt.executeUpdate(insertQuery);
//            if (result == 1) {
//              
//            }

        } catch (SQLException ex) {
                        System.out.println("Exception " + ex);

        }

       
    }    

JOptionPane.showMessageDialog(null, "Thanks For Helping");
//try {
//stmt.close();
//        
//            conn.close();
//        } catch (SQLException ex) {
//    System.out.println(ex);            
//        }
    }//GEN-LAST:event_jButton1ActionPerformed
    
    

    
    private void jLabel5FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jLabel5FocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel5FocusLost

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
user mm=new user(sid);
        mm.setVisible(true);
        mm.pack();
        mm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();         
    }//GEN-LAST:event_jButton2ActionPerformed

    private void hour_fieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hour_fieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_hour_fieldActionPerformed

    private void vehicleno_fieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vehicleno_fieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_vehicleno_fieldActionPerformed

    private void sharing_fieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sharing_fieldActionPerformed
        
        String a=sharing_field.getText();
        if(a.equals("Sharing")){
    jLabel11.setEnabled(true);
    price_field.setEnabled(true);
        } 
    }//GEN-LAST:event_sharing_fieldActionPerformed

    private void free_fieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_free_fieldActionPerformed
String a=free_field.getText();
        if(a.equals("Free")){
    jLabel11.setEnabled(false);
    price_field.setEnabled(false);
        }       

// TODO add your handling code here:
    }//GEN-LAST:event_free_fieldActionPerformed

    private void price_fieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_price_fieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_price_fieldActionPerformed

   
    public static void main(String args[]) {

        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(helper.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(helper.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(helper.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(helper.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new helper().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> MOT_field;
    private javax.swing.JRadioButton any_field;
    private javax.swing.ButtonGroup bg;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> destination_field;
    private javax.swing.JRadioButton female_field;
    private javax.swing.JRadioButton free_field;
    private javax.swing.JComboBox<String> hour_field;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JRadioButton male_field;
    private javax.swing.JComboBox<String> minute_field;
    private javax.swing.JTextField price_field;
    private javax.swing.JComboBox<String> seatAvailable_field;
    private javax.swing.JRadioButton sharing_field;
    private javax.swing.JTextField vehicleno_field;
    // End of variables declaration//GEN-END:variables
}
