package JD.Dao;

import JD.Entity.Country;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by SCIP on 26.07.2016.
 */
public class CountryDao {
    Connection connection = SingleConnection.INSTANCE.getConnection();

    public void createCountry(Country country){
        try {
            PreparedStatement preparedStatement = connection.prepareStatement("INSERT INTO Country(NAME) VALUES (?)");
            String name = country.getName();
            preparedStatement.setString(1, name);
            preparedStatement.executeUpdate();
            preparedStatement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public Country readOne(int id){
        try {
            PreparedStatement preparedStatement = connection.prepareStatement("SELECT * FROM Country WHERE id = ?");
            preparedStatement.setInt(1, id);
            ResultSet resultSet = preparedStatement.executeQuery();
            resultSet.next();
            String name = resultSet.getString("name");
            Country country = new Country(name);
            country.setId(id);
            preparedStatement.close();
            resultSet.close();
            return country;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public List<Country> readAll(){
        List<Country> countryList = new ArrayList<>();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement("SELECT * FROM Country");
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()){
                String name = resultSet.getString("name");
                int id = resultSet.getInt("id");
                Country country = new Country(name);
                country.setId(id);
                countryList.add(country);
            }
            preparedStatement.close();
            resultSet.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return countryList;
    }
}
