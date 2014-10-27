/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package orchard;

import au.com.bytecode.opencsv.CSVReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;

/**
 *
 * @author seaadmin
 */
public class OrchardImportCSV {

    private Connection dbConnection = null;
    private DatabaseConnector dbConnector = null;

    public OrchardImportCSV(File csvFile) throws FileNotFoundException, IOException, SQLException {

        try {
            dbConnector = new DatabaseConnector();
            dbConnection = dbConnector.connectDB();
            dbConnector.closeDBConnection(dbConnection);
        } catch (Exception e) {
            System.out.println("Unable to connect to database");
        }

        try {
            getInformation(new CSVReader(new FileReader(csvFile)));
        } catch (Exception e) {
            System.out.println("Unable to read CSV: " + e);
        } finally {
            dbConnector.closeDBConnection(dbConnection);
        }

    }

    private void getInformation(CSVReader csv) throws IOException {
        String[] substrateInfo;

        while ((substrateInfo = csv.readNext()) != null) {
            depositDB(substrateInfo[0], substrateInfo[1], substrateInfo[2], substrateInfo[3],
                    substrateInfo[4]);
        }
    }

    private void depositDB(String gene, String wellNumber, String concentration, String units,
            String function) {

        String query = "insert into dbName values " + gene + wellNumber + concentration + units + function;
        //deposit info with sql
    }

}
