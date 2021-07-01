
import java.awt.Dimension;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Time;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Properties;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import java.util.*;
import javax.mail.*;
import javax.mail.internet.*;
import javax.swing.JFrame;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author PARUL
 */
public class match extends javax.swing.JFrame {
    //connection c4;
    DefaultTableModel model;
     int sid;
     Time lt;
    static int a;
    private String genderP;
     static String Email;
    private String pMOT;
    private String destination;
    private Connection conn;
    private Statement stmt;
    private ResultSet rs, rs1, rs2, rs4;
    private String username = "root";
    private String dbName = "proj1";
    private String password = "";
    
    
     private static String USER_NAME = "shahaksh59";  // GMail user name (just the part before "@gmail.com")
    private static String PASSWORD = "a,b,c,d,e,"; // GMail password
    
    
    String name1,rollno1,email_id1,contactno1,password1;
    
    //try {
    //try{        
//    String eQ = "SELECT email_id FROM `signup` WHERE `ID` LIKE " + ID ;
//            try{
//            rs = stmt.executeQuery(eQ);
//            while (rs.next()) {
//                Email = rs.getString(3);
//            }}
//catch(Exception e){
//            System.out.println(e);
//}
            //System.out.println(sid);
            //String iQ = "INSERT INTO `login`(`ID`) VALUES (" + sid + ")";
//        } catch (Exception e) {
//            System.out.println(e);
//       // }
//}
    
//    private static String RECIPIENT = match.Email;

    String driverName = "com.mysql.jdbc.Driver";
   // String a, b, c;
    private String dbURL = "jdbc:mysql://localhost:3306/" + dbName;
     String RECIPIENT;

//    String sQ="select  name,rollno,email_id,contactno,password from `signup` where ID="+sid;
//    try{
//    rs4 = stmt.executeQuery(sQ);
//                    while (rs4.next()) {
//                        sid = rs4.getInt(1);
//                    }
//                    System.out.println(sid);
//                    // String iQ = "INSERT INTO `login`(`ID`) VALUES (" + sid + ")";
//                } catch (Exception e) {
//                    System.out.println(e);
//                }
     ArrayList<Helpers> viewAllHelpers(String destination,String genderP,String pMOT,Time lt) throws java.text.ParseException {
       //String time1 = "00:30:00";
       
       String temp="00:30:00";
       Time s=Time.valueOf(temp);
        // SimpleDateFormat format = new SimpleDateFormat("HH:mm:ss");
        // Date date1 = format.parse(time1);
         System.out.println(lt+"\n"+s);
        // Date date2 = format.parse(lt);
       long difference = lt.getTime() - s.getTime();
       long diffMinutes = difference/ (60 * 1000) ;
       long w = diffMinutes%60;                    //minutes
       int x=(int)diffMinutes/60;                    //hours
       String y=String.valueOf(x);
       String z=String.valueOf(w);
       String g=y+":"+z+":00";
       Time f=Time.valueOf(g);
      
       long diff1=lt.getTime() + s.getTime();
         System.out.println(diff1);
        long diffMinutes1 = diff1/ (60 * 1000) ;
       long w1 = diffMinutes1%60;
       int x1=((int)diffMinutes1/60)-13;
       String y1=String.valueOf(x1);
       String z1=String.valueOf(w1);
       String g1=y1+":"+z1+":00";
       Time f1=Time.valueOf(g1);
       
         System.out.println(f);
         System.out.println(f1);
         String selectQuery = null;
         if(genderP.equals("Any") && !pMOT.equals("Any") ){
           selectQuery = "SELECT "
                + " h.sid,si.name,si.contactNo, h.MOT,h.seatAvailable, h.vehicleNo,h.time,h.share,h.price "
                    + "FROM `helper` h inner join `signup` si on(h.sid=si.ID) where h.destination = '" + destination +"'  AND h.MOT= '"+pMOT+"'AND h.time between '"+f+"' and '"+f1+"'"; 
         }
         else if(pMOT.equals("Any") && !genderP.equals("Any")   ){
              selectQuery = "SELECT "
                + " h.sid,si.name,si.contactNo, h.MOT,h.seatAvailable, h.vehicleNo,h.time ,h.share,h.price "
                    + "FROM `helper` h inner join `signup` si on(h.sid=si.ID) where h.destination = '" + destination +"' AND h.genderP= '"+ genderP + "' AND h.time between '"+f+"' and '"+f1+"'"; 
        
         } 
         else if(pMOT.equals("Any") && genderP.equals("Any")){
              selectQuery = "SELECT "
                + " h.sid,si.name,si.contactNo, h.MOT,h.seatAvailable, h.vehicleNo,h.time,h.share,h.price  "
                    + "FROM `helper` h inner join `signup` si on(h.sid=si.ID) where h.destination = '" + destination +"'  AND h.time between '"+f+"' and '"+f1+"'"; 
        
         } 
         else {
              selectQuery = "SELECT "
                + " h.sid,si.name,si.contactNo, h.MOT,h.seatAvailable, h.vehicleNo,h.time ,h.share,h.price "
                    + "FROM `helper` h inner join `signup` si on(h.sid=si.ID) where h.destination = '" + destination +"' AND h.genderP= '"+ genderP + "' AND h.MOT= '"+pMOT+"' AND h.time between '"+f+"' and '"+f1+"'"; 
        
         } 
         
//  String selectQuery1 = "SELECT name FROM  signup";
        //System.out.println(a);
        //System.out.println(b);
        ArrayList<Helpers> helperList = new ArrayList<Helpers>(200);
        try {
            ResultSet rs = stmt.executeQuery(selectQuery);
            //ResultSet rs1 = stmt.executeQuery(selectQuery1);

            while (rs.next()) {
                Helpers help = new Helpers();
                 help.setsid(rs.getInt("sid"));
                help.setName(rs.getString("name"));
               
                help.setMOT(rs.getString("MOT"));
                help.setcontactNo(rs.getLong("contactNo"));

                help.setSeatAvailable(rs.getString("seatAvailable"));
                help.setVehicleNo(rs.getString("vehicleNo"));
                help.setLt(rs.getTime("time"));
                 help.setShare(rs.getString("share"));
                help.setPrice(rs.getString("price"));

                helperList.add(help);
                //  conn.close();
            }
            System.out.println("helperList.size() " + helperList.size());
            if(helperList.size()==0){
                JOptionPane.showMessageDialog(null, "Seems Like no helpers available now.....Please try again after some time");
            this.dispose();
            }
 
        } catch (Exception e) {
            e.printStackTrace();
        }

        return helperList;

    }


    /**
     * Creates new form match
     */
    public match() {
    }
    public match(int sid,String destination, String genderP,String pMOT,Time lt) throws java.text.ParseException {
        this.sid=sid;
        this.destination=destination;
        this.genderP=genderP;
        this.pMOT=pMOT;
        this.lt=lt;
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
        
       
      //  c4 = new connection();
        model = new DefaultTableModel();
        
        String columns[] = {"sid","Name","Mode of Transportation","Contact Number","Number of seat available","Vehicle Number","Time","Free/Sharing","Price"};
        model.setColumnIdentifiers(columns);
        
        
        
        // set font for headers
//        java.awt.Font f = new Font("Arial", Font.ITALIC, 25);
//        JTableHeader header = jTable1.getFont();
        
        ArrayList<Helpers> helperList = viewAllHelpers(destination,genderP,pMOT,lt);
        
        Object object[] = new Object[9];
        for (Helpers help:helperList) {
           object[0] = help.getsid();
             object[1] = help.getName();
            object[2] = help.getMOT();
            object[3] = help.getcontactNo();
            object[4] = help.getSeatAvailable();
            object[5]=help.getVehicleNo();
              object[6]=help.getLt();
               object[7]=help.getShare();
              object[8]=help.getPrice();
            
            model.addRow(object);
            
           
//            object[0] = help.getMOT();
//            object[1] = help.getTime();
//            object[2] = help.getSeatAvailable();
//            object[3]=help.getVehicleNo();
            
            //model.addRow(object);
            
            
        }
        jTable1.setModel(model);
//        System.out.println(jTable1.getValueAt(jTable1.getSelectedRow(), 0));
//        jTable1.removeColumn(jTable1.getColumnModel().getColumn(0));
       // jTable2.setModel(model);
        //String am=
               // jTable1.getModel().getValueAt(jTable1.getSelectedRow(),4);
//      try {
//stmt.close();
//        
//            conn.close();
//        } catch (SQLException ex) {
//    System.out.println(ex);            
////Logger.getLogger(logins.class.getName()).log(Level.SEVERE, null, ex);
       // }  
    }
    
    private static void sendFromGMail(String from, String pass, String[] to, String subject, String body) {
        Properties props = System.getProperties();
        String host = "smtp.gmail.com";
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.host", host);
        props.put("mail.smtp.user", from);
        props.put("mail.smtp.password", pass);
        props.put("mail.smtp.port", "587");
        props.put("mail.smtp.auth", "true");

        Session session = Session.getDefaultInstance(props);
        MimeMessage message = new MimeMessage(session);

        try {
            message.setFrom(new InternetAddress(from));
            InternetAddress[] toAddress = new InternetAddress[to.length];

            // To get the array of addresses
            for (int i = 0; i < to.length; i++) {
                toAddress[i] = new InternetAddress(to[i]);
            }

            for (int i = 0; i < toAddress.length; i++) {
                message.addRecipient(Message.RecipientType.TO, toAddress[i]);
            }

            message.setSubject(subject);
            message.setText(body);
            Transport transport = session.getTransport("smtp");
            transport.connect(host, from, pass);
            transport.sendMessage(message, message.getAllRecipients());
            transport.close();
        } catch (AddressException ae) {
            ae.printStackTrace();
        } catch (MessagingException me) {
            me.printStackTrace();
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(102, 102, 255));
        jPanel1.setLayout(null);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTable1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(10, 40, 830, 250);

        jLabel1.setFont(new java.awt.Font("Showcard Gothic", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 255, 51));
        jLabel1.setText("List oF Helpers Available");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(290, 10, 340, 23);

        jButton1.setText("Back");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(341, 341, 341))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 831, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
       String from = USER_NAME;
        String pass = PASSWORD;
//        String[] to = {RECIPIENT}; // list of recipient email addresses
     String sQ="select  name,rollno,email_id,contactno from `signup` where ID="+sid;
    try{
    rs4 = stmt.executeQuery(sQ);
                    while (rs4.next()) {
                        name1=rs4.getString("name");
                        rollno1=rs4.getString("rollno");
                        email_id1=rs4.getString("email_id");
                        contactno1=rs4.getString("contactno");
                       
                        
                    }
                    System.out.println(name1);System.out.println(rollno1);System.out.println(email_id1);System.out.println(contactno1);        
                  // String iQ = "INSERT INTO `login`(`ID`) VALUES (" + sid + ")";
                } catch (Exception e) {
                    System.out.println(e);
                }
String abc=JOptionPane.showInputDialog(null,"Please Write a meassage");
        System.out.println(abc);
        String subject = "Hello Mate";
        String body = "I want to seek help from you. Thank You for your Support in advance! \nSeeker Info:\nName - "+name1+"\nRoll No - "+rollno1+"\nEmail ID - "+email_id1+"\nContact Number - "+contactno1+"\n\nMessage from seeker: "+abc;
        
        int row=jTable1.getSelectedRow();
       // System.out.println("a");
         System.out.println(jTable1.getValueAt(jTable1.getSelectedRow(), 0));
        int valueAt = Integer.parseInt(jTable1.getValueAt(jTable1.getSelectedRow(), 0).toString());
        System.out.println(valueAt);
         String abcd = jTable1.getValueAt(jTable1.getSelectedRow(), 1).toString();
         System.out.println(abcd);
        String insHistory="INSERT INTO `history` (`helperName`, `seekerName`, `destination`) VALUES ('"+abcd+"','"+name1+"','"+destination+"')";
        
       // jTable1.removeColumn(jTable1.getColumnModel().getColumn(0));
//        System.out.println(jTable1.getValueAt(row, 0));
//confirm sign=new confirm();
//        sign.setVisible(true);
//        sign.pack();
        //String message = sign.
       // String abc=sign.message;
       
        //sign.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        this.dispose();    
        match.a=JOptionPane.showConfirmDialog(null,"Confirm");
        System.out.println(row);
        System.out.println(match.a);
        
        if(match.a==0){
//        String eQ = "SELECT email_id FROM `signup` WHERE `ID` LIKE " + valueAt ;
//        String sQ="select  name,rollno,email_id,contactno,password from `signup` where ID="+sid;
//    try{
//    rs4 = stmt.executeQuery(sQ);
//                    while (rs4.next()) {
//                        name1=rs4.getString("name");
//                        rollno1=rs4.getString("rollno");
//                        email_id1=rs4.getString("email_id");
//                        contactno1=rs4.getString("contactno");
//                        password1=rs4.getString("password");
//                        
//                    }
//                    System.out.println(name1);System.out.println(rollno1);System.out.println(email_id1);System.out.println(contactno1);System.out.println(password1);
//                    
//                    // String iQ = "INSERT INTO `login`(`ID`) VALUES (" + sid + ")";
//                } catch (Exception e) {
//                    System.out.println(e);
//                }
   String eQ = "SELECT email_id FROM `signup` WHERE `ID` LIKE " + valueAt ;
        
            try{
            rs = stmt.executeQuery(eQ);
            while (rs.next()) {
                     RECIPIENT = rs.getString(1);
            }}
catch(Exception e){
            System.out.println(e);
}
            
         //     System.out.println("insertQuery= " + insertQuery);
        try {
            int result = stmt.executeUpdate(insHistory);
//            if (result == 1) {
//                
//            }

        } catch (SQLException ex) {
            // Logger.getLogger(studentlogic.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Exception " + ex);
        }
            System.out.println(RECIPIENT);
    String[] to = {RECIPIENT};
    
    String deleteQuery="DELETE FROM `helper` WHERE `sid` LIKE " + valueAt;
    try{
            //rs = stmt.executeQuery(deleteQuery);
              stmt.executeUpdate(deleteQuery);
   
    }
catch(Exception e){
            System.out.println(e);
}
    
            sendFromGMail(from, pass, to, subject, body);
//            try {
//stmt.close();
//        
//            conn.close();
//        } catch (SQLException ex) {
//    System.out.println(ex);            
////Logger.getLogger(logins.class.getName()).log(Level.SEVERE, null, ex);
//        }
        }
//        String[] to = {RECIPIENT};
//            sendFromGMail(from, pass, to, subject, body);
//        String eQ = "SELECT email_id FROM `signup` WHERE `ID` LIKE " + ID ;
//            try{
//            rs = stmt.executeQuery(eQ);
//            while (rs.next()) {
//                Email = rs.getString(3);
//            }}
//catch(Exception e){
//            System.out.println(e);
//}
//    }
        
        
       
        
    }//GEN-LAST:event_jTable1MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
 seeker mm=new seeker(sid);
        mm.setVisible(true);
        mm.pack();
        mm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();    
        // TODO add your handling code here:
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
            java.util.logging.Logger.getLogger(match.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(match.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(match.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(match.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        
//        String from = USER_NAME;
//        String pass = PASSWORD;
//        String[] to = {RECIPIENT}; // list of recipient email addresses
//        String subject = "HELLO umang";
//        String body = "How are you??Fine?";

//        sendFromGMail(from, pass, to, subject, body);
     java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new match().setVisible(true);
            }
        });
//    if(match.a==0){
//        sendFromGMail(from, pass, to, subject, body);
//    }
        
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
class Helpers extends match{
//private String name;
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//private int ID;

    public int getsid() {
        return sid;
    }

    public void setsid(int sid) {
        this.sid = sid;
    }
    private String MOT;
    
    private String name;
    private long contactNo;
     private String share;
    
    private String price;

    public String getShare() {
        return share;
    }

    public void setShare(String share) {
        this.share = share;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }
    

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getcontactNo() {
        return contactNo;
    }

    public void setcontactNo(long contactNo) {
        this.contactNo = contactNo;
    }
    private Time time;
    private String seatAvailable;
    private String vehicleNo;

    public String getMOT() {
        return MOT;
    }

    public void setMOT(String MOT) {
        this.MOT = MOT;
    }

    public Time getLt() {
        return lt;
    }

    public void setLt(Time lt) {
        this.lt=lt;
    }

    public String getSeatAvailable() {
        return seatAvailable;
    }

    public void setSeatAvailable(String seatAvailable) {
        this.seatAvailable = seatAvailable;
    }

    public String getVehicleNo() {
        return vehicleNo;
    }

    public void setVehicleNo(String vehicleNo) {
        this.vehicleNo = vehicleNo;
    }

}
