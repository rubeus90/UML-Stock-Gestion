/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stockgestion.UI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;

/**
 *
 * @author rubeus
 */
public class InterfaceUtilisateur extends javax.swing.JFrame {
    private static InterfaceUtilisateur instance = null;

    private InterfaceUtilisateur() {
        initComponents();
        addActionListeners();
        setTitle("Home");
    }
    
    public static InterfaceUtilisateur getInstance(){
        if(instance == null){
            instance = new InterfaceUtilisateur();
        }
        return instance;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        produitACommander = new javax.swing.JButton();
        inventaire = new javax.swing.JButton();
        ajouterArticle = new javax.swing.JButton();
        caisse = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        produitACommander.setText("Produits à commander");

        inventaire.setText("Inventaire");

        ajouterArticle.setText("Ajouter un article");

        caisse.setText("Caisse");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(319, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(caisse, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(ajouterArticle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(inventaire, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(produitACommander, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(321, 321, 321))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(86, 86, 86)
                .addComponent(produitACommander, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60)
                .addComponent(inventaire, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54)
                .addComponent(ajouterArticle, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(58, 58, 58)
                .addComponent(caisse, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(99, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addActionListeners(){
        ajouterArticle.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                AjouterArticle.getInstance().setVisible(true);
                InterfaceUtilisateur.this.setVisible(false);
            }
        });
        
        inventaire.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                Inventaire.getInstance().setVisible(true);
                InterfaceUtilisateur.this.setVisible(false);
            }
        });
        
        produitACommander.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                CommanderProduit.getInstance().setVisible(true);
                InterfaceUtilisateur.this.setVisible(false);
            }
        });
        
        caisse.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                Caisse.getInstance().setVisible(true);
                InterfaceUtilisateur.this.setVisible(false);
            }
        });
    }
    
    public void retournerEcranAccueil(JFrame frame){
        frame.setVisible(false);
        this.setVisible(true);
        stockgestion.StockGestion.getInstance().refreshUI();
    }
    
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
            java.util.logging.Logger.getLogger(InterfaceUtilisateur.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InterfaceUtilisateur.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InterfaceUtilisateur.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InterfaceUtilisateur.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InterfaceUtilisateur().setVisible(true);
                stockgestion.StockGestion.getInstance();
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ajouterArticle;
    private javax.swing.JButton caisse;
    private javax.swing.JButton inventaire;
    private javax.swing.JButton produitACommander;
    // End of variables declaration//GEN-END:variables
}
