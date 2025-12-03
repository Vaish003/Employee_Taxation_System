package com.serviceimpl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DB_Connection {
    public static Connection get_DBconnect() throws Exception {
        Connection con = null;
        try {
            Class.forName("oracle.jdbc.OracleDriver");
            String url = "jdbc:oracle:thin:@localhost:1521:XE";
            String user = "system";
            String pass = "Vaishnavi";
            con = DriverManager.getConnection(url, user, pass);

        } catch (ClassNotFoundException e) {
            System.out.println(e.getStackTrace());
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return con;

    }
}
