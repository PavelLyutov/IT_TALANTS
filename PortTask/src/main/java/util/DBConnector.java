package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnector {

    private static DBConnector instance;
    private Connection connection;
    private DBConnector(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        try {
            initConnection();
        } catch (SQLException throwables) {
            System.out.println("Error creating connection - " + throwables.getMessage());
        }
    }

    public static DBConnector getInstance(){
        if(instance == null){
            instance = new DBConnector();
        }
        return instance;
    }

    private void initConnection() throws SQLException {
        connection = DriverManager.getConnection("jdbc:mysql://84.238.145.199:7777/java_s12", "cadet", "survivor2021");
    }

    public Connection getConnection(){
        try {
            if(connection.isClosed()){
                initConnection();
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return connection;
    }


}
