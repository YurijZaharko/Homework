package JD.Dao;

import JD.Entity.Brand;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by SCIP on 26.07.2016.
 */
public class BrandDao {
    private final Connection connection = SingleConnection.INSTANCE.getConnection();

    public void create(Brand brand){
        try {
            PreparedStatement preparedStatement = connection.prepareStatement("INSERT INTO Brand(NAME) VALUES(?)");
            preparedStatement.setString(1, brand.getName());
            preparedStatement.executeUpdate();
            preparedStatement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public Brand readOne(int id){
        try {
            PreparedStatement preparedStatement = connection.prepareStatement("SELECT * FROM Brand WHERE id = ?");
            preparedStatement.setInt(1, id);
            ResultSet resultSet = preparedStatement.executeQuery();
            resultSet.next();
            String name = resultSet.getString("name");
            Brand brand = new Brand(name);
            brand.setId(id);
            preparedStatement.close();
            resultSet.close();
            return brand;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public List<Brand> readAll(){
        List<Brand> brandList = new ArrayList<>();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement("SELECT * FROM Brand");
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()){
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                Brand brand = new Brand(name);
                brand.setId(id);
                brandList.add(brand);
            }
            preparedStatement.close();
            resultSet.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return brandList;
    }


}
