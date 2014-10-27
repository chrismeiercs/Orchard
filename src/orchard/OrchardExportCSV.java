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
    private List queryIDs;
    //private String queryIDs;
    private Connection dbConnection;

    public OrchardExportCSV(String fileName, JList IDs) throws IOException, SQLException {
        DatabaseConnector dbConnector = new DatabaseConnector() ;
        Connection dbConnection = null;
        try {
           
            dbConnection = dbConnector.connectDB();
        } catch (Exception e) {
            System.out.println("Unable to connect to database: " + e);
        }

        try {
            csvFileName = fileName;
            //Object queryIDs = new Object[IDs.getSelectedValues().length];
            queryIDs = IDs.getSelectedValuesList();
            writeCSV();
        } catch (Exception e) {
            System.out.println("Exception: " + e);
        } finally {
            dbConnector.closeDBConnection(dbConnection);
        }
    }

    private void writeCSV() throws IOException, SQLException {
        CSVWriter writer = new CSVWriter(new FileWriter(csvFileName + ".csv"));

        for (Object id : queryIDs) {
            writer.writeNext(retrieveInfo(id.toString()));
        }

    }

    private String[] retrieveInfo(String id) throws SQLException {
        String[] info = null;
        Statement stmt = null;
        String query = "Select * from dbName where ID=" + id;

        try {
            stmt = dbConnection.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            int columnCount = rs.getMetaData().getColumnCount();

            for (int i = 0; i < columnCount; i++) {
                info[i] = rs.getObject(i).toString();
            }

        } catch (SQLException e) {

            System.out.println(e);
        } finally {
            if (stmt != null) {
                stmt.close();
            }
        }

        return info;
    }

}
