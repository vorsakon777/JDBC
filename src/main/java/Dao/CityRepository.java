package Dao;

import DateBase.Db;
import model.City;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class CityRepository {
private final Connection connection;

public CityRepository() throws SQLException{
    connection= new Db().getConnection();

    }
    public void createTable() throws SQLException{
        PreparedStatement statement =connection .prepareStatement("create table if not exists city("+
                "id serial primary key,"+
                "title varchar);");
        statement.execute();
        statement.close();
    }
    public String saveSity(City city) throws SQLException{
    PreparedStatement statement = connection.prepareStatement("insert into city (title) values(?)");
    statement.setString(1,city.getTitle());
    statement.execute();
    statement.close();
    return "successfully saved ✔️";
    }
}

