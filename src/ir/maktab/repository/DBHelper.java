package ir.maktab.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBHelper {
    private final static String URL = "jdbc:postgresql://127.0.0.1:5432/league_database";
    private final static String USER_NAME = "postgres";
    private final static String PASSWORD = "0023279397";

    public Connection connection() {

        try {
            return DriverManager.getConnection(URL, USER_NAME, PASSWORD);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }


    }
}
