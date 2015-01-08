/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package orchard;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author seaadmin
 */
public class DatabaseConnector {
    
    public Connection connectDB() throws SQLException, ClassNotFoundException {
        Class.forName("com.mysql.jdbc.Driver");
        String dbURL = "jdbc:mysql://127.0.0.1:3306/OrchardDB";
        String username = "root";
        String password = "phage";
        
        Connection dbCon = null;
        
        
        try{
            dbCon = DriverManager.getConnection(dbURL, username, password);
            System.out.println("Success!");
        }
        catch(SQLException e){
            System.out.println(e);
            System.out.println("Unable to connect to the database");
            
        }
        
        return dbCon;
    }
    
    public void closeDBConnection(Connection connection) throws SQLException{
        //connection.close();
        System.out.println("Close Successful");
    }
    
    public void deposit(Connection connection,String statement) throws SQLException{
        /*Statement stmt = connection.prepareStatement(statement);
        stmt.executeQuery(statement);*/
        System.out.println("Deposit Successful!");
    }
    
    
    
    
}
