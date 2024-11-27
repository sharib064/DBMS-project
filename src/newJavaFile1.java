import java.sql.*;

public class newJavaFile1 {

    public static void main(String args[]) {
        boolean flag = false;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver"); // Corrected the driver class name
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/fsms");
            Statement st = con.createStatement();
            String sql = "SELECT S.*,D.departName FROM STUDENT S JOIN department D ON (D.departmentID = S.departmentID) WHERE stdID = 201";
            ResultSet rs = st.executeQuery(sql);

            // Move the cursor to the first row
            if (rs.next()) {
                // Retrieve data after moving the cursor
                System.out.println(rs.getString(12));
            } else {
                System.out.println("No data found");
            }

            // Close resources
            rs.close();
            st.close();
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
