package JD;

import java.sql.*;


/**
 * Created by SCIP on 24.07.2016.
 */
public class Main {
    public static void main(String[] args) throws SQLException {
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/sys", "root","4820087");
    }
}
