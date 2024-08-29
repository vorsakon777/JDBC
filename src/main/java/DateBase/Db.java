package DateBase;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Db {
    private final Connection connection;

    public Db() throws SQLException{
    connection = DriverManager.getConnection(
         "jdbc:postgresql://localhost:5432/postgres",
         "postgres",
            "nurbek.2008"
    );

}
public Connection getConnection(){
        return connection;
}
}
