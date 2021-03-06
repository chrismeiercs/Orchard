/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package orchard;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author seaadmin
 */
public class OrchardGeneStats extends javax.swing.JFrame {

    /**
     * Creates new form GeneStats
     */
    public OrchardGeneStats() {
        initComponents();
        addListeners();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        locusTagLabel = new javax.swing.JLabel();
        colonyLabel = new javax.swing.JLabel();
        timeConstantLabel = new javax.swing.JLabel();
        sharedLabel = new javax.swing.JLabel();
        sharedWithLabel = new javax.swing.JLabel();
        tfnNumLabel = new javax.swing.JLabel();
        koProdLabel = new javax.swing.JLabel();
        numOfColoniesField = new javax.swing.JLabel();
        tfnNumField = new javax.swing.JLabel();
        koProducedField = new javax.swing.JLabel();
        timeConstantField = new javax.swing.JLabel();
        sharedField = new javax.swing.JLabel();
        sharedWithField = new javax.swing.JLabel();
        showGeneInfoButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        locusTagLabel.setFont(new java.awt.Font("Ubuntu", 1, 24)); // NOI18N
        locusTagLabel.setText("locus");

        colonyLabel.setText("Number of Colonies: ");

        timeConstantLabel.setText("Time Constant (ms):");

        sharedLabel.setText("Shared?");

        sharedWithLabel.setText("Shared With:");

        tfnNumLabel.setText("Tfn Number:");

        koProdLabel.setText("KO Produced:");

        numOfColoniesField.setText("jLabel6");

        tfnNumField.setText("ss");

        koProducedField.setText("jLabel6");

        timeConstantField.setText("jLabel6");

        sharedField.setText("jLabel6");

        sharedWithField.setText("jLabel6");

        showGeneInfoButton.setText("Show Gene Info");
        showGeneInfoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showGeneInfoButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(201, 201, 201)
                        .addComponent(locusTagLabel))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap(19, Short.MAX_VALUE)
                                .addComponent(timeConstantLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(timeConstantField)
                                .addGap(26, 26, 26))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addContainerGap()
                                        .addComponent(colonyLabel)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(numOfColoniesField))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(66, 66, 66)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(sharedWithLabel)
                                            .addComponent(sharedLabel))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(sharedField)
                                            .addComponent(sharedWithField))))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(44, 44, 44)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(koProdLabel)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(koProducedField))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(tfnNumLabel)
                                        .addGap(18, 18, 18)
                                        .addComponent(tfnNumField))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(61, 61, 61)
                                .addComponent(showGeneInfoButton)))))
                .addContainerGap(55, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(locusTagLabel)
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(colonyLabel)
                    .addComponent(numOfColoniesField)
                    .addComponent(tfnNumLabel)
                    .addComponent(tfnNumField))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(timeConstantLabel)
                    .addComponent(koProdLabel)
                    .addComponent(koProducedField)
                    .addComponent(timeConstantField))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sharedLabel)
                    .addComponent(sharedField))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sharedWithLabel)
                    .addComponent(sharedWithField))
                .addGap(0, 17, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(showGeneInfoButton)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void showGeneInfoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showGeneInfoButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_showGeneInfoButtonActionPerformed

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
            java.util.logging.Logger.getLogger(OrchardGeneStats.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(OrchardGeneStats.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(OrchardGeneStats.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(OrchardGeneStats.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new OrchardGeneStats().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel colonyLabel;
    private javax.swing.JLabel koProdLabel;
    private javax.swing.JLabel koProducedField;
    private javax.swing.JLabel locusTagLabel;
    private javax.swing.JLabel numOfColoniesField;
    private javax.swing.JLabel sharedField;
    private javax.swing.JLabel sharedLabel;
    private javax.swing.JLabel sharedWithField;
    private javax.swing.JLabel sharedWithLabel;
    private javax.swing.JButton showGeneInfoButton;
    private javax.swing.JLabel tfnNumField;
    private javax.swing.JLabel tfnNumLabel;
    private javax.swing.JLabel timeConstantField;
    private javax.swing.JLabel timeConstantLabel;
    // End of variables declaration//GEN-END:variables
    
    /*koProducedField
    numOfColoniesField
    sharedField
    sharedWithField
    tfnNumField
    */
    
    public void setLocusTag(String value){
        locusTagLabel.setText(value);
    }
    
    public void setTimeConstant(String value){
        timeConstantField.setText(value);
    }
    
    public void setKOProduced(String value){
        koProducedField.setText(value);
    }
    
    public void setColonyCount(String value){
        numOfColoniesField.setText(value);
    }
    
    public void setShared(String value){
        sharedField.setText(value);
    }
    
    public void setSharedWith(String value){
        sharedWithField.setText(value);
    }
    
    public void setTfnNum(String value){
        tfnNumField.setText(value);
    }
    
    private void addListeners(){
        showGeneInfoButton.addActionListener(new GeneStatsActionListener());
        
    }
    class GeneStatsActionListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            
            Object source = e.getSource();
            
            if(source == showGeneInfoButton){
                OrchardGeneInfo geneInfo = new OrchardGeneInfo();
                //dbquery
                /*geneInfo.setFunctionField(null);
                geneInfo.setStopLocationField(null);
                geneInfo.setGeneField(null);
                geneInfo.setKoStatusField(null);
                geneInfo.setPlateNameField(null);
                geneInfo.setStartLocationField(null);
                geneInfo.setStopLocationField(null);
                geneInfo.setVisible(true);*/
                geneInfo.setVisible(true);
            }
            
            
            else{
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }   
            
        }

    }


}
