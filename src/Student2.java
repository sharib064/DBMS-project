
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
public class Student2 extends javax.swing.JFrame {

    /**
     * Creates new form Home
     */
    public Student2() {
        initComponents();
        int i=0;
        try {
            Class.forName("java.sql.DriverManager");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3308/fsms");
            java.sql.Statement st=con.createStatement();
            String sql="select * from student";
            java.sql.ResultSet rs= st.executeQuery(sql);
            while(rs.next()){
                jTable1.setValueAt(rs.getString(1), i, 0);
                jTable1.setValueAt(rs.getString(2), i, 1);
                jTable1.setValueAt(rs.getString(3), i, 2);
                jTable1.setValueAt(rs.getString(7), i, 3);
                jTable1.setValueAt(rs.getString(8), i, 4);
                jTable1.setValueAt(rs.getString(12), i, 5);
                i++;
            }
        }
        catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
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
        profile = new javax.swing.JLabel();
        rSButtonHover1 = new rojeru_san.complementos.RSButtonHover();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        logout = new rojeru_san.complementos.RSButtonHover();
        home = new rojeru_san.complementos.RSButtonHover();
        info = new rojeru_san.complementos.RSButtonHover();
        attendance = new rojeru_san.complementos.RSButtonHover();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        profile.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/user (2).png"))); // NOI18N
        jPanel1.add(profile, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 20, -1, -1));

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

        jTable1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Student ID", "First name", "Last name", "Email", "Address", "NIC"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.setRowHeight(25);
        jScrollPane1.setViewportView(jTable1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, 820, 470));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 0, 900, 680));

        jPanel2.setBackground(new java.awt.Color(0, 204, 204));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/apprentice.png"))); // NOI18N
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 50, 140, -1));

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
        logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutActionPerformed(evt);
            }
        });
        jPanel2.add(logout, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 610, 150, 50));

        home.setBackground(new java.awt.Color(0, 204, 204));
        home.setBorder(null);
        home.setText("Home");
        home.setColorHover(new java.awt.Color(204, 102, 0));
        home.setColorTextHover(new java.awt.Color(51, 51, 51));
        home.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        home.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                homeMouseClicked(evt);
            }
        });
        jPanel2.add(home, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 280, 300, 50));

        info.setBackground(new java.awt.Color(0, 204, 204));
        info.setBorder(null);
        info.setText("All Student");
        info.setColorHover(new java.awt.Color(204, 102, 0));
        info.setColorTextHover(new java.awt.Color(51, 51, 51));
        info.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        info.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                infoMouseClicked(evt);
            }
        });
        info.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                infoActionPerformed(evt);
            }
        });
        jPanel2.add(info, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 360, 300, 50));

        attendance.setBackground(new java.awt.Color(0, 204, 204));
        attendance.setBorder(null);
        attendance.setText("Add Student");
        attendance.setColorHover(new java.awt.Color(204, 102, 0));
        attendance.setColorTextHover(new java.awt.Color(51, 51, 51));
        attendance.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        attendance.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                attendanceMouseClicked(evt);
            }
        });
        jPanel2.add(attendance, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 440, 300, 50));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 300, 680));

        setSize(new java.awt.Dimension(1200, 678));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void homeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeMouseClicked
        // TODO add your handling code here:
        dispose();
        new Admin2().show();
    }//GEN-LAST:event_homeMouseClicked

    private void infoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_infoMouseClicked
        // TODO add your handling code here:
        dispose();
        new Student2().show();
    }//GEN-LAST:event_infoMouseClicked

    private void attendanceMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_attendanceMouseClicked
        // TODO add your handling code here:
        dispose();
        new AddStudent().show();
    }//GEN-LAST:event_attendanceMouseClicked

    private void logoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutMouseClicked
        // TODO add your handling code here:
        dispose();
        new Login().show();
    }//GEN-LAST:event_logoutMouseClicked

    private void rSButtonHover1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rSButtonHover1MouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_rSButtonHover1MouseClicked

    private void logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_logoutActionPerformed

    private void infoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_infoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_infoActionPerformed

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
    private rojeru_san.complementos.RSButtonHover attendance;
    private rojeru_san.complementos.RSButtonHover home;
    private rojeru_san.complementos.RSButtonHover info;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private rojeru_san.complementos.RSButtonHover logout;
    private javax.swing.JLabel profile;
    private rojeru_san.complementos.RSButtonHover rSButtonHover1;
    // End of variables declaration//GEN-END:variables
}
