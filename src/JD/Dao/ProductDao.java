package JD.Dao;

import JD.Entity.Product;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * Created by SCIP on 26.07.2016.
 */
public class ProductDao {
    Connection connection = SingleConnection.INSTANCE.getConnection();

    public void create(Product product){
        try {
            PreparedStatement preparedStatement = connection.prepareStatement("INSERT INTO " +
                    "Product(category_id, price, name_product, part_number, brand_id, country_id) VALUES (?)");
            preparedStatement.setInt(1, product.getIdCategory());
            preparedStatement.setBigDecimal(1, product.getPrice());
            preparedStatement.setString(1, product.getName());
            preparedStatement.setString(1, product.getPartNumber());
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
