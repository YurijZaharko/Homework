package JD.Dao;

import JD.Entity.Category;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by SCIP on 26.07.2016.
 */
public class CategoryDao {
    private final Connection connection = SingleConnection.INSTANCE.getConnection();

    public void create(Category category){
        try {
            PreparedStatement preparedStatement = connection.prepareStatement("INSERT INTO Category(NAME) VALUES(?)");
            preparedStatement.setString(1, category.getName());
            preparedStatement.executeUpdate();
            preparedStatement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public Category readOne(int id){
        try {
            PreparedStatement preparedStatement = connection.prepareStatement("SELECT *FROM Category WHERE id = ?");
            preparedStatement.setInt(1, id);
            ResultSet resultSet = preparedStatement.executeQuery();
            resultSet.next();
            String name = resultSet.getString("name");
            Category category = new Category(name);
            category.setId(id);
            preparedStatement.close();
            resultSet.close();
            return category;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public List<Category> readAll(){
        List<Category> categoryList = new ArrayList<>();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement("SELECT * FROM Category");
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()){
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                Category category = new Category(name);
                category.setId(id);
                categoryList.add(category);
            }
            preparedStatement.close();
            resultSet.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return categoryList;
    }

}
