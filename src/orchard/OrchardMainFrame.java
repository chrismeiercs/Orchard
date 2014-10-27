/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package orchard;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JList;

/**
 *
 * @author Chris
 */
public class OrchardMainFrame extends javax.swing.JFrame {

    /**
     * Creates new form CilantroMainFrame
     */
    public OrchardMainFrame() throws SQLException {
        initComponents();
        addActionListeners();
        setPlateSelection();
        setGeneList();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        plateSelection = new javax.swing.JComboBox();
        geneSelectionPanel = new javax.swing.JScrollPane();
        geneSelectionList = new javax.swing.JList();
        geneListLabel = new javax.swing.JLabel();
        plateSelectionLabel = new javax.swing.JLabel();
        newTransformationButton = new javax.swing.JButton();
        exportButton = new javax.swing.JButton();
        importButton = new javax.swing.JButton();
        selectedGenePanel = new javax.swing.JScrollPane();
        selectedGeneList = new javax.swing.JList<String>();
        selectedGenesLabel = new javax.swing.JLabel();
        selectButton = new javax.swing.JButton();
        cilantroLabel = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        deselectButton = new javax.swing.JButton();
        viewGeneInfoButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        plateSelection.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        plateSelection.setPreferredSize(new java.awt.Dimension(116, 27));

        geneSelectionList.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        geneSelectionPanel.setViewportView(geneSelectionList);

        geneListLabel.setText("Genes:");

        plateSelectionLabel.setText("Plate Selection");

        newTransformationButton.setText("New Transformation");

        exportButton.setText("Export to CSV");
        exportButton.setPreferredSize(new java.awt.Dimension(140, 29));

        importButton.setText("Import New Plate");

        selectedGeneList.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        selectedGenePanel.setViewportView(selectedGeneList);

        selectedGenesLabel.setText("Selected:");

        selectButton.setText("Select");
        selectButton.setPreferredSize(new java.awt.Dimension(97, 29));

        cilantroLabel.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        cilantroLabel.setText(" Orchard");

        jLabel1.setText("jLabel1");

        deselectButton.setText("Deselect");
        deselectButton.setPreferredSize(new java.awt.Dimension(97, 29));

        viewGeneInfoButton.setText("View Gene Info");
        viewGeneInfoButton.setPreferredSize(new java.awt.Dimension(140, 29));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(geneSelectionPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(newTransformationButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(importButton)
                .addGap(70, 70, 70))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(cilantroLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(59, 59, 59)
                            .addComponent(geneListLabel))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(218, 218, 218)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(viewGeneInfoButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(exportButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(plateSelection, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(11, 11, 11))))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addGap(37, 37, 37)
                            .addComponent(plateSelectionLabel))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(61, 61, 61)
                            .addComponent(selectButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addComponent(selectedGenePanel, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 55, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(selectedGenesLabel)
                                .addGap(100, 100, 100))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(deselectButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(83, 83, 83))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cilantroLabel)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(importButton)
                    .addComponent(newTransformationButton))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(geneListLabel)
                            .addComponent(plateSelectionLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(geneSelectionPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(plateSelection, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(35, 35, 35)
                                .addComponent(exportButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(viewGeneInfoButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(selectedGenesLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(selectedGenePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(selectButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(deselectButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(41, Short.MAX_VALUE))
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
            java.util.logging.Logger.getLogger(OrchardMainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(OrchardMainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(OrchardMainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(OrchardMainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new OrchardMainFrame().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(OrchardMainFrame.class.getName()).log(Level.SEVERE, null, ex);
                }

            }
        });

    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel cilantroLabel;
    private javax.swing.JButton deselectButton;
    private javax.swing.JButton exportButton;
    private javax.swing.JLabel geneListLabel;
    private javax.swing.JList geneSelectionList;
    private javax.swing.JScrollPane geneSelectionPanel;
    private javax.swing.JButton importButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton newTransformationButton;
    private javax.swing.JComboBox plateSelection;
    private javax.swing.JLabel plateSelectionLabel;
    private javax.swing.JButton selectButton;
    private javax.swing.JList<String> selectedGeneList;
    private javax.swing.JScrollPane selectedGenePanel;
    private javax.swing.JLabel selectedGenesLabel;
    private javax.swing.JButton viewGeneInfoButton;
    // End of variables declaration//GEN-END:variables

    public JList getSelectedJList() {
        return selectedGeneList;
    }

    private void addActionListeners() {
        MainFrameActionListener listener = new MainFrameActionListener();

        newTransformationButton.addActionListener(listener);
        importButton.addActionListener(listener);
        exportButton.addActionListener(listener);
        selectButton.addActionListener(listener);
        viewGeneInfoButton.addActionListener(listener);
        plateSelection.addActionListener(listener);
    }

    private void setGeneList() {

        DatabaseConnector dbConnector = new DatabaseConnector();
        ResultSet rs = null;
        Connection dbConnection = null;
        try {
            dbConnection = dbConnector.connectDB();

            PreparedStatement stmt = dbConnection.prepareStatement("Select Locus from Gene");
            rs = stmt.executeQuery();
            geneSelectionList.removeAll();
            DefaultListModel geneSelectionListModel = new DefaultListModel();
            while (rs.next()) {
                //System.out.println(rs.getString("idPlate"));

                geneSelectionListModel.addElement(rs.getString("Locus"));

            }
            geneSelectionList.setModel(geneSelectionListModel);
        } catch (SQLException | ClassNotFoundException f) {

            System.out.println(f);
        } finally {
            try {
                dbConnector.closeDBConnection(dbConnection);
            } catch (SQLException ex) {
                Logger.getLogger(OrchardMainFrame.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    private void setPlateSelection() throws SQLException {
        DatabaseConnector dbConnector = new DatabaseConnector();
        ResultSet rs = null;
        Connection dbConnection = null;
        try {
            dbConnection = dbConnector.connectDB();
            PreparedStatement stmt = dbConnection.prepareStatement("Select idPlate from Plate");
            rs = stmt.executeQuery();
            plateSelection.removeAllItems();
            plateSelection.addItem("All");
            while (rs.next()) {
                //System.out.println(rs.getString("idPlate"));

                plateSelection.addItem(rs.getString("idPlate"));
            }
        } catch (Exception e) {
            //System.out.println("Unable to connect 1");
            System.out.println(e);
        } finally {
            dbConnector.closeDBConnection(dbConnection);
        }
    }

    public class MainFrameActionListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {

            Object source = e.getSource();

            if (source == newTransformationButton) {
                new OrchardNewTransformation().setVisible(true);
            }

            if (source == importButton) {
                try {
                    new OrchardCSVFileOpener().setVisible(true);
                } catch (IOException ex) {
                    Logger.getLogger(OrchardMainFrame.class.getName()).log(Level.SEVERE, null, ex);
                } catch (SQLException ex) {
                    Logger.getLogger(OrchardMainFrame.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

            if (source == exportButton) {
                new OrchardCSVFileSaver(selectedGeneList).setVisible(true);
            }

            if (source == viewGeneInfoButton) {
                new OrchardGeneInfo().setVisible(true);
            }

            if (source == plateSelection) {
                //System.out.println("yes");
                String id = (String) plateSelection.getSelectedItem();
                //System.out.println(id);
                //case for "All"
                DatabaseConnector dbConnector = new DatabaseConnector();
                ResultSet rs = null;
                Connection dbConnection = null;
                PreparedStatement stmt = null;
                if (id != null){
                    try {
                    dbConnection = dbConnector.connectDB();
                    
                    if (id.equals("All")) {
                        stmt = dbConnection.prepareStatement("Select Locus from Gene");
                    } else if(!id.equals(null)) {
                        stmt = dbConnection.prepareStatement("Select Locus from Gene WHERE Plate_idPlate = '" + id + "'");
                    }
                    else{
                        id = "None";
                    }
                    rs = stmt.executeQuery();
                    geneSelectionList.removeAll();
                    DefaultListModel geneSelectionListModel = new DefaultListModel();
                    while (rs.next()) {
                        //System.out.println(rs.getString("idPlate"));

                        geneSelectionListModel.addElement(rs.getString("Locus"));

                    }
                    geneSelectionList.setModel(geneSelectionListModel);
                } catch (SQLException | ClassNotFoundException f) {
                    System.out.println("Unable to connect 2");
                    //System.out.println(f);
                } finally {
                    try {
                        dbConnector.closeDBConnection(dbConnection);
                    } catch (SQLException ex) {
                        Logger.getLogger(OrchardMainFrame.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                }
                

            } 
            
            if(source == selectButton){
                //item = geneList.getSelected();
                //gene = geneList.getContents().remove(item(=);
                //selectedList.getContents().addElement(item);
            }
            
            if(source == deselectButton){
                //item = selectedList.getSelected();
                //selected = selectedList.getContents().remove(item);
                //geneList.getContents().addElement(item);
            }
            
            
            
            else {
                //System.out.println("Button not supported");
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.

            }

        }

    }

}
