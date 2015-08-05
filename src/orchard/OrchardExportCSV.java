/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package orchard;

import au.com.bytecode.opencsv.CSVWriter;
import java.util.List;
import java.sql.Statement;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JList;
import javax.swing.ListModel;

/**
 *
 * @author seaadmin
 */
public class OrchardExportCSV {

    private String csvFileName;
    private ListModel queryIDs;
    private Connection dbConnection;
    private CSVWriter writer;

    public OrchardExportCSV(String fileName, JList IDs) throws IOException, SQLException {
        DatabaseConnector dbConnector = new DatabaseConnector() ;
        dbConnection = null;
        try {
           
            dbConnection = dbConnector.connectDB();
            System.out.println(dbConnection);
        } catch (Exception e) {
            System.out.println("Unable to connect to database: " + e);
        }

        try {
            csvFileName = fileName;
            
            queryIDs = IDs.getModel();
            
            System.out.println("About to write csv");
            writeCSV();
            writer.close();
             System.out.println("CSV Written");
        } catch (Exception e) {
            System.out.println("Exception: " + e);
        } finally {
            dbConnector.closeDBConnection(dbConnection);
        }
    }

    private void writeCSV() throws IOException, SQLException {
         writer = new CSVWriter(new FileWriter("csvFileName" + ".csv"));

        for(int i =0; i < queryIDs.getSize();i++){
            
            
            String[][] qq = retrieveInfo(queryIDs.getElementAt(i).toString());
            for(int j=0; j< qq.length; j++){
                String[] row = qq[j];
                writer.writeNext(row);
            }
             
        }

    }

    private String[][] retrieveInfo(String id) throws SQLException {
        
        String[][] info = null;
        Statement stmt = null;
        String query = "Select * from Transformation_has_Gene where Gene_Locus='" + id+"'";
        
        System.out.println(query);
        try {
            
            stmt = dbConnection.createStatement();
            
            ResultSet rs = stmt.executeQuery(query);
            int columnCount = rs.getMetaData().getColumnCount();
            int rowCount = this.getNumberOfRows(rs) + 1;
            info = new String[rowCount][columnCount];
            //add in column names
            for(int m = 1; m < columnCount+1; m++){
                info[0][m-1] = rs.getMetaData().getColumnName(m);  
            }
            
            
            
            System.out.println("Column count: " + columnCount);
            
         
            int i=1;
            while(rs.next()){
                for(int k = 1; k < columnCount+1; k++) {
                    System.out.println(rs.getObject(k).toString());
                    info[i][k-1] = rs.getObject(k).toString();
                    
                }
                i++;
            }
            
           

        } catch (SQLException e) {

            System.out.println("SQL " +e);
        } finally {
            if (stmt != null) {
                stmt.close();
            }
        }
        
        return info;
    }
    
    public int getNumberOfRows(ResultSet res){
    int totalRows = 0;
    try {
        res.last();
        totalRows = res.getRow();
        res.beforeFirst();
    } 
    catch(Exception ex)  {
        return 0;
    }
    return totalRows ;    
}

}
