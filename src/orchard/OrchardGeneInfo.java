/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package orchard;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Chris
 */
public class OrchardGeneInfo extends javax.swing.JFrame {

    /**
     * Creates new form CilantroGeneInfo
     */
    public OrchardGeneInfo() {
        initComponents();
        addActionListeners();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        confirmKOButtonGroup = new javax.swing.ButtonGroup();
        functionLabel = new javax.swing.JLabel();
        functionField = new javax.swing.JLabel();
        geneNameLabel = new javax.swing.JLabel();
        geneField = new javax.swing.JLabel();
        plateInfoLabel = new javax.swing.JLabel();
        plateNameField = new javax.swing.JLabel();
        viewTfnButton = new javax.swing.JButton();
        tfnSelectionPanel = new javax.swing.JScrollPane();
        tfnSelectionList = new javax.swing.JList();
        coordinatesLabel = new javax.swing.JLabel();
        startLabel = new javax.swing.JLabel();
        stopLabel = new javax.swing.JLabel();
        startLocationField = new javax.swing.JLabel();
        stopLocationField = new javax.swing.JLabel();
        confirmKOLabel = new javax.swing.JLabel();
        koStatusField = new javax.swing.JLabel();
        titleLable = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        functionLabel.setText("Function:");

        functionField.setText("hypothetical protein");

        geneNameLabel.setText("Gene:");

        geneField.setText("MS_0001");

        plateInfoLabel.setText("Plate:");

        plateNameField.setText("YFG");

        viewTfnButton.setText("View Transformation Info");

        tfnSelectionList.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        tfnSelectionPanel.setViewportView(tfnSelectionList);

        coordinatesLabel.setText("Coordinates");

        startLabel.setText("Start:");

        stopLabel.setText("Stop:");

        startLocationField.setText("1000");

        stopLocationField.setText("1500");

        confirmKOLabel.setText("Confirmed KO?");

        koStatusField.setText("jLabel1");

        titleLable.setFont(new java.awt.Font("Ubuntu", 1, 24)); // NOI18N
        titleLable.setText("Gene Info");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(plateInfoLabel)
                            .addComponent(functionLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(plateNameField)
                            .addComponent(functionField))
                        .addGap(220, 220, 220))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(coordinatesLabel)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(confirmKOLabel, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(stopLabel)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(stopLocationField)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(startLabel)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(startLocationField)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(koStatusField))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(32, 32, 32)
                                .addComponent(geneNameLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(geneField)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tfnSelectionPanel)
                            .addComponent(viewTfnButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(166, 166, 166)
                .addComponent(titleLable)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(titleLable)
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(viewTfnButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(functionLabel)
                                    .addComponent(functionField))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(plateInfoLabel)
                                    .addComponent(plateNameField))
                                .addGap(26, 26, 26)
                                .addComponent(coordinatesLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(startLabel)
                                    .addComponent(startLocationField))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(stopLabel)
                                    .addComponent(stopLocationField))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(confirmKOLabel)
                                    .addComponent(koStatusField)))
                            .addComponent(tfnSelectionPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(geneNameLabel)
                        .addComponent(geneField)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(OrchardGeneInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(OrchardGeneInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(OrchardGeneInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(OrchardGeneInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            private int locus;

            public void run() {
                new OrchardGeneInfo().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup confirmKOButtonGroup;
    private javax.swing.JLabel confirmKOLabel;
    private javax.swing.JLabel coordinatesLabel;
    private javax.swing.JLabel functionField;
    private javax.swing.JLabel functionLabel;
    private javax.swing.JLabel geneField;
    private javax.swing.JLabel geneNameLabel;
    private javax.swing.JLabel koStatusField;
    private javax.swing.JLabel plateInfoLabel;
    private javax.swing.JLabel plateNameField;
    private javax.swing.JLabel startLabel;
    private javax.swing.JLabel startLocationField;
    private javax.swing.JLabel stopLabel;
    private javax.swing.JLabel stopLocationField;
    private javax.swing.JList tfnSelectionList;
    private javax.swing.JScrollPane tfnSelectionPanel;
    private javax.swing.JLabel titleLable;
    private javax.swing.JButton viewTfnButton;
    // End of variables declaration//GEN-END:variables

    private void addActionListeners() {
        GeneInfoActionListener listener = new GeneInfoActionListener();

        viewTfnButton.addActionListener(listener);
    }

    public void setFunctionField(String value) {
        functionField.setText(value);
    }

    public void setGeneField(String value) {
        geneField.setText(value);
    }

    public void setKoStatusField(String value) {
        koStatusField.setText(value);
    }

    public void setPlateNameField(String value) {
        plateNameField.setText(value);
    }

    public void setStartLocationField(String value) {
        startLocationField.setText(value);
    }

    public void setStopLocationField(String value) {
        stopLocationField.setText(value);
    }

    class GeneInfoActionListener implements ActionListener {

        private DatabaseConnector connection = null;
        private Connection dbConnection = null;

        private void connectToDatabase() {

            try {
                connection = new DatabaseConnector();
                dbConnection = connection.connectDB();
            } catch (Exception e) {
                System.out.println("Unable to connect to database");
            }
        }

        private void disconnectFromDatabase() throws SQLException {
            connection.closeDBConnection(dbConnection);
        }

        @Override
        public void actionPerformed(ActionEvent e) {

            Object source = e.getSource();

            if (source == viewTfnButton) {
                //get selected from list
                OrchardTransformationInfo tfnInfo = new OrchardTransformationInfo();
                DatabaseConnector dbConnector = new DatabaseConnector();
                ResultSet rs = null;
                Connection dbConnection = null;
                try {
                    dbConnection = dbConnector.connectDB();
                    
                    
                    //statement
                    //execute statement
                    //get results set
                    
                    
                    
                    
                    
                } catch (SQLException ex) {
                    Logger.getLogger(OrchardGeneInfo.class.getName()).log(Level.SEVERE, null, ex);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(OrchardGeneInfo.class.getName()).log(Level.SEVERE, null, ex);
                }
                finally{
                    try {
                        dbConnector.closeDBConnection(dbConnection);
                    } catch (SQLException ex) {
                        Logger.getLogger(OrchardGeneInfo.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                /*try {
                    //query
                    dbConnector.closeDBConnection(dbConnection);
                } catch (SQLException ex) {
                    Logger.getLogger(OrchardGeneInfo.class.getName()).log(Level.SEVERE, null, ex);
                }*/
                String value = "";
                tfnInfo.setBatchField(value);
                tfnInfo.setCompCellTypeField(value);
                tfnInfo.setEfficiencyField(value);
                tfnInfo.setEndPgField(value);
                tfnInfo.setMethodField(value);
                tfnInfo.setNotebookNumberField(value);
                tfnInfo.setPlasmidTypeField(value);
                tfnInfo.setStartPgField(value);

                tfnInfo.setVisible(true);
                
            } else {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

        }

    }

}
