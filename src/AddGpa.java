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
public class AddGpa extends javax.swing.JFrame {
    static String sel="k213889";
    boolean valid(){
        if(Float.valueOf(s1.getText())>Float.valueOf(ts1.getText())){
            JOptionPane.showMessageDialog(null, "semester 1 gpa is higher than total");
            return false;
        }
        if(Float.valueOf(s2.getText())>Float.valueOf(ts2.getText())){
            JOptionPane.showMessageDialog(null, "semester 2 gpa is higher than total");
            return false;
        }
        if(Float.valueOf(s3.getText())>Float.valueOf(ts3.getText())){
            JOptionPane.showMessageDialog(null, "semester 3 gpa is higher than total");
            return false;
        }
        if(Float.valueOf(s4.getText())>Float.valueOf(ts4.getText())){
            JOptionPane.showMessageDialog(null, "semester 4 gpa is higher than total");
            return false;
        }
        if(Float.valueOf(s5.getText())>Float.valueOf(ts5.getText())){
            JOptionPane.showMessageDialog(null, "semester 5 gpa is higher than total");
            return false;
        }
        if(Float.valueOf(s6.getText())>Float.valueOf(ts6.getText())){
            JOptionPane.showMessageDialog(null, "semester 6 gpa is higher than total");
            return false;
        }
        if(Float.valueOf(s7.getText())>Float.valueOf(ts7.getText())){
            JOptionPane.showMessageDialog(null, "semester 7 gpa is higher than total");
            return false;
        }
        if(Float.valueOf(s8.getText())>Float.valueOf(ts8.getText())){
            JOptionPane.showMessageDialog(null, "semester 8 gpa is higher than total");
            return false;
        }
        return true;
    }
    final void print(){
        try {
                Class.forName("java.sql.DriverManager");
                Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/sms");
                java.sql.Statement st=con.createStatement();
                String sql="select * from GPA";
                java.sql.ResultSet rs= st.executeQuery(sql);
                while(rs.next()){
                    if(rs.getString(1).equals(sel)){
                        s1.setText(rs.getString(2));
                        s2.setText(rs.getString(3));
                        s3.setText(rs.getString(4));
                        s4.setText(rs.getString(5));
                        s5.setText(rs.getString(6));
                        s6.setText(rs.getString(7));
                        s7.setText(rs.getString(8));
                        s8.setText(rs.getString(9));
                    }
                }
            }
            catch (Exception e) {
            
            }
    }
    final void init(){
        try {
                Class.forName("java.sql.DriverManager");
                Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/sms");
                java.sql.Statement st=con.createStatement();
                String sql="select * from info";
                java.sql.ResultSet rs= st.executeQuery(sql);
                while(rs.next()){
                    jComboBox2.addItem(rs.getString(6));
                }
            }
            catch (Exception e) {
            
            }
    }
    final void add(){
            try {
                Class.forName("java.sql.DriverManager");
                Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/sms");
                PreparedStatement ps = con.prepareStatement("UPDATE GPA SET sem1 = ? WHERE rolllno = ?");
                ps.setObject(1, s1.getText()); 
                ps.setString(2, sel);
                ps.executeUpdate();
                ps = con.prepareStatement("UPDATE GPA SET sem2 = ? WHERE rolllno = ?");
                ps.setObject(1, s2.getText()); 
                ps.setString(2, sel);
                ps.executeUpdate();
                ps = con.prepareStatement("UPDATE GPA SET sem3 = ? WHERE rolllno = ?");
                ps.setObject(1, s3.getText()); 
                ps.setString(2, sel);
                ps.executeUpdate();
                ps = con.prepareStatement("UPDATE GPA SET sem4 = ? WHERE rolllno = ?");
                ps.setObject(1, s4.getText()); 
                ps.setString(2, sel);
                ps.executeUpdate();
                ps = con.prepareStatement("UPDATE GPA SET sem5 = ? WHERE rolllno = ?");
                ps.setObject(1, s5.getText()); 
                ps.setString(2, sel);
                ps.executeUpdate();
                ps = con.prepareStatement("UPDATE GPA SET sem6 = ? WHERE rolllno = ?");
                ps.setObject(1, s6.getText()); 
                ps.setString(2, sel);
                ps.executeUpdate();
                ps = con.prepareStatement("UPDATE GPA SET sem7 = ? WHERE rolllno = ?");
                ps.setObject(1, s7.getText()); 
                ps.setString(2, sel);
                ps.executeUpdate();
                ps = con.prepareStatement("UPDATE GPA SET sem8 = ? WHERE rolllno = ?");
                ps.setObject(1, s8.getText()); 
                ps.setString(2, sel);
                ps.executeUpdate();
                JOptionPane.showMessageDialog(null, sel+" Gpa updated");
            }
            catch (Exception e) {
                JOptionPane.showMessageDialog(null, e.getMessage());
            }
    }
    /**
     * Creates new form Home
     */
    public AddGpa() {
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
        attendance = new rojeru_san.complementos.RSButtonHover();
        mark = new rojeru_san.complementos.RSButtonHover();
        gpa = new rojeru_san.complementos.RSButtonHover();
        rSButtonHover10 = new rojeru_san.complementos.RSButtonHover();
        logout = new rojeru_san.complementos.RSButtonHover();
        rSButtonHover11 = new rojeru_san.complementos.RSButtonHover();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();
        f = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        m2 = new javax.swing.JLabel();
        a = new javax.swing.JLabel();
        p = new javax.swing.JLabel();
        quiz1 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        jPanel22 = new javax.swing.JPanel();
        jPanel12 = new javax.swing.JPanel();
        jPanel13 = new javax.swing.JPanel();
        jPanel14 = new javax.swing.JPanel();
        jPanel16 = new javax.swing.JPanel();
        jPanel17 = new javax.swing.JPanel();
        jPanel18 = new javax.swing.JPanel();
        jPanel19 = new javax.swing.JPanel();
        jPanel20 = new javax.swing.JPanel();
        m1 = new javax.swing.JLabel();
        ts3 = new javax.swing.JLabel();
        ts4 = new javax.swing.JLabel();
        ts5 = new javax.swing.JLabel();
        ts6 = new javax.swing.JLabel();
        ts7 = new javax.swing.JLabel();
        ts8 = new javax.swing.JLabel();
        jPanel21 = new javax.swing.JPanel();
        rSButtonHover1 = new rojeru_san.complementos.RSButtonHover();
        jLabel5 = new javax.swing.JLabel();
        s8 = new javax.swing.JTextField();
        s3 = new javax.swing.JTextField();
        s4 = new javax.swing.JTextField();
        s5 = new javax.swing.JTextField();
        s6 = new javax.swing.JTextField();
        s7 = new javax.swing.JTextField();
        logout1 = new rojeru_san.complementos.RSButtonHover();
        jPanel15 = new javax.swing.JPanel();
        jPanel23 = new javax.swing.JPanel();
        jPanel24 = new javax.swing.JPanel();
        m3 = new javax.swing.JLabel();
        s1 = new javax.swing.JTextField();
        ts1 = new javax.swing.JLabel();
        m4 = new javax.swing.JLabel();
        s2 = new javax.swing.JTextField();
        ts2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/apprentice.png"))); // NOI18N
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 40, 210, -1));

        home.setBackground(new java.awt.Color(51, 51, 51));
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
        jPanel2.add(home, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 190, 300, 50));

        info.setBackground(new java.awt.Color(51, 51, 51));
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
        jPanel2.add(info, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 250, 300, 50));

        attendance.setBackground(new java.awt.Color(51, 51, 51));
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
        jPanel2.add(attendance, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 310, 300, 50));

        mark.setBackground(new java.awt.Color(51, 51, 51));
        mark.setBorder(null);
        mark.setText("Add Marks");
        mark.setColorHover(new java.awt.Color(204, 102, 0));
        mark.setColorTextHover(new java.awt.Color(51, 51, 51));
        mark.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        mark.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                markMouseClicked(evt);
            }
        });
        jPanel2.add(mark, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 370, 300, 50));

        gpa.setBackground(new java.awt.Color(51, 51, 51));
        gpa.setBorder(null);
        gpa.setText("Add GPA");
        gpa.setColorHover(new java.awt.Color(204, 102, 0));
        gpa.setColorTextHover(new java.awt.Color(51, 51, 51));
        gpa.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        gpa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                gpaMouseClicked(evt);
            }
        });
        jPanel2.add(gpa, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 430, 300, 50));

        rSButtonHover10.setBackground(new java.awt.Color(51, 51, 51));
        rSButtonHover10.setBorder(null);
        rSButtonHover10.setText("Remove Student");
        rSButtonHover10.setColorHover(new java.awt.Color(204, 102, 0));
        rSButtonHover10.setColorTextHover(new java.awt.Color(51, 51, 51));
        rSButtonHover10.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        rSButtonHover10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rSButtonHover10MouseClicked(evt);
            }
        });
        rSButtonHover10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButtonHover10ActionPerformed(evt);
            }
        });
        jPanel2.add(rSButtonHover10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 550, 300, 50));

        logout.setBackground(new java.awt.Color(51, 51, 51));
        logout.setBorder(null);
        logout.setText("Log out");
        logout.setColorHover(new java.awt.Color(204, 102, 0));
        logout.setColorTextHover(new java.awt.Color(51, 51, 51));
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

        rSButtonHover11.setBackground(new java.awt.Color(51, 51, 51));
        rSButtonHover11.setBorder(null);
        rSButtonHover11.setText("Add Attendance");
        rSButtonHover11.setColorHover(new java.awt.Color(204, 102, 0));
        rSButtonHover11.setColorTextHover(new java.awt.Color(51, 51, 51));
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
        jPanel2.add(rSButtonHover11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 490, 300, 50));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 300, 700));

        jPanel1.setBackground(new java.awt.Color(204, 102, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Total");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 70, 210, 50));

        jComboBox2.setBackground(new java.awt.Color(204, 102, 0));
        jComboBox2.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jComboBox2.setForeground(new java.awt.Color(255, 255, 255));
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "none" }));
        jComboBox2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jComboBox2.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBox2ItemStateChanged(evt);
            }
        });
        jPanel1.add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 10, 190, 40));

        f.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        f.setForeground(new java.awt.Color(255, 255, 255));
        f.setText("Semester 6");
        jPanel1.add(f, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 550, 150, 50));

        jLabel6.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Obtained");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 70, 190, 50));

        m2.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        m2.setForeground(new java.awt.Color(255, 255, 255));
        m2.setText("Semester 4");
        jPanel1.add(m2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 310, 150, 50));

        a.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        a.setForeground(new java.awt.Color(255, 255, 255));
        a.setText("Semester 5");
        jPanel1.add(a, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 370, 150, 50));

        p.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        p.setForeground(new java.awt.Color(255, 255, 255));
        p.setText("Semester 4");
        jPanel1.add(p, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 430, 150, 50));

        quiz1.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        quiz1.setForeground(new java.awt.Color(255, 255, 255));
        quiz1.setText("Semester 5");
        jPanel1.add(quiz1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 490, 150, 50));

        jPanel9.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 70, 10, 530));

        jPanel10.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 70, 10, 530));

        jPanel11.setBackground(new java.awt.Color(51, 51, 51));

        jPanel22.setBackground(new java.awt.Color(51, 51, 51));
        jPanel11.add(jPanel22);

        jPanel1.add(jPanel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 60, 660, 10));

        jPanel12.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.add(jPanel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 300, 640, 10));

        jPanel13.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.add(jPanel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 70, 10, 530));

        jPanel14.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.add(jPanel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 240, 640, 10));

        jPanel16.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.add(jPanel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 540, 640, 10));

        jPanel17.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.add(jPanel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 480, 650, 10));

        jPanel18.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.add(jPanel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 420, 640, 10));

        jPanel19.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.add(jPanel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 360, 640, 10));

        jPanel20.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.add(jPanel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 70, 10, 530));

        m1.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        m1.setForeground(new java.awt.Color(255, 255, 255));
        m1.setText("Semester 3");
        jPanel1.add(m1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 250, 150, 50));

        ts3.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        ts3.setForeground(new java.awt.Color(255, 255, 255));
        ts3.setText("4");
        jPanel1.add(ts3, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 250, 220, 50));

        ts4.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        ts4.setForeground(new java.awt.Color(255, 255, 255));
        ts4.setText("4");
        jPanel1.add(ts4, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 310, 220, 50));

        ts5.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        ts5.setForeground(new java.awt.Color(255, 255, 255));
        ts5.setText("4");
        jPanel1.add(ts5, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 370, 220, 50));

        ts6.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        ts6.setForeground(new java.awt.Color(255, 255, 255));
        ts6.setText("4");
        jPanel1.add(ts6, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 430, 220, 50));

        ts7.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        ts7.setForeground(new java.awt.Color(255, 255, 255));
        ts7.setText("4");
        jPanel1.add(ts7, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 490, 220, 50));

        ts8.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        ts8.setForeground(new java.awt.Color(255, 255, 255));
        ts8.setText("4");
        jPanel1.add(ts8, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 550, 220, 50));

        jPanel21.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.add(jPanel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 600, 660, 10));

        rSButtonHover1.setBackground(new java.awt.Color(204, 102, 0));
        rSButtonHover1.setText("X");
        rSButtonHover1.setColorHover(new java.awt.Color(51, 51, 51));
        rSButtonHover1.setColorTextHover(new java.awt.Color(204, 102, 0));
        rSButtonHover1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rSButtonHover1MouseClicked(evt);
            }
        });
        jPanel1.add(rSButtonHover1, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 0, 40, 30));

        jLabel5.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Student ID");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 10, 130, 40));

        s8.setBackground(new java.awt.Color(204, 102, 0));
        s8.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        s8.setForeground(new java.awt.Color(255, 255, 255));
        s8.setText("0");
        s8.setBorder(null);
        jPanel1.add(s8, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 550, 220, 50));

        s3.setBackground(new java.awt.Color(204, 102, 0));
        s3.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        s3.setForeground(new java.awt.Color(255, 255, 255));
        s3.setText("0");
        s3.setBorder(null);
        jPanel1.add(s3, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 250, 220, 50));

        s4.setBackground(new java.awt.Color(204, 102, 0));
        s4.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        s4.setForeground(new java.awt.Color(255, 255, 255));
        s4.setText("0");
        s4.setBorder(null);
        s4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                s4ActionPerformed(evt);
            }
        });
        jPanel1.add(s4, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 310, 220, 50));

        s5.setBackground(new java.awt.Color(204, 102, 0));
        s5.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        s5.setForeground(new java.awt.Color(255, 255, 255));
        s5.setText("0");
        s5.setBorder(null);
        jPanel1.add(s5, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 370, 220, 50));

        s6.setBackground(new java.awt.Color(204, 102, 0));
        s6.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        s6.setForeground(new java.awt.Color(255, 255, 255));
        s6.setText("0");
        s6.setBorder(null);
        jPanel1.add(s6, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 430, 220, 50));

        s7.setBackground(new java.awt.Color(204, 102, 0));
        s7.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        s7.setForeground(new java.awt.Color(255, 255, 255));
        s7.setText("0");
        s7.setBorder(null);
        jPanel1.add(s7, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 490, 220, 50));

        logout1.setBackground(new java.awt.Color(51, 51, 51));
        logout1.setBorder(null);
        logout1.setText("Add");
        logout1.setColorHover(new java.awt.Color(204, 102, 0));
        logout1.setColorTextHover(new java.awt.Color(51, 51, 51));
        logout1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        logout1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logout1MouseClicked(evt);
            }
        });
        jPanel1.add(logout1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 630, 150, 50));

        jPanel15.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.add(jPanel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 180, 660, 10));

        jPanel23.setBackground(new java.awt.Color(51, 51, 51));

        jPanel24.setBackground(new java.awt.Color(51, 51, 51));
        jPanel23.add(jPanel24);

        jPanel1.add(jPanel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 120, 660, 10));

        m3.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        m3.setForeground(new java.awt.Color(255, 255, 255));
        m3.setText("Semester 1:");
        jPanel1.add(m3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 130, 150, 50));

        s1.setBackground(new java.awt.Color(204, 102, 0));
        s1.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        s1.setForeground(new java.awt.Color(255, 255, 255));
        s1.setText("0");
        s1.setBorder(null);
        jPanel1.add(s1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 130, 220, 50));

        ts1.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        ts1.setForeground(new java.awt.Color(255, 255, 255));
        ts1.setText("4");
        jPanel1.add(ts1, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 130, 220, 50));

        m4.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        m4.setForeground(new java.awt.Color(255, 255, 255));
        m4.setText("Semester 2");
        jPanel1.add(m4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 190, 150, 50));

        s2.setBackground(new java.awt.Color(204, 102, 0));
        s2.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        s2.setForeground(new java.awt.Color(255, 255, 255));
        s2.setText("0");
        s2.setBorder(null);
        jPanel1.add(s2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 190, 220, 50));

        ts2.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        ts2.setForeground(new java.awt.Color(255, 255, 255));
        ts2.setText("4");
        jPanel1.add(ts2, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 190, 220, 50));

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

    private void attendanceMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_attendanceMouseClicked
        // TODO add your handling code here:
        dispose();
        new AddStudent().show();
    }//GEN-LAST:event_attendanceMouseClicked

    private void markMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_markMouseClicked
        // TODO add your handling code here:
        dispose();
        new AddMark().show();
    }//GEN-LAST:event_markMouseClicked

    private void gpaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_gpaMouseClicked
        // TODO add your handling code here:
        dispose();
        new AddGpa().show();
    }//GEN-LAST:event_gpaMouseClicked

    private void logoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutMouseClicked
        // TODO add your handling code here:
        dispose();
        new Login().show();
    }//GEN-LAST:event_logoutMouseClicked

    private void logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_logoutActionPerformed

    private void logout1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logout1MouseClicked
        // TODO add your handling code here:
        if(valid()){
            add();
        }
    }//GEN-LAST:event_logout1MouseClicked

    private void rSButtonHover1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rSButtonHover1MouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_rSButtonHover1MouseClicked

    private void jComboBox2ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBox2ItemStateChanged
        // TODO add your handling code here:
        sel=(String) jComboBox2.getSelectedItem();
        print();
    }//GEN-LAST:event_jComboBox2ItemStateChanged

    private void s4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_s4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_s4ActionPerformed

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

    private void rSButtonHover10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonHover10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rSButtonHover10ActionPerformed

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
    private javax.swing.JLabel a;
    private rojeru_san.complementos.RSButtonHover attendance;
    private javax.swing.JLabel f;
    private rojeru_san.complementos.RSButtonHover gpa;
    private rojeru_san.complementos.RSButtonHover home;
    private rojeru_san.complementos.RSButtonHover info;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel22;
    private javax.swing.JPanel jPanel23;
    private javax.swing.JPanel jPanel24;
    private javax.swing.JPanel jPanel9;
    private rojeru_san.complementos.RSButtonHover logout;
    private rojeru_san.complementos.RSButtonHover logout1;
    private javax.swing.JLabel m1;
    private javax.swing.JLabel m2;
    private javax.swing.JLabel m3;
    private javax.swing.JLabel m4;
    private rojeru_san.complementos.RSButtonHover mark;
    private javax.swing.JLabel p;
    private javax.swing.JLabel quiz1;
    private rojeru_san.complementos.RSButtonHover rSButtonHover1;
    private rojeru_san.complementos.RSButtonHover rSButtonHover10;
    private rojeru_san.complementos.RSButtonHover rSButtonHover11;
    private javax.swing.JTextField s1;
    private javax.swing.JTextField s2;
    private javax.swing.JTextField s3;
    private javax.swing.JTextField s4;
    private javax.swing.JTextField s5;
    private javax.swing.JTextField s6;
    private javax.swing.JTextField s7;
    private javax.swing.JTextField s8;
    private javax.swing.JLabel ts1;
    private javax.swing.JLabel ts2;
    private javax.swing.JLabel ts3;
    private javax.swing.JLabel ts4;
    private javax.swing.JLabel ts5;
    private javax.swing.JLabel ts6;
    private javax.swing.JLabel ts7;
    private javax.swing.JLabel ts8;
    // End of variables declaration//GEN-END:variables
}
