package Dao;

import DateBase.Db;
import model.County;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class CountryRepository {
    private final Connection connection;

    public CountryRepository() throws SQLException {
        connection = new Db().getConnection();
    }

    public void createTable() throws SQLException {
        String str =
                """
                        create table if not  exists countries(
                        id serial primary key,
                        title varchar,
                        population int );
                        """;
        Statement statement = connection.createStatement();
        statement.execute(str);
        System.out.printf("ankara Messi!!!!!");
        statement.close();

    }
    public String saveCountry(County county)throws SQLException{
        PreparedStatement statement = connection.prepareStatement("insert  into countries (title,population)values (?,?);");
        statement.setString(1,county.getTitle());
        statement.setInt(2,county.getPopulation());
        statement.execute();
        statement.close();
        return "Suiiii";
    }
}