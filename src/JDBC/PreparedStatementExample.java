package JDBC;

import java.io.FileInputStream;
import java.sql.*;
import java.util.Properties;

public class PreparedStatementExample {
    /*
    Prevent SQL Injection
     */
    public static void main(String[] args) throws Exception {
        try {
            //Step 1: Download the jar file and add it to libraries of your project(IntelliJ)
            Class.forName("com.mysql.cj.jdbc.Driver");

            Properties props = new Properties();
            FileInputStream fis = new FileInputStream("src/JDBC/config.properties");
            props.load(fis);

            String url = props.getProperty("db.url");
            String user = props.getProperty("db.user");
            String pass = props.getProperty("db.password");

            Connection con = DriverManager.getConnection(url, user, pass);

            //Statement stmt = con.createStatement();
            String sql = "INSERT INTO accounts(name, balance) VALUES(?, ?)";

            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, "Mahesh");
            ps.setDouble(2, 15000);

            int rows = ps.executeUpdate();
            System.out.println(rows + " row inserted");


            ps.close();
            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
