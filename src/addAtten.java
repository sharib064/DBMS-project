import java.sql.*;
import javax.swing.JOptionPane;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author S
 */
public class addAtten extends javax.swing.JFrame {
    static int count=0;
    final boolean valid(){
        try {
                Class.forName("java.sql.DriverManager");
                Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3308/fsms");
                java.sql.Statement st=con.createStatement();
                String s=Admin.course;
                s+="a";
                String sql="select * from attendance";
                java.sql.ResultSet rs= st.executeQuery(sql);
                while(rs.next()){
                    if(rs.getString(3).equals(date.getText())){
                        return false;
                    }
                }
            }
            catch (Exception e) {
            
            }
        return true;
    }
    
    /**
     * Creates new form Home
     */
    public addAtten() {
        initComponents();
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
        rSButtonHover1 = new rojeru_san.complementos.RSButtonHover();
        jLabel4 = new javax.swing.JLabel();
        rSButtonHover2 = new rojeru_san.complementos.RSButtonHover();
        date = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        rSButtonHover3 = new rojeru_san.complementos.RSButtonHover();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        logout = new rojeru_san.complementos.RSButtonHover();
        home = new rojeru_san.complementos.RSButtonHover();
        info = new rojeru_san.complementos.RSButtonHover();
        mark = new rojeru_san.complementos.RSButtonHover();
        rSButtonHover10 = new rojeru_san.complementos.RSButtonHover();
        rSButtonHover11 = new rojeru_san.complementos.RSButtonHover();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        rSButtonHover1.setBackground(new java.awt.Color(255, 255, 255));
        rSButtonHover1.setText("X");
        rSButtonHover1.setColorHover(new java.awt.Color(255, 0, 0));
        rSButtonHover1.setColorText(new java.awt.Color(255, 0, 0));
        rSButtonHover1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rSButtonHover1MouseClicked(evt);
            }
        });
        jPanel1.add(rSButtonHover1, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 0, 40, 30));

        jLabel4.setFont(new java.awt.Font("Segoe UI Semibold", 0, 24)); // NOI18N
        jLabel4.setText("Enter Date");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 120, 130, 50));

        rSButtonHover2.setBackground(new java.awt.Color(102, 102, 102));
        rSButtonHover2.setText("Add");
        rSButtonHover2.setColorHover(new java.awt.Color(255, 0, 0));
        rSButtonHover2.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        rSButtonHover2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rSButtonHover2MouseClicked(evt);
            }
        });
        rSButtonHover2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButtonHover2ActionPerformed(evt);
            }
        });
        jPanel1.add(rSButtonHover2, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 120, 70, -1));

        date.setFont(new java.awt.Font("Segoe UI Semibold", 0, 24)); // NOI18N
        date.setToolTipText("");
        date.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(51, 51, 51)));
        date.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dateActionPerformed(evt);
            }
        });
        jPanel1.add(date, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 120, 420, 40));

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Enrollment ID", "Student ID", "First Name", "Last Name", "Attendance"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(table);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 190, 780, 430));

        rSButtonHover3.setBackground(new java.awt.Color(102, 102, 102));
        rSButtonHover3.setText("Submit");
        rSButtonHover3.setColorHover(new java.awt.Color(255, 0, 0));
        rSButtonHover3.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        rSButtonHover3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rSButtonHover3MouseClicked(evt);
            }
        });
        rSButtonHover3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButtonHover3ActionPerformed(evt);
            }
        });
        jPanel1.add(rSButtonHover3, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 640, 90, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 0, 900, 700));

        jPanel2.setBackground(new java.awt.Color(0, 204, 204));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/apprentice.png"))); // NOI18N
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 40, 210, -1));

        logout.setBackground(new java.awt.Color(102, 102, 102));
        logout.setBorder(null);
        logout.setText("Log out");
        logout.setColorHover(new java.awt.Color(255, 0, 0));
        logout.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        logout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logoutMouseClicked(evt);
            }
        });
        jPanel2.add(logout, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 640, 150, 50));

        home.setBackground(new java.awt.Color(0, 204, 204));
        home.setBorder(null);
        home.setText("Home");
        home.setColorHover(new java.awt.Color(102, 102, 102));
        home.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        home.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                homeMouseClicked(evt);
            }
        });
        jPanel2.add(home, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 190, 300, 50));

        info.setBackground(new java.awt.Color(0, 204, 204));
        info.setBorder(null);
        info.setText("All Student");
        info.setColorHover(new java.awt.Color(102, 102, 102));
        info.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        info.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                infoMouseClicked(evt);
            }
        });
        jPanel2.add(info, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 250, 300, 50));

        mark.setBackground(new java.awt.Color(0, 204, 204));
        mark.setBorder(null);
        mark.setText("Add Mark");
        mark.setColorHover(new java.awt.Color(102, 102, 102));
        mark.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        mark.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                markMouseClicked(evt);
            }
        });
        jPanel2.add(mark, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 370, 300, 50));

        rSButtonHover10.setBackground(new java.awt.Color(0, 204, 204));
        rSButtonHover10.setBorder(null);
        rSButtonHover10.setText("Finalize Grades");
        rSButtonHover10.setColorHover(new java.awt.Color(102, 102, 102));
        rSButtonHover10.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        rSButtonHover10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rSButtonHover10MouseClicked(evt);
            }
        });
        jPanel2.add(rSButtonHover10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 430, 300, 50));

        rSButtonHover11.setBackground(new java.awt.Color(0, 204, 204));
        rSButtonHover11.setBorder(null);
        rSButtonHover11.setText("Add Attendance");
        rSButtonHover11.setColorHover(new java.awt.Color(102, 102, 102));
        rSButtonHover11.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        rSButtonHover11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rSButtonHover11MouseClicked(evt);
            }
        });
        rSButtonHover11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButtonHover11ActionPerformed(evt);
            }
        });
        jPanel2.add(rSButtonHover11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 310, 300, 50));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 300, 700));

        setSize(new java.awt.Dimension(1200, 700));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void homeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeMouseClicked
        // TODO add your handling code here:
        dispose();
        new AdminHome().show();
    }//GEN-LAST:event_homeMouseClicked

    private void infoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_infoMouseClicked
        // TODO add your handling code here:
        dispose();
        new Student().show();
    }//GEN-LAST:event_infoMouseClicked

    private void markMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_markMouseClicked
        // TODO add your handling code here:
        dispose();
        new AddMark().show();
    }//GEN-LAST:event_markMouseClicked

    private void logoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutMouseClicked
        // TODO add your handling code here:
        dispose();
        new Login().show();
    }//GEN-LAST:event_logoutMouseClicked

    private void rSButtonHover1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rSButtonHover1MouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_rSButtonHover1MouseClicked

    private void rSButtonHover10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rSButtonHover10MouseClicked
        // TODO add your handling code here:
        dispose();
        new remove().show();
    }//GEN-LAST:event_rSButtonHover10MouseClicked

    private void rSButtonHover2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonHover2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rSButtonHover2ActionPerformed

    private void rSButtonHover2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rSButtonHover2MouseClicked
        // TODO add your handling code here:
        if(valid()){
                try {  
                    int i=0;
                    Class.forName("java.sql.DriverManager");
                    Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3308/fsms");
                    Statement st = con.createStatement();
                    String sql="SELECT e.enrollmentID,s.stdID,s.fname,s.lname FROM student s join enrollment e on(e.stdID=s.stdID) where e.teacherID="+Admin.course;
                    java.sql.ResultSet rs= st.executeQuery(sql);
                    while(rs.next()){
                        table.setValueAt(rs.getString(1),i,0);
                        table.setValueAt(rs.getString(2),i,1);
                        table.setValueAt(rs.getString(3),i,2);
                        table.setValueAt(rs.getString(4),i,3);
                        table.setValueAt("A",i++,4);
                        count++;
                    }
                } 
                catch(Exception e) {
                    JOptionPane.showMessageDialog(null, e.getMessage());
                }
        }
        else{
            JOptionPane.showMessageDialog(null, "Same date present already");
        }
    }//GEN-LAST:event_rSButtonHover2MouseClicked

    private void dateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dateActionPerformed

    private void rSButtonHover3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rSButtonHover3MouseClicked
        // TODO add your handling code here:
        
            try {
                String c=Admin.course;
                c+="a";
                int i=0,j=0;
                Class.forName("java.sql.DriverManager");
                Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3308/fsms");
                java.sql.Statement st=con.createStatement();
                String sms="INSERT INTO attendance VALUES (";//+table.getValueAt(j, count)+"','";
                for(j=0;j<count-1;j++){
                    sms+=table.getValueAt(j,0)+",'"+table.getValueAt(j, 4)+"','"+date.getText()+"'),(";
                }
                sms+=table.getValueAt(j,0)+",'"+table.getValueAt(j, 4)+"','"+date.getText()+"')";
                st.execute(sms);
                JOptionPane.showMessageDialog(null, "Attendance added");
            }
            catch (Exception e) {
                JOptionPane.showMessageDialog(null, e.getMessage());
            }
        
    }//GEN-LAST:event_rSButtonHover3MouseClicked

    private void rSButtonHover3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonHover3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rSButtonHover3ActionPerformed

    private void rSButtonHover11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rSButtonHover11MouseClicked
        // TODO add your handling code here:
        dispose();
        new addAtten().show();
    }//GEN-LAST:event_rSButtonHover11MouseClicked

    private void rSButtonHover11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonHover11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rSButtonHover11ActionPerformed

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
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField date;
    private rojeru_san.complementos.RSButtonHover home;
    private rojeru_san.complementos.RSButtonHover info;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private rojeru_san.complementos.RSButtonHover logout;
    private rojeru_san.complementos.RSButtonHover mark;
    private rojeru_san.complementos.RSButtonHover rSButtonHover1;
    private rojeru_san.complementos.RSButtonHover rSButtonHover10;
    private rojeru_san.complementos.RSButtonHover rSButtonHover11;
    private rojeru_san.complementos.RSButtonHover rSButtonHover2;
    private rojeru_san.complementos.RSButtonHover rSButtonHover3;
    private javax.swing.JTable table;
    // End of variables declaration//GEN-END:variables
}
