package Dao;

import DateBase.Db;
import model.Measures;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class MeasuresRepostory {
    private Connection connection;

    public MeasuresRepostory() throws SQLException {
        connection = new Db().getConnection();
    }


    public void createTable() throws SQLException {
        String str =
                """
            create table if not exists measures(
            id serial primary key,
            name varchar,
            age int,
            ownCity varchar
            );
    """;
        Statement statement = connection.createStatement();
        statement.execute(str);
        System.out.println("ankara Messiii!!!");
        statement.close();
    }

    public  String saveCountry(Measures measures) throws SQLException {
        PreparedStatement statement = connection.prepareStatement("insert into measures(name,age,ownCity) values(?,?,?);");
        statement.setString(1, measures.getName());
        statement.setInt(2,measures.getAge());
        statement.setString(3,measures.getOwnCity());
        statement.execute();
        statement.close();
        return "Siuuuuu";
    }
}

