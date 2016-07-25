package JD.Dao;



import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Created by SCIP on 24.07.2016.
 */
public class SingleConnection {
    public static final SingleConnection INSTANCE = new SingleConnection();
    private Connection connection;
    private SingleConnection() {
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost/sys",
                    "root", "4820087");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private void createTableProduct() throws SQLException {
        if (connection != null){
            Statement statement = connection.createStatement();
            statement.execute("CREATE TABLE IF NOT EXISTS Product("
            + "id INT PRIMARY KEY auto_increment,"
            + "category_id INT, "
            + "price DOUBLE(7,2),"
            + "name_product VARCHAR(255),"
            + "part_number VARCHAR(255),"
            + "brand_id VARCHAR(255))"
            );
            statement.close();
        }
    }

    private void createTableCategory() throws SQLException {
        if (connection != null){
            Statement statement = connection.createStatement();
            statement.execute("CREATE TABLE IF NOT EXISTS Category("
               +"id INT PRIMARY KEY AUTO_INCREMENT,"
               +"category VARCHAR(255))"
            );
            statement.close();

        }
    }

    private void createTableBrand() throws SQLException {
        if (connection != null){
            Statement statement = connection.createStatement();
            statement.execute("CREATE TABLE IF NOT EXISTS Brand("
                +"id INT PRIMARY KEY AUTO_INCREMENT,"
                +"brand VARCHAR(255),"
                +"country_id VARCHAR(255))"
            );
            statement.close();
        }
    }

    private void createTableCountry() throws SQLException {
        if (connection != null){
            Statement statement = connection.createStatement();
            statement.execute("");
            statement.close();
        }
    }


}
