package JDBC;

import java.io.FileInputStream;
import java.sql.*;
import java.util.Properties;

public class SimpleJDBC {
    /*
    JDBC (Java Database Connectivity) is the Java API used to connect and interact with databases.
    It allows Java programs to:
    -> Connect to the database
    -> Send SQL queries
    -> Insert, update, delete data
    -> Fetch results
    -> Close the connection safely
    Architecture: Your Java Code → JDBC API → JDBC Driver → Database (MySQL)
     */
    public static void main(String[] args) {
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

            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM accounts");

            while (rs.next()) {
                System.out.println(rs.getInt("id") + " - " +
                        rs.getString("name") + " - " +
                        rs.getDouble("balance"));
            }

            rs.close();
            stmt.close();
            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
