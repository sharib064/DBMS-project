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
public class AddMark extends javax.swing.JFrame {
    static String sel="k213889";
    int count=0;
    boolean valid(){
        return true;
    }
    boolean valid2(){
        for(int i=0;i<count;i++){
            if((Integer) table.getValueAt(i, 4)>Integer.valueOf(date1.getText())){
                return false;
            }
        }
        return true;
    }
    final void init(){
        
    }
    final void print(){
        try {
                Class.forName("java.sql.DriverManager");
                Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3308/fsms");
                java.sql.Statement st=con.createStatement();
                String sql="select * from "+Admin.course;
                java.sql.ResultSet rs= st.executeQuery(sql);
                while(rs.next()){
                    
                }
            }
            catch (Exception e) {
            
            }
    }
    final void add(){
            try {
                String c=Admin.course;
                c+="a";
                int i=0,j=0;
                Class.forName("java.sql.DriverManager");
                Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3308/fsms");
                java.sql.Statement st=con.createStatement();
                String sms="INSERT INTO marks VALUES (";//+table.getValueAt(j, count)+"','";
                for(j=0;j<count-1;j++){
                    sms+=table.getValueAt(j,0)+",'"+date.getText()+"',"+date1.getText()+","+table.getValueAt(j, 4)+"),(";
                }
                sms+=table.getValueAt(j,0)+",'"+date.getText()+"',"+date1.getText()+","+table.getValueAt(j, 4)+")";
                st.execute(sms);
                JOptionPane.showMessageDialog(null, "Marks added");
            }
            catch (Exception e) {
                JOptionPane.showMessageDialog(null, e.getMessage());
            }
    }
    /**
     * Creates new form Home
     */
    public AddMark() {
        initComponents();
        init();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        home = new rojeru_san.complementos.RSButtonHover();
        info = new rojeru_san.complementos.RSButtonHover();
        mark = new rojeru_san.complementos.RSButtonHover();
        rSButtonHover10 = new rojeru_san.complementos.RSButtonHover();
        logout = new rojeru_san.complementos.RSButtonHover();
        rSButtonHover11 = new rojeru_san.complementos.RSButtonHover();
        jPanel1 = new javax.swing.JPanel();
        rSButtonHover1 = new rojeru_san.complementos.RSButtonHover();
        logout1 = new rojeru_san.complementos.RSButtonHover();
        jLabel2 = new javax.swing.JLabel();
        date = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        date1 = new javax.swing.JTextField();
        rSButtonHover2 = new rojeru_san.complementos.RSButtonHover();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(0, 204, 204));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/apprentice.png"))); // NOI18N
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 40, 210, -1));

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
        jPanel2.add(home, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 220, 300, 50));

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
        jPanel2.add(info, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 280, 300, 50));

        mark.setBackground(new java.awt.Color(0, 204, 204));
        mark.setBorder(null);
        mark.setText("Add Marks");
        mark.setColorHover(new java.awt.Color(102, 102, 102));
        mark.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        mark.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                markMouseClicked(evt);
            }
        });
        mark.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                markActionPerformed(evt);
            }
        });
        jPanel2.add(mark, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 400, 300, 50));

        rSButtonHover10.setBackground(new java.awt.Color(0, 204, 204));
        rSButtonHover10.setBorder(null);
        rSButtonHover10.setText("Finalize Grade");
        rSButtonHover10.setColorHover(new java.awt.Color(102, 102, 102));
        rSButtonHover10.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        rSButtonHover10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rSButtonHover10MouseClicked(evt);
            }
        });
        jPanel2.add(rSButtonHover10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 460, 300, 50));

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
        jPanel2.add(logout, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 640, 150, 50));

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
        jPanel2.add(rSButtonHover11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 340, 300, 50));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 300, 700));

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

        logout1.setBackground(new java.awt.Color(102, 102, 102));
        logout1.setBorder(null);
        logout1.setText("Add");
        logout1.setColorHover(new java.awt.Color(255, 0, 0));
        logout1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        logout1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logout1MouseClicked(evt);
            }
        });
        jPanel1.add(logout1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 630, 150, 50));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Title:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 60, 90, 30));

        date.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        date.setToolTipText("");
        date.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(51, 51, 51)));
        date.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dateActionPerformed(evt);
            }
        });
        jPanel1.add(date, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 60, 260, 30));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("Total marks:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 100, 90, 30));

        date1.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        date1.setToolTipText("");
        date1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(51, 51, 51)));
        date1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                date1ActionPerformed(evt);
            }
        });
        jPanel1.add(date1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 100, 260, 30));

        rSButtonHover2.setBackground(new java.awt.Color(102, 102, 102));
        rSButtonHover2.setText("Create");
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
        jPanel1.add(rSButtonHover2, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 90, 90, -1));

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
                "Enrollment ID", "Student ID", "First Name", "Last Name", "Marks Obtained"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class
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

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 0, 900, 700));

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

    private void logout1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logout1MouseClicked
        // TODO add your handling code here:
        if(valid2()){
            add();
        }
    }//GEN-LAST:event_logout1MouseClicked

    private void logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_logoutActionPerformed

    private void rSButtonHover10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rSButtonHover10MouseClicked
        // TODO add your handling code here:
        dispose();
        new remove().show();
    }//GEN-LAST:event_rSButtonHover10MouseClicked

    private void rSButtonHover11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rSButtonHover11MouseClicked
        // TODO add your handling code here:
        dispose();
        new addAtten().show();
    }//GEN-LAST:event_rSButtonHover11MouseClicked

    private void rSButtonHover11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonHover11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rSButtonHover11ActionPerformed

    private void markActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_markActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_markActionPerformed

    private void dateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dateActionPerformed

    private void date1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_date1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_date1ActionPerformed

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
                    table.setValueAt(0,i++,4);
                    count++;
                }
            }
            catch(Exception e) {
                JOptionPane.showMessageDialog(null, e.getMessage());
            }
        }
        else{
            JOptionPane.showMessageDialog(null, "Error");
        }
    }//GEN-LAST:event_rSButtonHover2MouseClicked

    private void rSButtonHover2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonHover2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rSButtonHover2ActionPerformed

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
    private javax.swing.JTextField date1;
    private rojeru_san.complementos.RSButtonHover home;
    private rojeru_san.complementos.RSButtonHover info;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private rojeru_san.complementos.RSButtonHover logout;
    private rojeru_san.complementos.RSButtonHover logout1;
    private rojeru_san.complementos.RSButtonHover mark;
    private rojeru_san.complementos.RSButtonHover rSButtonHover1;
    private rojeru_san.complementos.RSButtonHover rSButtonHover10;
    private rojeru_san.complementos.RSButtonHover rSButtonHover11;
    private rojeru_san.complementos.RSButtonHover rSButtonHover2;
    private javax.swing.JTable table;
    // End of variables declaration//GEN-END:variables
}
