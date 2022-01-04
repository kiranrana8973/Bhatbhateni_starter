package database;

import java.sql.*;

public class DbConnection {

    Connection con;
    Statement st;
    ResultSet rows;
    int val;

    public DbConnection() {
        // register the driver class
        try {
            String username = "root";
            String password = "mypassword";
            Class.forName("com.mysql.cj.jdbc.Driver");
            // create the connection object
            con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/bhatbhateni?characterEncoding=utf8&useSSL=false&autoReconnect=true",
                    username, null);
            if (con != null) {
                System.out.println("Connected to BhatBhateni Database");
            } else {
                System.out.println("Error connecting Database");
            }

            // creating statement object
            st = con.createStatement();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // Used for insert, update, delete
    public int maniulate(String query) {

        try {
            val = st.executeUpdate(query);
            con.close();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

        return val;
    }
    // Used for select
    public ResultSet retrieve(String query) {
        try {
            rows = st.executeQuery(query);
            con.close();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return rows;
    }
    public static void main(String[] args) {
        new DbConnection();
    }
}


