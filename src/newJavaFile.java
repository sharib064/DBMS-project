
import java.sql.*;
import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

/**
 *
 * @author Sharib
 */
public class newJavaFile {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // TODO code application logic here
        ArrayList<String> recipeT = new ArrayList<>();
    ArrayList<String> recipeI = new ArrayList<>();
    ArrayList<String> recipeD = new ArrayList<>();
    try {
        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sms");
        Statement st = con.createStatement();
        String sql = "select * from info";
        ResultSet rs1 = st.executeQuery(sql);

        while (rs1.next()) {
            recipeT.add(rs1.getString(1));
            recipeI.add(rs1.getString(2));
            recipeD.add(rs1.getString(3));
        }

        con.close();
    } catch (Exception e) {
        e.printStackTrace();
    }
        System.out.println(recipeT.get(0));
    }
}
